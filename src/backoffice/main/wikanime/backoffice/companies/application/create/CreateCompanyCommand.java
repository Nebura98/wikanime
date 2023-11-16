package wikanime.backoffice.companies.application.create;

import wikanime.shared.domain.bus.command.Command;

public record CreateCompanyCommand(
        String id,
        String name,
        String president,
        String country,
        float lastYearIncome
) implements Command { }
