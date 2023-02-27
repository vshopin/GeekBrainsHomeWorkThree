package lesson_seven;

import lombok.extern.java.Log;
import java.util.logging.Level;

@Log
public class RuntimeException extends Exception {
  public RuntimeException(int cntBeforeSuite, int cntAfterSuite) {
    log.log(Level.WARNING, "Методы с аннотациями cntAfterSuite: " + cntBeforeSuite + " и cntAfterSuite: "
      + cntAfterSuite + " должны быть в единстенном экземпляре\n", getMessage());
  }
}
