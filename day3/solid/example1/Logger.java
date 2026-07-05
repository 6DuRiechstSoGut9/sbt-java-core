import java.time.LocalDateTime;

public class Logger {
    public void log(String message) {
        System.out.println("[" + LocalDateTime.now() + "] " + message);
    }

    public void logError(String error) {
        System.err.println("[ERROR " + LocalDateTime.now() + "] " + error);
    }
}
