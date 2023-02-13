package lesson_five;


import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;

@Log
public class MainClass {
  public static final int CARS_COUNT = 4;

  public static void main(String[] args) {
    System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
    var race = new Race(new ArrayList<>(List.of(new Road(60), new Tunnel(), new Road(40))));
    var cars = new Car[CARS_COUNT];
    var countDownLatchGo = new CountDownLatch(CARS_COUNT);
    var countDownLatchEnd = new CountDownLatch(CARS_COUNT);

    for (int i = 0; i < cars.length; i++) {
      cars[i] = new Car(race, 20 + (int) (Math.random() * 10), countDownLatchGo, countDownLatchEnd);
    }
    for (Car car : cars) {
      new Thread(car).start();
    }

    try {
      countDownLatchGo.await();
    } catch (InterruptedException e) {
      log.log(Level.WARNING, "Прервался поток", e.getMessage());
    }
    System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");

    try {
      countDownLatchEnd.await();
    } catch (InterruptedException e) {
      log.log(Level.WARNING, "Прервался поток", e.getMessage());
    }

    System.out.printf("\nПобедителем гонки является %s\n", Car.podium.get(0));
    System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
  }
}
