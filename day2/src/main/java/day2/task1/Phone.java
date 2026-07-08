package day2.task1;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит " + name + ", номер " + phoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String[] numbers) {
        for (String n : numbers) {
            System.out.println(n);
        }
    }

    public String toString() {
        return "Телефон: номер " + number + ", модель " + model + ", вес " + weight;
    }
}
