package wikanime.apps.backoffice.backend.controller.companies;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import wikanime.backoffice.companies.application.create.CreateCompanyCommand;
import wikanime.shared.domain.DomainError;
import wikanime.shared.domain.bus.command.CommandBus;
import wikanime.shared.domain.bus.command.CommandHandlerExecutionError;
import wikanime.shared.domain.bus.query.QueryBus;
import wikanime.shared.infrastructure.spring.ApiController;

@RestController
public final class CompanyPostController extends ApiController {
    public CompanyPostController(QueryBus queryBus, CommandBus commandBus) {
        super(queryBus, commandBus);
    }

    @PostMapping("CompanyPostController")
    public String index(@RequestBody Request request) throws CommandHandlerExecutionError {
        dispatch(new CreateCompanyCommand("", request.name(), request.president(), request.country(), request.lastYearIncome()));
        return "";
    }
    @Override
    public HashMap<Class<? extends DomainError>, HttpStatus> errorMapping() {
        return null;
    }
}

final class Request  {
    private String name;
    private String president;
    private String country;
    private float lastYearIncome;

    public void setName(String name){
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLastYearIncome(float lastYearIncome) {
        this.lastYearIncome = lastYearIncome;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    String name() {
        return name;
    }

    String president() {
        return president;
    }

    String country() {
        return country;
    }

    float lastYearIncome() {
        return lastYearIncome;
    }
}
