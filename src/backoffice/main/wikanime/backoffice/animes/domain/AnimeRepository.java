package wikanime.backoffice.animes.domain;

import java.util.List;
import java.util.Optional;

public interface AnimeRepository {
    void save(Anime anime);

    Optional<Anime> search(AnimeId id);

    List<Anime> matching();

    void update(AnimeId id, Anime anime);

    void disable(AnimeId id);

    void delete(AnimeId id);
}
