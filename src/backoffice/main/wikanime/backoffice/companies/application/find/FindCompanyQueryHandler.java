package wikanime.backoffice.companies.application.find;

import wikanime.backoffice.companies.application.CompanyResponse;
import wikanime.backoffice.companies.domain.CompanyId;
import wikanime.backoffice.companies.domain.CompanyNotExist;
import wikanime.shared.domain.Service;
import wikanime.shared.domain.bus.query.QueryHandler;

@Service
public final class FindCompanyQueryHandler implements QueryHandler<FindCompanyQuery, CompanyResponse> {
    private final CompanyFinder finder;

    public FindCompanyQueryHandler(CompanyFinder finder) {
        this.finder = finder;
    }

    @Override
    public CompanyResponse handle(FindCompanyQuery query) throws CompanyNotExist {
        return finder.find(new CompanyId(query.id()));
    }
}
