import java.util.HashMap;
import java.util.Map;

public class MapUtil {
    public static <K, V> Map<V, K> swap(Map<K, V> map) {
        Map<V, K> result = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }
}
