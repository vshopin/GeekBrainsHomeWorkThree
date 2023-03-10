import lesson_six.second_task.ArrayFourAndOne;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class ArrayFourAndOneTest {
  @Test
  public void oneFour() {
    var array = new ArrayFourAndOne(new ArrayList<>(List.of(5, 4, 9, 0)));
    var result = array.checkArray();
    Assert.assertEquals(true, result);
  }

  @Test
  public void oneOne() {
    var array = new ArrayFourAndOne(new ArrayList<>(List.of(1, 5, 9, 0)));
    var result = array.checkArray();
    Assert.assertEquals(true, result);
  }

  @Test
  public void oneAndFour() {
    var array = new ArrayFourAndOne(new ArrayList<>(List.of(1, 4, 5, 4, 9, 4)));
    var result = array.checkArray();
    Assert.assertEquals(true, result);
  }

  @Test
  public void withoutFourAndOne() {
    var array = new ArrayFourAndOne(new ArrayList<>(List.of(0, 0, 0, 0, 0, 0)));
    var result = array.checkArray();
    Assert.assertEquals(false, result);
  }

  @Test
  public void emptyArray() {
    var array = new ArrayFourAndOne(new ArrayList<>(List.of()));
    var result = array.checkArray();
    Assert.assertEquals(false, result);
  }
}
