package wikanime.backoffice.mangas.infrastructure.persistence;

import shared.domain.criteria.Criteria;
import wikanime.backoffice.mangas.domain.BackofficeMangaRepository;
import wikanime.backoffice.mangas.domain.Manga;
import wikanime.backoffice.mangas.domain.MangaId;

import java.util.List;
import java.util.Optional;

public final class MySQLBackofficeMangaRepository implements BackofficeMangaRepository {
    @Override
    public void save(Manga manga) {

    }

    @Override
    public Optional<Manga> search(Manga manga) {
        return Optional.empty();
    }

    @Override
    public List<Manga> matching(Criteria criteria) {
        return null;
    }

    @Override
    public void update(MangaId id, Manga manga) {

    }

    @Override
    public void disable(MangaId id) {

    }

    @Override
    public void delete(MangaId id) {

    }
}
