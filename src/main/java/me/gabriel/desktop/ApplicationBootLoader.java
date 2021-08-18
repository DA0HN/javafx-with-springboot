package me.gabriel.desktop;

import javafx.application.Application;
import me.gabriel.desktop.application.config.JavaFxApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author daohn
 * @since 17/08/2021
 */
@SpringBootApplication
public class ApplicationBootLoader {

  public static void main(String[] args) {
    Application.launch(JavaFxApplication.class, args);
  }

}
