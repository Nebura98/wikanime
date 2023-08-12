package wikanime.backoffice.companies.application.create;

import wikanime.shared.domain.bus.command.Command;

public final class CreateCompanyCommand implements Command {
    private final String id;
    private final String name;
    private final String president;
    private final String country;
    private final float lastYearIncome;

    public CreateCompanyCommand(String id, String name, String president, String country, float lastYearIncome) {
        this.id = id;
        this.name = name;
        this.president = president;
        this.country = country;
        this.lastYearIncome = lastYearIncome;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPresident() {
        return president;
    }

    public String getCountry() {
        return country;
    }

    public float getLastYearIncome() {
        return lastYearIncome;
    }
}
