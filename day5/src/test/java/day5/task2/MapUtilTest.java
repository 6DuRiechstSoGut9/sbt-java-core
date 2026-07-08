package day5.task2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapUtilTest {
    @Test
    void swapsKeysAndValues() {
        Map<String, Integer> map = new HashMap<>();
        map.put("один", 1);
        map.put("два", 2);
        Map<Integer, String> swapped = MapUtil.swap(map);
        assertEquals("один", swapped.get(1));
        assertEquals("два", swapped.get(2));
    }

    @Test
    void emptyMapStaysEmpty() {
        Map<Integer, String> swapped = MapUtil.swap(new HashMap<String, Integer>());
        assertEquals(0, swapped.size());
    }
}
