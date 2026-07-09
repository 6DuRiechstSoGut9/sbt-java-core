package day8.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("java is fun", "python", "javascript", "cobol", "Java rocks");
        List<String> result = StringFilter.filterAndUpper(strings, "java");
        result.forEach(System.out::println);
    }
}
