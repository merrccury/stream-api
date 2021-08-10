package music;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

@Data
public class SongResult {
    int resultCount;
    List<Song> results;
}

