import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("один", 1);
        map.put("два", 2);
        map.put("три", 3);

        System.out.println("Исходная map: " + map);

        Map<Integer, String> swapped = MapUtil.swap(map);
        System.out.println("После обмена: " + swapped);
    }
}
