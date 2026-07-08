package day7.task2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Path.of("listNames.txt"), StandardCharsets.UTF_8);
        List<String> sorted = NameSorter.sort(content);
        Files.write(Path.of("listNames_sorted.txt"), sorted, StandardCharsets.UTF_8);
        System.out.println("Готово. Отсортированные имена записаны в listNames_sorted.txt");
    }
}
