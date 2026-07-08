package day3.solid.example4;

public class Human implements Workable, Eatable {
    public void work() {
        System.out.println("Человек работает");
    }

    public void eat() {
        System.out.println("Человек ест");
    }
}
