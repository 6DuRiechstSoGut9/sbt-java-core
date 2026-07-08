package day7.task2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String content;
        try (InputStream in = Main.class.getResourceAsStream("/listNames.txt")) {
            content = new String(in.readAllBytes(), StandardCharsets.UTF_8);
        }
        List<String> sorted = NameSorter.sort(content);
        Path output = Path.of("listNames_sorted.txt");
        Files.write(output, sorted, StandardCharsets.UTF_8);
        System.out.println("Готово. Отсортированные имена записаны в " + output.toAbsolutePath());
    }
}
