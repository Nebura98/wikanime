package wikanime.apps.backoffice.backend.controller.companies;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import wikanime.shared.domain.DomainError;
import wikanime.shared.domain.bus.command.CommandBus;
import wikanime.shared.domain.bus.command.CommandHandlerExecutionError;
import wikanime.shared.domain.bus.query.QueryBus;
import wikanime.shared.infrastructure.spring.ApiController;

import java.util.HashMap;

@RestController
public final class CompanyPostController extends ApiController {
    public CompanyPostController(QueryBus queryBus, CommandBus commandBus) {
        super(queryBus, commandBus);
    }

    @PostMapping("CompanyPostController")
    public String index(@RequestBody String body) throws CommandHandlerExecutionError {
        return "";
    }
    @Override
    public HashMap<Class<? extends DomainError>, HttpStatus> errorMapping() {
        return null;
    }
}
