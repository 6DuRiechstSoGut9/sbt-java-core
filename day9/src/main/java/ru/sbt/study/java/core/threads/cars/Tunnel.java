package ru.sbt.study.java.core.threads.cars;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

class Tunnel extends Stage {

    private final Semaphore semaphore;
    private final AtomicInteger inside = new AtomicInteger();
    private int maxInside;

    public Tunnel(int maxCars) {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
        this.semaphore = new Semaphore(maxCars);
    }

    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
            semaphore.acquire();
            int now = inside.incrementAndGet();
            synchronized (this) {
                if (now > maxInside) {
                    maxInside = now;
                }
            }
            try {
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } finally {
                inside.decrementAndGet();
                System.out.println(c.getName() + " закончил этап: " + description);
                semaphore.release();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    synchronized int getMaxInside() {
        return maxInside;
    }
}
