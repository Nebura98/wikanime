package wikanime.backoffice.companies.application.create;

import wikanime.shared.domain.Service;
import wikanime.shared.domain.bus.command.CommandHandler;

@Service
public final class CreateCompanyCommandHandler implements CommandHandler<CreateCompanyCommand> {
    @Override
    public void handle(CreateCompanyCommand command) {

    }
}
