package wikanime.backoffice.mangas.domain;

import java.util.List;
import java.util.Optional;

public interface MangaRepository {
    void save(Manga manga);

    Optional<Manga> search(Manga manga);

    List<Manga> matching();

    void update(MangaId id, Manga manga);

    void disable(MangaId id);

    void delete(MangaId id);
}
