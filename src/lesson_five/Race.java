package lesson_five;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;

@Getter
public class Race {
  private ArrayList<Stage> stages;

  public Race(Stage... stages) {
    this.stages = new ArrayList<>(Arrays.asList(stages));
  }
}
