package day7.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> cleaned = new ArrayList<>();
        try (InputStream in = Main.class.getResourceAsStream("/Borodino.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                cleaned.add(SpaceRemover.removeExtraSpaces(line));
            }
        }
        Path output = Path.of("Borodino_clean.txt");
        Files.write(output, cleaned, StandardCharsets.UTF_8);
        System.out.println("Готово. Результат записан в " + output.toAbsolutePath());
    }
}
