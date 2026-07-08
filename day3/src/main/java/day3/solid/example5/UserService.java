package day3.solid.example5;

public class UserService {
    private Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void createUser(String username) {
        database.save("User: " + username);
    }
}
