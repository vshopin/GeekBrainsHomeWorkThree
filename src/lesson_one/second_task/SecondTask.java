package lesson_one.second_task;

import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

@Getter
public class SecondTask<A> {
  private A[] array;

  public SecondTask(A... array) {
    this.array = array;
  }

  public ArrayList<A> ArrayToList() {
    return new ArrayList<>(List.of(this.array));
  }
}
