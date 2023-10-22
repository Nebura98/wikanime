package wikanime.backoffice.companies.domain;

import wikanime.shared.domain.AggregateRoot;

public final class Company extends AggregateRoot {
    private final CompanyId id;
    private final CompanyName name;
    private final CompanyPresident president;
    private final CompanyCountry country;
    private final CompanyLastYearIncome lastYearIncome;

    public Company(CompanyId id, CompanyName name, CompanyPresident president, CompanyCountry country, CompanyLastYearIncome lastYearIncome) {
        this.id = id;
        this.name = name;
        this.president = president;
        this.country = country;
        this.lastYearIncome = lastYearIncome;
    }

    private Company() {
        this.id = null;
        this.name = null;
        this.president = null;
        this.country = null;
        this.lastYearIncome = null;
    }

    public static Company create(CompanyId id, CompanyName name, CompanyPresident president, CompanyCountry country, CompanyLastYearIncome lastYearIncome) {
        Company company = new Company(id, name, president, country, lastYearIncome);

        company.record(new CompanyCreatedDomainEvent(id.value(), name.value(), president.value(), country.value(), lastYearIncome.value()));

        return company;
    }


    public CompanyId id() {
        return id;
    }

    public CompanyName name() {
        return name;
    }

    public CompanyPresident president() {
        return president;
    }

    public CompanyCountry country() {
        return country;
    }

    public CompanyLastYearIncome lastYearIncome() {
        return lastYearIncome;
    }

}


