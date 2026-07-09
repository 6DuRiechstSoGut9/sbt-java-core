package day8.task2;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Иван", 19, 1),
                new Student("Мария", 21, 1),
                new Student("Пётр", 22, 2),
                new Student("Анна", 24, 2),
                new Student("Олег", 20, 1));

        Map<Integer, Double> averages = StudentStats.averageAgeByCourse(students);
        for (Map.Entry<Integer, Double> entry : averages.entrySet()) {
            System.out.println("Курс " + entry.getKey() + ": средний возраст " + entry.getValue());
        }
    }
}
