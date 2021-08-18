package me.gabriel.desktop.application.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import net.rgielen.fxweaver.core.FxControllerAndView;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;

/**
 * @author daohn
 * @since 18/08/2021
 */
@Component
@FxmlView
public class MainWindow {

  private final FxControllerAndView<SomeDialog, VBox> someDialog;

  @FXML
  public Button openDialogButton;

  public MainWindow(FxControllerAndView<SomeDialog, VBox> someDialog) {
    this.someDialog = someDialog;
  }

  @FXML
  public void initialize() {
    openDialogButton.setOnAction(
      actionEvent -> someDialog.getController().show()
    );
  }

}
