package day1.task8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char secret = (char) ('A' + new Random().nextInt(26));
        while (true) {
            System.out.print("Введите букву A-Z: ");
            char letter = scanner.next().charAt(0);
            if (letter == secret) {
                System.out.println("Right");
                break;
            } else if (letter < secret) {
                System.out.println("You're too low");
            } else {
                System.out.println("You're too high");
            }
        }
    }
}
