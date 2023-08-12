package wikanime.backoffice.companies.application.find;

import wikanime.shared.domain.bus.query.Query;

public final class FindCompanyQuery implements Query {
    private final String id;

    public FindCompanyQuery(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}
