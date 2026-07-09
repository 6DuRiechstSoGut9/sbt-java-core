package day8.task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringFilterTest {

    @Test
    void filtersBySubstringAndUppercases() {
        List<String> result = StringFilter.filterAndUpper(List.of("java is fun", "python", "javascript"), "java");
        assertEquals(List.of("JAVA IS FUN", "JAVASCRIPT"), result);
    }

    @Test
    void returnsEmptyWhenNothingMatches() {
        List<String> result = StringFilter.filterAndUpper(List.of("python", "cobol"), "java");
        assertEquals(0, result.size());
    }
}
