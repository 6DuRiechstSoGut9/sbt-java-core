package ru.sbt.study.java.core.threads.cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

class Race {

    private ArrayList<Stage> stages;
    private final CountDownLatch ready;
    private final CountDownLatch start = new CountDownLatch(1);
    private final CountDownLatch finish;
    private final AtomicReference<Car> winner = new AtomicReference<>();

    public Race(int carsCount, Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
        this.ready = new CountDownLatch(carsCount);
        this.finish = new CountDownLatch(carsCount);
    }

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public void awaitStart() throws InterruptedException {
        ready.countDown();
        start.await();
    }

    public void awaitAllReady() throws InterruptedException {
        ready.await();
    }

    public void start() {
        start.countDown();
    }

    public void awaitFinish() throws InterruptedException {
        finish.await();
    }

    public void carFinished(Car car) {
        if (winner.compareAndSet(null, car)) {
            System.out.println(car.getName() + " - WIN");
        }
        finish.countDown();
    }

    public Car getWinner() {
        return winner.get();
    }
}
