package wikanime.backoffice.animeseasons.domain;


import wikanime.shared.domain.AggregateRoot;

import java.util.HashMap;
import java.util.Map;

public final class AnimeSeason extends AggregateRoot {
    private final AnimeSeasonId animeId;
    private final AnimeDirector directorId;
    private final AnimeStudio animeStudioId;
    private final AnimeOrder order;
    private final AnimeSeasonEpisode numberOfEpisodes;
    private final Map<String, String> voiceActors;

    public AnimeSeason(String animeId, String slug, int order, String animeStudioId, int numberOfEpisodes, String directorId) {
        this.animeId = new AnimeSeasonId(animeId);
        this.directorId = new AnimeDirector(directorId);
        this.animeStudioId = new AnimeStudio(animeStudioId);
        this.order = new AnimeOrder(order);
        this.numberOfEpisodes = new AnimeSeasonEpisode(numberOfEpisodes);
        this.voiceActors = new HashMap<>();

    }

    public void addVoiceActor(String characterId, String voiceActorId) {
        var VoiceActorId = new AnimeVoiceActorId(voiceActorId);
        var CharacterId = new AnimeCharacterId(characterId);
        this.voiceActors.put(VoiceActorId.value(), CharacterId.value());
    }
}
