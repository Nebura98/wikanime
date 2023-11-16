package wikanime.apps.backoffice.backend.controller.companies;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import wikanime.backoffice.companies.application.create.CreateCompanyCommand;
import wikanime.shared.domain.bus.command.CommandBus;
import wikanime.shared.domain.bus.command.CommandHandlerExecutionError;
import wikanime.shared.infrastructure.validation.ValidationResponse;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

@Controller
@CrossOrigin(origins = "*", methods = {RequestMethod.POST})
public final class CompanyPostController {
    private final CommandBus bus;

    public CompanyPostController(CommandBus bus) {
        this.bus = bus;
    }

    private final HashMap<String, String> rules = new HashMap<String, String>() {
        {
            put("id", "required|not_empty|uuid");
            put("name", "required|not_empty|string");
            put("duration", "required|not_empty|string");
        }
    };

    @PostMapping(value = "/companies", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public RedirectView index(@RequestParam HashMap<String, Serializable> request, RedirectAttributes attributes)
            throws Exception {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        CreateCompanyValidate validate = new CreateCompanyValidate(
                request.get("id").toString(),
                request.get("name").toString(),
                request.get("president").toString(),
                request.get("country").toString(),
                (float) request.get("lastYearIncome")
        );

        Set<ConstraintViolation<CreateCompanyValidate>> violations = validator.validate(validate);

        return violations.isEmpty()
                ? redirectWithErrors(violations, request, attributes)
                : createCourse(request);
    }

    private RedirectView redirectWithErrors(
            Set<ConstraintViolation<CreateCompanyValidate>> violations,
            HashMap<String, Serializable> request,
            RedirectAttributes attributes
    ) {
        attributes.addFlashAttribute("errors");
        attributes.addFlashAttribute("inputs", request);

        return new RedirectView("/companies");
    }

    private RedirectView createCourse(HashMap<String, Serializable> request) throws CommandHandlerExecutionError {
        bus.dispatch(
                new CreateCompanyCommand(
                        request.get("id").toString(),
                        request.get("name").toString(),
                        request.get("president").toString(),
                        request.get("country").toString(),
                        (float) request.get("lastYearIncome")
                )
        );

        return new RedirectView("/companies");
    }
}

final class CreateCompanyValidate {
    @NotNull(message = "Id cannot be null")
    private String id;

    @NotNull(message = "Name cannot be null")
    @Size(min = 5, max = 128, message = "Name should have a minimum long of 5 characters and maximum 128 characters")
    private String name;

    @NotNull(message = "President cannot be null")
    private String president;

    @NotNull(message = "Country cannot be null")
    private String country;

    @NotNull(message = "Income cannot be null")
    private float lastYearIncome;

    public CreateCompanyValidate(String id, String name, String president, String country, float lastYearIncome) {
        this.id = id;
        this.name = name;
        this.president = president;
        this.country = country;
        this.lastYearIncome = lastYearIncome;
    }

    public static String validate()
    {


        return "";
    }
}
