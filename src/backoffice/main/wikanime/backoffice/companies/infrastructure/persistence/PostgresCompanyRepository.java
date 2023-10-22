package wikanime.backoffice.companies.infrastructure.persistence;

import wikanime.backoffice.companies.domain.Company;
import wikanime.backoffice.companies.domain.CompanyId;
import wikanime.backoffice.companies.domain.CompanyRepository;

import java.util.List;
import java.util.Optional;


public final class PostgresCompanyRepository implements CompanyRepository {
    @Override
    public void save(Company company) {

    }

    @Override
    public Optional<Company> search(CompanyId id) {
        return Optional.empty();
    }

    @Override
    public List<Company> matching() {
        return null;
    }

    @Override
    public void update(CompanyId id, Company company) {

    }

    @Override
    public void disable(CompanyId id) {

    }

    @Override
    public void delete(CompanyId id) {

    }
}
