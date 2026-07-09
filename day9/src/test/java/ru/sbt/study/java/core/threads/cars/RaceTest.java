package ru.sbt.study.java.core.threads.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RaceTest {

    @Test
    void firstFinisherIsTheWinner() {
        Race race = new Race(2, new Road(10));
        Car first = new Car(race, 25);
        Car second = new Car(race, 25);

        race.carFinished(first);
        race.carFinished(second);

        assertSame(first, race.getWinner());
    }

    @Test
    void onlyOneWinnerWhenManyFinishAtOnce() throws InterruptedException {
        int n = 8;
        Race race = new Race(n, new Road(10));
        Car[] cars = new Car[n];
        Thread[] threads = new Thread[n];
        for (int i = 0; i < n; i++) {
            cars[i] = new Car(race, 25);
        }
        for (int i = 0; i < n; i++) {
            Car car = cars[i];
            threads[i] = new Thread(() -> race.carFinished(car));
        }
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }

        Car winner = race.getWinner();
        assertNotNull(winner);
        boolean isOneOfCars = false;
        for (Car car : cars) {
            if (car == winner) {
                isOneOfCars = true;
            }
        }
        assertTrue(isOneOfCars);
    }
}
