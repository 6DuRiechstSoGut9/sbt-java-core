package day2.task1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123456", "iPhone", 150);
        Phone phone2 = new Phone("654321", "Samsung");
        Phone phone3 = new Phone();

        phone1.receiveCall("Иван");
        phone1.receiveCall("Петр", "999888");
        System.out.println("Номер телефона: " + phone1.getNumber());

        String[] numbers = {"111", "222", "333"};
        phone1.sendMessage(numbers);

        System.out.println(phone1);
        System.out.println(phone2);
    }
}
