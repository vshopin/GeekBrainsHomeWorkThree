package lesson_one.third_task;

public class Main {
  public static void main(String[] args) {
    var appleOne = new Apple();
    var appleTwo = new Apple();
    var appleThree = new Apple();

    var orangeOne = new Orange();
    var orangeTwo = new Orange();

    var appleBox = new Box<>(appleOne, appleTwo, appleThree);
    var orangeBox = new Box<>(orangeOne, orangeTwo);

    System.out.println(appleBox.compare(orangeBox));

    var boxThree = new Box<Orange>();
    orangeBox.transfer(boxThree);
    System.out.println(boxThree.getItems());
    System.out.println(orangeBox.getItems());
  }
}
