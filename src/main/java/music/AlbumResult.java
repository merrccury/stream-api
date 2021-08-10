package music;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

@Data
public class AlbumResult {
    int resultCount;
    List<Album> results;
}

