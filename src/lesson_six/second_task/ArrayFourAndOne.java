package lesson_six.second_task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.ArrayList;

@Getter
@AllArgsConstructor
public class ArrayFourAndOne {
  private ArrayList<Integer> array;

  public boolean checkArray() {
    return array.contains(1) || array.contains(4);
  }
}
