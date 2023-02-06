package lesson_one.second_task;

class TestApp {
  public static void main(String[] args) {
    SecondTask<Integer> test = new SecondTask<>(1, 2, 3, 4);
    var res = test.ArrayToList();
    System.out.println(res);
  }
}
