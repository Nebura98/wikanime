package wikanime.backoffice.companies.domain;

import wikanime.shared.domain.bus.event.DomainEvent;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public final class CompanyCreatedDomainEvent extends DomainEvent {
    private final String name;
    private final String president;
    private final String country;
    private final float lastYearIncome;

    public CompanyCreatedDomainEvent() {
        super(null);
        this.name = null;
        this.president = null;
        this.country = null;
        this.lastYearIncome = 0;
    }

    public CompanyCreatedDomainEvent(String aggregateId, String name, String president, String country, float lastYearIncome) {
        super(aggregateId);
        this.name = name;
        this.president = president;
        this.country = country;
        this.lastYearIncome = lastYearIncome;
    }

    public CompanyCreatedDomainEvent(String aggregateId, String eventId, String occurredOn, String name, String president, String country, float lastYearIncome) {
        super(aggregateId, eventId, occurredOn);
        this.name = name;
        this.president = president;
        this.country = country;
        this.lastYearIncome = lastYearIncome;
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

    @Override
    public String eventName() {
        return "company.created";
    }

    @Override
    public HashMap<String, Serializable> toPrimitives() {
        return new HashMap<String, Serializable>() {{
            put("name", name);
            put("president", president);
            put("country", country);
            put("lastYearIncome", lastYearIncome);
        }};
    }

    @Override
    public DomainEvent fromPrimitives(String aggregateId, HashMap<String, Serializable> body, String eventId, String occurredOn) {
        return new CompanyCreatedDomainEvent(
                aggregateId,
                eventId,
                occurredOn,
                (String) body.get("name"),
                (String) body.get("president"),
                (String) body.get("country"),
                (float) body.get("lastYearIncome")
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompanyCreatedDomainEvent that = (CompanyCreatedDomainEvent) o;
        return name.equals(that.name)
                && president.equals(that.president)
                && country.equals(that.country)
                && lastYearIncome == that.lastYearIncome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, president, country, lastYearIncome);
    }
}
