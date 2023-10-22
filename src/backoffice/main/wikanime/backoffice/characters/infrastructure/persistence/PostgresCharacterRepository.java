package wikanime.backoffice.characters.infrastructure.persistence;

import wikanime.backoffice.characters.domain.Character;
import wikanime.backoffice.characters.domain.CharacterId;
import wikanime.backoffice.characters.domain.CharacterRepository;

import java.util.List;
import java.util.Optional;

public final class PostgresCharacterRepository implements CharacterRepository {
    @Override
    public void save(Character company) {

    }

    @Override
    public Optional<Character> search(CharacterId id) {
        return Optional.empty();
    }

    @Override
    public List<Character> matching() {
        return null;
    }

    @Override
    public void update(CharacterId id, Character character) {

    }

    @Override
    public void disable(CharacterId id) {

    }

    @Override
    public void delete(CharacterId id) {

    }
}
