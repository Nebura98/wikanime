package wikanime.backoffice.characters.domain;

import wikanime.shared.domain.AggregateRoot;

public final class Character extends AggregateRoot {
    final CharacterId id;
    private final CharacterName name;
    private final CharacterMangaId mangaId;
    private final CharacterAge age;
    private final CharacterMangaFirstAppearance mangaFirstAppearance;
    private final CharacterGender gender;
    private final CharacterHeight height;
    private final CharacterWeight weight;

    public Character(String id, String name, String mangaId, Integer age, Integer mangaFirstAppearance, String gender, Integer height, Integer weight) {
        this.id = new CharacterId(id);
        this.name = new CharacterName(name);
        this.mangaId = new CharacterMangaId(mangaId);
        this.age = new CharacterAge(age);
        this.mangaFirstAppearance = new CharacterMangaFirstAppearance(mangaFirstAppearance);
        this.gender = new CharacterGender(gender);
        this.height = new CharacterHeight(height);
        this.weight = new CharacterWeight(weight);
    }
}
