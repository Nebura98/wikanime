package wikanime.backoffice.animes.domain;

import wikanime.shared.domain.AggregateRoot;

import java.util.Optional;

public final class Anime extends AggregateRoot {
    private final AnimeId id;
    private final AnimeName name;
    private final AnimeSlug slug;
    private final AnimeCompany companyId;
    private final AnimeDirector directorId;
    private final AnimeStudio studioId;

    public Anime(String id, String name, Optional<String> slug, String companyId, String directorId, String studioId) {
        this.id = new AnimeId(id);
        this.name = new AnimeName(name);
        this.slug = new AnimeSlug(slug.orElse(AnimeSlug.Generate(this.name.value())));
        this.companyId = new AnimeCompany(companyId);
        this.directorId = new AnimeDirector(directorId);
        this.studioId = new AnimeStudio(studioId);
    }
}