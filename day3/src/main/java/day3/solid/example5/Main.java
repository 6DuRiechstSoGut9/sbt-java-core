package day3.solid.example5;

public class Main {
    public static void main(String[] args) {
        Database database = new MySQLDatabase();
        UserService userService = new UserService(database);
        userService.createUser("ivan");
    }
}
