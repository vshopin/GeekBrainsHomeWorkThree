package lesson_five;

import lombok.Getter;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

@Getter
public class Car implements Runnable {
  protected static ArrayList<String> podium = new ArrayList<>();
  private static int CARS_COUNT;
  static {
    CARS_COUNT = 0;
  }

  private CountDownLatch cdlGo;
  private CountDownLatch cdlEnd;
  private static CountDownLatch countDownLatch = new CountDownLatch(MainClass.CARS_COUNT);

  private Race race;
  private int speed;
  private String name;

  public Car(Race race, int speed, CountDownLatch cdlGo, CountDownLatch cdlEnd) {
    this.race = race;
    this.speed = speed;
    this.cdlGo = cdlGo;
    this.cdlEnd = cdlEnd;
    CARS_COUNT++;
    this.name = "Участник #" + CARS_COUNT;
  }

  @Override
  public void run() {
    try {
      System.out.println(this.name + " готовится");
      Thread.sleep(500 + (int) (Math.random() * 800));
      System.out.println(this.name + " готов");
      countDownLatch.countDown();
      cdlGo.countDown();
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      countDownLatch.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    for (int i = 0; i < race.getStages().size(); i++) {
      race.getStages().get(i).go(this);
    }
    podium.add(this.name);
    cdlEnd.countDown();
  }
}
