package day1.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        long a = 0;
        long b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}
