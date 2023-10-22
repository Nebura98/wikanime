package wikanime.backoffice.animeseasons.domain;

import java.util.List;
import java.util.Optional;

public interface AnimeSeasonRepository {
    void save(AnimeSeason animeSeason);

    Optional<AnimeSeason> search(AnimeSeasonId id);

    List<AnimeSeason> matching();

    void update(AnimeSeasonId id, AnimeSeason animeSeason);

    void disable(AnimeSeasonId id);

    void delete(AnimeSeasonId id);
}
