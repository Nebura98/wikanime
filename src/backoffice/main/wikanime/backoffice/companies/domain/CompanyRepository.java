package wikanime.backoffice.companies.domain;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository {
    void save(Company company);

    Optional<Company> search(CompanyId id);

    List<Company> matching();

    void update(CompanyId id, Company company);

    void disable(CompanyId id);

    void delete(CompanyId id);
}
