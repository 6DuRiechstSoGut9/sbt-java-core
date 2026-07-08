package day7.task3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Hero hero = new Hero();
        hero.name = "Артур";
        hero.lvl = 10;
        hero.weapon = new Weapon("Меч", 50);
        hero.armor = new Armor("Щит", 30);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("hero.ser"))) {
            out.writeObject(hero);
        }

        Hero loaded;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("hero.ser"))) {
            loaded = (Hero) in.readObject();
        }

        System.out.println(loaded);
    }
}
