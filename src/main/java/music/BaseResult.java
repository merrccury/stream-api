package music;

import lombok.Data;

@Data
public class BaseResult {
    String wrapperType;
    String artistName;
    int artistId;
    int amgArtistId;
    int primaryGenreName;
}
