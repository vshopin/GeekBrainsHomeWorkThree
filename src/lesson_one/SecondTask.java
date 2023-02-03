package lesson_one;

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

class TestApp {
  public static void main(String[] args) {
    SecondTask<Integer> test = new SecondTask<>(1, 2, 3, 4);
    var res = test.ArrayToList();
    System.out.println(res);
  }
}
