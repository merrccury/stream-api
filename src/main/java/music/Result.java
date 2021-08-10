package music;

import lombok.Data;

import java.util.List;

@Data
public class Result<T> {
    int resultCount;
    List<T> results;
}
