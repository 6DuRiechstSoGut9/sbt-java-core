package day7.task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeroSerializationTest {

    private Hero saveAndLoad(Hero hero, Path dir) throws Exception {
        String file = dir.resolve("hero.ser").toString();
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(hero);
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return (Hero) in.readObject();
        }
    }

    @Test
    void savesAndLoadsPrimitiveFields(@TempDir Path dir) throws Exception {
        Hero hero = new Hero();
        hero.name = "Артур";
        hero.lvl = 10;
        Hero loaded = saveAndLoad(hero, dir);
        assertEquals("Артур", loaded.name);
        assertEquals(10, loaded.lvl);
    }

    @Test
    void savesAndLoadsObjectFields(@TempDir Path dir) throws Exception {
        Hero hero = new Hero();
        hero.weapon = new Weapon("Меч", 50);
        hero.armor = new Armor("Щит", 30);
        Hero loaded = saveAndLoad(hero, dir);
        assertEquals("Меч", loaded.weapon.name);
        assertEquals(50, loaded.weapon.damage);
        assertEquals(30, loaded.armor.defense);
    }
}
