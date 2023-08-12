package wikanime.backoffice.companies.application.find;

import wikanime.backoffice.companies.application.CompanyResponse;
import wikanime.backoffice.companies.domain.CompanyId;
import wikanime.backoffice.companies.domain.CompanyNotExist;
import wikanime.backoffice.companies.domain.CompanyRepository;
import wikanime.shared.domain.Service;

@Service
public final class CompanyFinder {
    private final CompanyRepository repository;

    public CompanyFinder(CompanyRepository repository) {
        this.repository = repository;
    }

    public CompanyResponse find(CompanyId id) throws CompanyNotExist {
        return repository.search(id)
                .map(CompanyResponse::fromAggregate)
                .orElseThrow(() -> new CompanyNotExist(id));
    }
}
