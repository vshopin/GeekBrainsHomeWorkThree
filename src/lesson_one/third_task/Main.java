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

    var compare = appleBox.compare(orangeBox);
    System.out.println(compare);

    var boxThree = new Box<Orange>();
    orangeBox.transfer(boxThree);
    var boxThreeGetItems = boxThree.getItems();
    var orangeBoxGetItems = orangeBox.getItems();
    System.out.println(boxThreeGetItems);
    System.out.println(orangeBoxGetItems);
  }
}
