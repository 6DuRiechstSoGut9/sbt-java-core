package day7.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameSorter {
    public static List<String> sort(String content) {
        List<String> names = new ArrayList<>();
        for (String part : content.split(",")) {
            String name = part.trim();
            if (!name.isEmpty()) {
                names.add(name);
            }
        }
        Collections.sort(names);
        return names;
    }
}
