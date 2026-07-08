package day7.task3;

import java.io.Serializable;

public class Hero implements Serializable {
    String name;
    int lvl;
    Weapon weapon;
    Armor armor;

    public String toString() {
        return "Герой " + name + ", уровень " + lvl + ", оружие: " + weapon + ", броня: " + armor;
    }
}
