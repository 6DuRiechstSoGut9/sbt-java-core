package ru.sbt.study.java.core.threads.cars;

class Car implements Runnable {

    private static int CARS_COUNT;

    static {
        CARS_COUNT = 0;
    }

    private Race race;
    private int speed;
    private String name;

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(name + " готов");

            race.awaitStart();

            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }
            race.carFinished(this);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
