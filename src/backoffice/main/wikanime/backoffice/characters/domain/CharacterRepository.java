package wikanime.backoffice.characters.domain;

import java.util.List;
import java.util.Optional;

public interface CharacterRepository {
    void save(Character company);

    Optional<Character> search(CharacterId id);

    List<Character> matching();

    void update(CharacterId id, Character character);

    void disable(CharacterId id);

    void delete(CharacterId id);
}
