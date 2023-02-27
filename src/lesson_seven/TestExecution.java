package lesson_seven;

import lombok.extern.java.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.logging.Level;

@Log
public class TestExecution {
  public static void start(Class<?> className) throws RuntimeException {
    final int MIN_PRIORITY = 1;
    final int MAX_PRIORITY = 10;
    var cntBeforeSuite = 0;
    var cntAfterSuite = 0;
    var map = new HashMap<Integer, Method>();

    for (Method method : className.getDeclaredMethods()) {
      if (method.getAnnotation(BeforeSuite.class) != null) {
        map.put(MIN_PRIORITY - 1, method);
        cntBeforeSuite++;
      }
      if (method.getAnnotation(AfterSuite.class) != null) {
        map.put(MAX_PRIORITY + 1, method);
        cntAfterSuite++;
      }
      if (method.getAnnotation(Test.class) != null) {
        Test test = method.getAnnotation(Test.class);
        map.put(test.priority(), method);
      }
    }
    if (cntBeforeSuite == 1 && cntAfterSuite == 1) {
      System.out.printf("\nMap for %s:\n", className.getSimpleName());
      for (Integer key : map.keySet()) {
        System.out.printf("priority:%d %s\n", key, map.get(key).getName());
      }
      System.out.printf("\nReflections for %s\n", className.getSimpleName());

      var testCase = new TestCase();
      map.keySet().forEach(key -> {
        try {
          map.get(key).invoke(testCase);
        } catch (IllegalAccessException e) {
          log.log(Level.WARNING, "Методы invoke не имеет доступа к объекту testCase\n", e.getMessage());
        } catch (InvocationTargetException e) {
          log.log(Level.WARNING, "Получено исключение в вызываемом методе объекта testCase\n", e.getMessage());
        }
      });
    } else {
      throw new RuntimeException(cntBeforeSuite, cntAfterSuite);
    }
  }

  public static void main(String[] args) {
    System.out.println("Annotations analyze:");
    try {
      start(TestCase.class);
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
  }
}
