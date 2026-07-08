package day7.task1;

public class SpaceRemover {
    public static String removeExtraSpaces(String line) {
        return line.trim().replaceAll("\\s+", " ");
    }
}
