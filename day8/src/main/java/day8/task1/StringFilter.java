package day8.task1;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
    public static List<String> filterAndUpper(List<String> strings, String part) {
        return strings.stream()
                .filter(s -> s.contains(part))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
