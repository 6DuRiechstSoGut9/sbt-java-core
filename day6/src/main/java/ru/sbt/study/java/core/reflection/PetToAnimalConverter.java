package ru.sbt.study.java.core.reflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetToAnimalConverter {

    public static Animal convertToAnimal(Pet pet) {
        try {
            Animal animal = new Animal();

            String name = (String) readField(pet, "name");
            writeField(animal, "title", name);

            Status status = (Status) readField(pet, "status");
            writeField(animal, "isAvailable", status == Status.AVAILABLE);
            writeField(animal, "isSold", status == Status.SOLD);

            List<Photo> photosList = (List<Photo>) readField(pet, "photosList");
            Map<String, String> photosMap = new HashMap<>();
            if (photosList != null) {
                for (Photo photo : photosList) {
                    photosMap.put(photo.getName(), photo.getURL());
                }
            }
            writeField(animal, "photosMap", photosMap);

            return animal;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Object readField(Object object, String fieldName) throws Exception {
        Field field = object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(object);
    }

    private static void writeField(Object object, String fieldName, Object value) throws Exception {
        Field field = object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(object, value);
    }
}
