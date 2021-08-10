package music;

import lombok.Data;

import java.util.Date;

@Data
public class Song {

    String collectionType;
    int amgArtistId;

    String wrapperType;
    int artistId;
    int collectionId;
    String artistName;
    String kind;
    String collectionName;
    String trackName;
    String collectionCensoredName;
    String trackCensoredName;
    String artistViewUrl;
    String collectionViewUrl;
    String artworkUrl30;
    String artworkUrl60;
    String artworkUrl100;
    String trackViewUrl;
    String previewUrl;
    String collectionArtistName;
    double collectionPrice;
    double trackPrice;
    Date releaseDate;
    String collectionExplicitness;
    String trackExplicitness;
    int trackId;
    int discCount;
    int discNumber;
    int trackCount;
    int trackNumber;
    int trackTimeMillis;
    String country;
    String currency;
    String primaryGenreName;
    String contentAdvisoryRating;
    String copyright;
    Boolean isStreamable;

}
