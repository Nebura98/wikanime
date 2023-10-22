package wikanime.backoffice.reviews.domain;

import wikanime.shared.infrastructure.persistence.Repository;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends Repository {
    void save(Review review);

    Optional<Review> search(ReviewId id);

    List<Review> matching();

    void update(ReviewId id, Review review);

    void disable(ReviewId id);

    void delete(ReviewId id);
}
