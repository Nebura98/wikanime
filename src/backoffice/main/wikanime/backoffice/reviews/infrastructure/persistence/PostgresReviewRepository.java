package wikanime.backoffice.reviews.infrastructure.persistence;

import wikanime.backoffice.reviews.domain.Review;
import wikanime.backoffice.reviews.domain.ReviewId;
import wikanime.backoffice.reviews.domain.ReviewRepository;

import java.util.List;
import java.util.Optional;

public final class PostgresReviewRepository implements ReviewRepository {
    @Override
    public void save(Review review) {

    }

    @Override
    public Optional<Review> search(ReviewId id) {
        return Optional.empty();
    }

    @Override
    public List<Review> matching() {
        return null;
    }

    @Override
    public void update(ReviewId id, Review review) {

    }

    @Override
    public void disable(ReviewId id) {

    }

    @Override
    public void delete(ReviewId id) {

    }
}
