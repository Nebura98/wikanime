package wikanime.backoffice.users.domain;

import wikanime.backoffice.reviews.domain.UserId;
import wikanime.shared.infrastructure.persistence.Repository;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    void save(User user);

    Optional<User> search(UserId id);

    List<User> matching();

    void update(UserId id, User user);

    void disable(UserId id);

    void delete(UserId id);
}
