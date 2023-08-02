package backoffice.wikanime.mangas.infrastructure.persistence;

import java.util.List;
import java.util.Optional;

import backoffice.wikanime.mangas.domain.BackofficeMangaRepository;
import backoffice.wikanime.mangas.domain.Manga;
import backoffice.wikanime.mangas.domain.MangaId;
import shared.domain.criteria.Criteria;

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
