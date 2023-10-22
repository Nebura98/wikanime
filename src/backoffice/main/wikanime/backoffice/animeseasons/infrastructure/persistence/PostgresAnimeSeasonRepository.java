package wikanime.backoffice.animeseasons.infrastructure.persistence;

import wikanime.backoffice.animeseasons.domain.AnimeSeason;
import wikanime.backoffice.animeseasons.domain.AnimeSeasonId;
import wikanime.backoffice.animeseasons.domain.AnimeSeasonRepository;

import java.util.List;
import java.util.Optional;

public final class PostgresAnimeSeasonRepository implements AnimeSeasonRepository {
    @Override
    public void save(AnimeSeason animeSeason) {

    }

    @Override
    public Optional<AnimeSeason> search(AnimeSeasonId id) {
        return Optional.empty();
    }

    @Override
    public List<AnimeSeason> matching() {
        return null;
    }

    @Override
    public void update(AnimeSeasonId id, AnimeSeason animeSeason) {

    }

    @Override
    public void disable(AnimeSeasonId id) {

    }

    @Override
    public void delete(AnimeSeasonId id) {

    }
}
