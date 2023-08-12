package wikanime.backoffice.mangas.domain;

import shared.domain.AggregateRoot;

import java.util.Optional;

public final class Manga extends AggregateRoot {

    private final MangaId id;
    private final MangaTitle title;
    private final MangaCreator creator;
    private final MangaDescription description;
    private final MangaRating rating;
    private final MangaLike likes;
    private final MangaVolume volume;

    public Manga(String id, String mangaTitle, String mangaCreatorId, Optional<String> description, Integer rating, Integer likes, Integer volume) {
        this.id = new MangaId(id);
        this.title = new MangaTitle(mangaTitle);
        this.creator = new MangaCreator(mangaCreatorId);
        this.description = new MangaDescription(description.orElse("Default description"));
        this.rating = new MangaRating(rating);
        this.likes = new MangaLike(likes);
        this.volume = new MangaVolume(volume);
    }

}
