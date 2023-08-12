package wikanime.shared.infrastructure.spring;

import java.util.HashMap;

import org.springframework.http.HttpStatus;

import wikanime.shared.domain.DomainError;
import wikanime.shared.domain.bus.command.Command;
import wikanime.shared.domain.bus.command.CommandBus;
import wikanime.shared.domain.bus.command.CommandHandlerExecutionError;
import wikanime.shared.domain.bus.query.Query;
import wikanime.shared.domain.bus.query.QueryBus;
import wikanime.shared.domain.bus.query.QueryHandlerExecutionError;


public abstract class ApiController {
    private final QueryBus queryBus;
    private final CommandBus commandBus;

    public ApiController(QueryBus queryBus, CommandBus commandBus) {
        this.queryBus   = queryBus;
        this.commandBus = commandBus;
    }

    protected void dispatch(Command command) throws CommandHandlerExecutionError {
        commandBus.dispatch(command);
    }

    protected <R> R ask(Query query) throws QueryHandlerExecutionError {
        return queryBus.ask(query);
    }

    abstract public HashMap<Class<? extends DomainError>, HttpStatus> errorMapping();
}
