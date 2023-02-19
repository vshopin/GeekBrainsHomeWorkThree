package lesson_six.first_task;

import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class RuntimeException extends Exception {
  public RuntimeException() {
    log.log(Level.WARNING, "В массиве нет ни одной четверки", getMessage());
  }
}
