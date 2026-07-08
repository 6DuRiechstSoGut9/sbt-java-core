package day3.solid.example5;

public class MySQLDatabase implements Database {
    public void save(String data) {
        System.out.println("Сохранено в MySQL: " + data);
    }
}
