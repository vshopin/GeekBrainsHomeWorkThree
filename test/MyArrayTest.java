import lesson_six.first_task.MyArray;
import lesson_six.first_task.RuntimeException;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class MyArrayTest {
  @Test
  public void testOneFour() throws RuntimeException {
    var array = new MyArray(new ArrayList<>(List.of(1, 5, 4, 9, 0)));
    var result = array.returnArray();
    var expected = new ArrayList<>(List.of(9, 0));
    Assert.assertEquals(expected, result);
  }

  @Test
  public void testTwoFour() throws RuntimeException {
    var array = new MyArray(new ArrayList<>(List.of(1, 4, 5, 4, 9, 0)));
    var result = array.returnArray();
    var expected = new ArrayList<>(List.of(9, 0));
    Assert.assertEquals(expected, result);
  }

  @Test
  public void testLastFour() {
    var array = new MyArray(new ArrayList<>(List.of(1, 4, 5, 4, 9, 4)));
    Assert.assertThrows(RuntimeException.class, () -> {array.returnArray();});
  }

  @Test
  public void testWithoutFour() {
    var array = new MyArray(new ArrayList<>(List.of(0, 0, 0, 0, 0, 0)));
    Assert.assertThrows(RuntimeException.class, () -> {array.returnArray();});
  }

  @Test
  public void testEmptyArray() {
    var array = new MyArray(new ArrayList<>(List.of()));
    Assert.assertThrows(RuntimeException.class, () -> {array.returnArray();});
  }
}
