package lesson_five;

import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class Road extends Stage {
  public Road(int length) {
    this.length = length;
    this.description = "Дорога " + length + " метров";
  }

  @Override
  public void go(Car c) {
    try {
      System.out.println(c.getName() + " начал этап: " + description);
      Thread.sleep(length / c.getSpeed() * 1000L);
      System.out.println(c.getName() + " закончил этап: " + description);
    } catch (InterruptedException e) {
      log.log(Level.WARNING, "Прервался поток", e.getMessage());
    }
  }
}