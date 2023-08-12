package wikanime.backoffice.companies.application.create;

import wikanime.backoffice.companies.domain.*;

public final class CompanyCreator {
    private final CompanyRepository repository;

    public CompanyCreator(CompanyRepository repository) {
        this.repository = repository;
    }

    public void create(CompanyId id, CompanyName name, CompanyPresident president, CompanyCountry country, CompanyLastYearIncome lastYearIncome) {
        Company company = Company.create(id, name, president, country, lastYearIncome);

        repository.save(company);
    }
}
