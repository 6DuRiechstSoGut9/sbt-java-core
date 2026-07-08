package day7.task3;

import java.io.Serializable;

public class Armor implements Serializable {
    String name;
    int defense;

    public Armor(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    public String toString() {
        return name + " (защита " + defense + ")";
    }
}
