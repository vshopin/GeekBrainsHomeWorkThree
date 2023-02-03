package lesson_one;

import java.util.Arrays;

public class FirtsTask {
  public int[] componentChange(int[] array, int indexOne, int indexTwo) {
    var item = array[indexOne];
    array[indexOne] = array[indexTwo];
    array[indexTwo] = item;
    return array;
  }
}

class Test {
  public static void main(String[] args) {
    var testArray = new int[]{1, 2, 3, 4};
    var test = new FirtsTask();
    System.out.println(Arrays.toString(test.componentChange(testArray, 1, 2)));
  }
}
