package ru.sbt.study.java.core.threads.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TunnelTest {

    @Test
    void noMoreThanHalfInsideAtOnce() throws InterruptedException {
        int cars = 4;
        Tunnel tunnel = new Tunnel(cars / 2);
        Race race = new Race(cars, tunnel);

        Thread[] threads = new Thread[cars];
        for (int i = 0; i < cars; i++) {
            Car car = new Car(race, 80);
            threads[i] = new Thread(() -> tunnel.go(car));
        }
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }

        assertTrue(tunnel.getMaxInside() >= 1);
        assertTrue(tunnel.getMaxInside() <= cars / 2);
    }
}
