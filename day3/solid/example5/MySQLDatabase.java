public class MySQLDatabase implements Database {
    public void save(String data) {
        System.out.println("Сохранено в MySQL: " + data);
    }
}
