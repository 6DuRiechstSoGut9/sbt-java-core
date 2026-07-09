package day8.task2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentStats {
    public static Map<Integer, Double> averageAgeByCourse(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getCourse,
                        Collectors.averagingInt(Student::getAge)));
    }
}
