package ru.sbt.study.java.core.reflection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PetToAnimalConverterTest {

    @Test
    void copiesNameToTitle() {
        Pet pet = new Pet("Барсик", Status.AVAILABLE, new ArrayList<>());
        Animal animal = PetToAnimalConverter.convertToAnimal(pet);
        assertTrue(animal.toString().contains("title='Барсик'"));
    }

    @Test
    void mapsStatusToBooleans() {
        Animal available = PetToAnimalConverter.convertToAnimal(new Pet("Барсик", Status.AVAILABLE, new ArrayList<>()));
        assertTrue(available.toString().contains("isAvailable=true"));
        assertTrue(available.toString().contains("isSold=false"));

        Animal sold = PetToAnimalConverter.convertToAnimal(new Pet("Рекс", Status.SOLD, new ArrayList<>()));
        assertTrue(sold.toString().contains("isAvailable=false"));
        assertTrue(sold.toString().contains("isSold=true"));
    }

    @Test
    void convertsPhotosListToMap() {
        List<Photo> photos = new ArrayList<>();
        photos.add(new Photo("front", "url1"));
        Animal animal = PetToAnimalConverter.convertToAnimal(new Pet("Барсик", Status.AVAILABLE, photos));
        assertTrue(animal.toString().contains("front=url1"));
    }
}
