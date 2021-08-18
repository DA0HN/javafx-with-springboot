package me.gabriel.desktop.application.config;

import javafx.scene.Scene;
import javafx.stage.Stage;
import me.gabriel.desktop.application.controllers.MainWindow;
import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import static me.gabriel.desktop.application.config.JavaFxApplication.StageReadyEvent;

/**
 * @author daohn
 * @since 18/08/2021
 */
@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {

  private final FxWeaver fxWeaver;

  @Autowired
  public StageInitializer(FxWeaver fxWeaver) {
    this.fxWeaver = fxWeaver;
  }

  @Override
  public void onApplicationEvent(StageReadyEvent event) {
    Stage stage = event.getStage();
    Scene scene = new Scene(fxWeaver.loadView(MainWindow.class), 400, 300);
    stage.setScene(scene);
    stage.show();
  }
}
