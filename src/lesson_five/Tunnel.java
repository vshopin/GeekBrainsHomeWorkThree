package lesson_five;

import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class Tunnel extends Stage {
  public Tunnel() {
    this.length = 80;
    this.description = "Тоннель " + length + " метров";
  }

  @Override
  public void go(Car c) {
    try {
      System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
      System.out.println(c.getName() + " начал этап: " + description);
      Thread.sleep(length / c.getSpeed() * 1000L);
    } catch (InterruptedException e) {
      log.log(Level.WARNING, "Прервался поток", e.getMessage());
    } finally {
      System.out.println(c.getName() + " закончил этап: " + description);
    }
  }
}
