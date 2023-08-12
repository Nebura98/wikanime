package wikanime.backoffice.mangas.domain;

import shared.domain.criteria.Criteria;

import java.util.List;
import java.util.Optional;

public interface BackofficeMangaRepository {
    void save(Manga manga);

    Optional<Manga> search(Manga manga);

    List<Manga> matching(Criteria criteria);

    void update(MangaId id, Manga manga);

    void disable(MangaId id);

    void delete(MangaId id);
}
