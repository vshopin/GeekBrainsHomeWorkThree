package lesson_one.first_task;


import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    var testArray = new int[]{1, 2, 3, 4};
    var test = new FirstTask();
    var result = Arrays.toString(test.componentChange(testArray, 1, 2));
    System.out.println(result);
  }
}
