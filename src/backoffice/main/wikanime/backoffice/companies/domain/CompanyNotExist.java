package wikanime.backoffice.companies.domain;

import wikanime.shared.domain.DomainError;

public final class CompanyNotExist extends DomainError {
    public CompanyNotExist(CompanyId id) {
        super("company_not_exist", String.format("The company <%s> doesn't exist", id.value()));
    }
}
