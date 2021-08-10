package music;

import lombok.Data;

import java.util.Date;

@Data
public class Album {
    String artistType;
    String artistLinkUrl;
    int primaryGenreId;

    String wrapperType;
    String collectionType;
    int artistId;
    int collectionId;
    int amgArtistId;
    String artistName;
    String collectionName;
    String collectionCensoredName;
    String artistViewUrl;
    String collectionViewUrl;
    String artworkUrl60;
    String artworkUrl100;
    double collectionPrice;
    String collectionExplicitness;
    String contentAdvisoryRating;
    int trackCount;
    String copyright;
    String country;
    String currency;
    Date releaseDate;
    String primaryGenreName;
}
