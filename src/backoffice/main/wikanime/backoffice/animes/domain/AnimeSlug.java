package wikanime.backoffice.animes.domain;

import wikanime.shared.domain.valueobject.StringValueObject;

public final class AnimeSlug extends StringValueObject {
    public AnimeSlug(String value) {
        super(value);
    }

    public static String Generate(String animeName) {
        return animeName.replace(' ', '-');
    }
}
