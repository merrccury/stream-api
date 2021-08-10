package music;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public interface Search<T> {
    void setUp(Map<String, String> headers);

    T search(String term);
    T search(int id);
}
