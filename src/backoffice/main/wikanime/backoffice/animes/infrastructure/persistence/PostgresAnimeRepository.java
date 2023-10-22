package wikanime.backoffice.animes.infrastructure.persistence;

import wikanime.backoffice.animes.domain.Anime;
import wikanime.backoffice.animes.domain.AnimeId;
import wikanime.backoffice.animes.domain.AnimeRepository;

import java.util.List;
import java.util.Optional;

public final class PostgresAnimeRepository implements AnimeRepository {
    @Override
    public void save(Anime anime) {

    }

    @Override
    public Optional<Anime> search(AnimeId id) {
        return Optional.empty();
    }

    @Override
    public List<Anime> matching() {
        return null;
    }

    @Override
    public void disable(AnimeId id) {

    }

    @Override
    public void delete(AnimeId id) {

    }

    @Override
    public void update(AnimeId id, Anime anime) {

    }
}
