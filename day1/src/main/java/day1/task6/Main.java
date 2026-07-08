package day1.task6;

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        boolean prime = n > 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println("Простое");
        } else {
            System.out.println("Составное");
        }
    }
}
