package lesson_one.first_task;

public class FirstTask {
  public int[] componentChange(int[] array, int indexOne, int indexTwo) {
    var item = array[indexOne];
    array[indexOne] = array[indexTwo];
    array[indexTwo] = item;
    return array;
  }
}
