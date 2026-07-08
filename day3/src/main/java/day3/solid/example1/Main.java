package day3.solid.example1;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Logger logger = new Logger();

        userService.addUser("ivan", "1234");
        logger.log("Пользователь добавлен");

        boolean ok = userService.authenticate("ivan", "1234");
        System.out.println("Аутентификация: " + ok);

        if (!userService.authenticate("ivan", "0000")) {
            logger.logError("Неверный пароль");
        }
    }
}
