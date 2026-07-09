package day8.task2;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentStatsTest {

    @Test
    void averageAgeIsGroupedByCourse() {
        List<Student> students = List.of(
                new Student("A", 20, 1),
                new Student("B", 22, 1),
                new Student("C", 30, 2));
        Map<Integer, Double> result = StudentStats.averageAgeByCourse(students);
        assertEquals(21.0, result.get(1));
        assertEquals(30.0, result.get(2));
    }

    @Test
    void emptyListGivesEmptyMap() {
        assertEquals(0, StudentStats.averageAgeByCourse(List.of()).size());
    }
}
