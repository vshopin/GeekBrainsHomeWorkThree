package lesson_five;

import lombok.Getter;

public abstract class Stage {
  protected int length;
  @Getter
  protected String description;

  public abstract void go(Car c);
}
