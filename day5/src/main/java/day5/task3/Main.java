package day5.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> counts = new HashMap<>();
        try (InputStream in = Main.class.getResourceAsStream("/text.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        if (counts.containsKey(word)) {
                            counts.put(word, counts.get(word) + 1);
                        } else {
                            counts.put(word, 1);
                        }
                    }
                }
            }
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
