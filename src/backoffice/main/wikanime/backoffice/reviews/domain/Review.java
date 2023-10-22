package wikanime.backoffice.reviews.domain;

import wikanime.shared.domain.AggregateRoot;

import java.util.Date;

public final class Review extends AggregateRoot {
    private final ReviewId id;
    private final UserId userId;
    private final ContentId contentId;
    private final ReviewDate date;
    private final ReviewComment comment;

    public Review(String id, String userId, String contentId, Date reviewDate, String comment) {
        this.id = new ReviewId(id);
        this.userId = new UserId(userId);
        this.contentId = new ContentId(contentId);
        this.date = new ReviewDate(reviewDate);
        this.comment = new ReviewComment(comment);
    }
}
