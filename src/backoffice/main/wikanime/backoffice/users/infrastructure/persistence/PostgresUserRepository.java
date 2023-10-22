package wikanime.backoffice.users.infrastructure.persistence;

import wikanime.backoffice.reviews.domain.UserId;
import wikanime.backoffice.users.domain.User;
import wikanime.backoffice.users.domain.UserRepository;

import java.util.List;
import java.util.Optional;

public final class PostgresUserRepository implements UserRepository {
    @Override
    public void save(User user) {

    }

    @Override
    public Optional<User> search(UserId id) {
        return Optional.empty();
    }

    @Override
    public List<User> matching() {
        return null;
    }

    @Override
    public void update(UserId id, User user) {

    }

    @Override
    public void disable(UserId id) {

    }

    @Override
    public void delete(UserId id) {

    }
}
