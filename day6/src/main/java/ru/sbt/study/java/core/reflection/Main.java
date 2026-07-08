package ru.sbt.study.java.core.reflection;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Photo> photos = new ArrayList<>();
        photos.add(new Photo("front", "http://site/front.jpg"));
        photos.add(new Photo("back", "http://site/back.jpg"));

        Pet pet = new Pet("Барсик", Status.AVAILABLE, photos);
        Animal animal = PetToAnimalConverter.convertToAnimal(pet);
        System.out.println(animal);
    }
}
