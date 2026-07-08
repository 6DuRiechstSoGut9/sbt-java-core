package day7.task1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("Borodino.txt"), StandardCharsets.UTF_8);
        List<String> cleaned = new ArrayList<>();
        for (String line : lines) {
            cleaned.add(SpaceRemover.removeExtraSpaces(line));
        }
        Files.write(Path.of("Borodino_clean.txt"), cleaned, StandardCharsets.UTF_8);
        System.out.println("Готово. Результат записан в Borodino_clean.txt");
    }
}
