package day8.task3;

import java.time.LocalDate;

public class Order {
    private int id;
    private double sum;
    private LocalDate date;

    public Order(int id, double sum, LocalDate date) {
        this.id = id;
        this.sum = sum;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public double getSum() {
        return sum;
    }

    public LocalDate getDate() {
        return date;
    }

    public String toString() {
        return "Заказ #" + id + " на сумму " + sum + " от " + date;
    }
}
