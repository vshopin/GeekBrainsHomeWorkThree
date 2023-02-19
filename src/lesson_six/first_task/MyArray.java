package lesson_six.first_task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.ArrayList;

@Getter
@AllArgsConstructor
public class MyArray {
  private ArrayList<Integer> array;

  public ArrayList<Integer> returnArray() throws RuntimeException {
    var result = new ArrayList<Integer>();
    if (array.size() == 0 || array.get(array.size() - 1) == 4 || !array.contains(4)) {
      throw new RuntimeException();
    }
    for (int i = array.size() - 1; i >= 0; i--) {
      if (array.get(i) == 4) {
        for (int j = i + 1; j < array.size(); j++) {
          result.add(array.get(j));
        } break;
      }
    }
    return result;
  }
}
