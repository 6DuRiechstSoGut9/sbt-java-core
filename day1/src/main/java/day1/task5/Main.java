package day1.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вес на Земле: ");
        double weight = scanner.nextDouble();
        double moon = weight * 0.17;
        System.out.println("Вес на Луне: " + moon);
    }
}
