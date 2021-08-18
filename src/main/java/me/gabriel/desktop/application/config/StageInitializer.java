package me.gabriel.desktop.application.config;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static me.gabriel.desktop.application.config.JavaFxApplication.StageReadyEvent;

/**
 * @author daohn
 * @since 18/08/2021
 */
@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {

  private final String applicationTitle;
  private final Resource fxml;
  private final ApplicationContext context;

  @Autowired
  public StageInitializer(
    @Value("${spring.application.ui.title}") String applicationTitle,
    @Value("classpath:/MainController.fxml") Resource resource,
    ApplicationContext context
  ) {
    this.applicationTitle = applicationTitle;
    this.fxml = resource;
    this.context = context;
  }


  @Override public void onApplicationEvent(StageReadyEvent stageReadyEvent) {
    try {
      var stage = stageReadyEvent.getStage();

      var fxmlLoader = new FXMLLoader(this.fxml.getURL());

      fxmlLoader.setControllerFactory(context::getBean);

      var scene = new Scene(fxmlLoader.load(), 600, 600);

      stage.setScene(scene);
      stage.setTitle(applicationTitle);
      stage.show();
    }
    catch(IOException e) {
      e.printStackTrace();
    }
  }
}
