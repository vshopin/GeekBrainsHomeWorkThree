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

  @Test(expected = RuntimeException.class)
  public void testLastFour() throws RuntimeException {
    var array = new MyArray(new ArrayList<>(List.of(1, 4, 5, 4, 9, 4)));
    array.returnArray();
  }

  @Test(expected = RuntimeException.class)
  public void testWithoutFour() throws RuntimeException {
    var array = new MyArray(new ArrayList<>(List.of(0, 0, 0, 0, 0, 0)));
    array.returnArray();
  }

  @Test(expected = RuntimeException.class)
  public void testEmptyArray() throws RuntimeException {
    var array = new MyArray(new ArrayList<>(List.of()));
    array.returnArray();
  }
}
