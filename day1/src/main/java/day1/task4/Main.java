package day1.task4;

public class Main {
    public static void main(String[] args) {
        int n = 543;
        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 10;
        System.out.println("Сумма цифр числа " + n + " = " + (a + b + c));
    }
}
