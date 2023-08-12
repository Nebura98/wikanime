package wikanime.backoffice.companies.application;

import wikanime.backoffice.companies.domain.Company;
import wikanime.shared.domain.bus.query.Response;

public class CompanyResponse implements Response {
    private final String id;
    private final String name;
    private final String president;
    private final String country;
    private final float lastYearIncome;

    public CompanyResponse(String id, String name, String president, String country, float lastYearIncome) {
        this.id = id;
        this.name = name;
        this.president = president;
        this.country = country;
        this.lastYearIncome = lastYearIncome;
    }

    public static CompanyResponse fromAggregate(Company company) {
        return new CompanyResponse(company.id().value(), company.name().value(), company.president().value(), company.country().value(), company.lastYearIncome().value());
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String president() {
        return president;
    }

    public String country() {
        return country;
    }

    public float lastYearIncome() {
        return lastYearIncome;
    }
}
