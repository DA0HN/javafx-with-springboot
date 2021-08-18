package me.gabriel.desktop.application.config;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import me.gabriel.desktop.ApplicationBootLoader;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

public class JavaFxApplication extends Application {

  private ConfigurableApplicationContext context;

  @Override
  public void init() {
    this.context = new SpringApplicationBuilder()
      .sources(ApplicationBootLoader.class)
      .run(getParameters().getRaw().toArray(new String[0]));
  }

  @Override
  public void start(Stage primaryStage) {
    context.publishEvent(new StageReadyEvent(primaryStage));
  }

  @Override
  public void stop() {
    context.close();
    Platform.exit();
  }

  static public class StageReadyEvent extends ApplicationEvent {

    public StageReadyEvent(Stage stage) {
      super(stage);
    }

    public Stage getStage() {
      return (Stage) getSource();
    }
  }
}
