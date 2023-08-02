package backoffice.wikanime.reviews.domain;

import shared.domain.AggregateRoot;

import java.util.Date;

public final class Review extends AggregateRoot {
    private final ReviewId id;
    private final UserId userId;
    private final MangaId mangaId;
    private final ReviewDate date;
    private final ReviewComment comment;

    public Review(String id, String userId, String mangaId, Date date, String comment) {
        this.id         = new ReviewId(id);
        this.userId     = new UserId(userId);
        this.mangaId    = new MangaId(mangaId);
        this.date       = new ReviewDate(date);
        this.comment    = new ReviewComment(comment);
    }
}
