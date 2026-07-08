package day7.task2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameSorterTest {

    @Test
    void sortsAlphabetically() {
        List<String> result = NameSorter.sort("Сергей, Анна, Мария");
        assertEquals(List.of("Анна", "Мария", "Сергей"), result);
    }

    @Test
    void trimsSpacesAroundNames() {
        List<String> result = NameSorter.sort("  Борис ,Анна");
        assertEquals(List.of("Анна", "Борис"), result);
    }

    @Test
    void ignoresEmptyParts() {
        List<String> result = NameSorter.sort("Анна,,Борис,");
        assertEquals(2, result.size());
    }
}
