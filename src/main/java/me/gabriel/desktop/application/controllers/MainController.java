package me.gabriel.desktop.application.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.springframework.stereotype.Component;

/**
 * @author daohn
 * @since 18/08/2021
 */
@Component
public class MainController {

  @FXML
  private Button openDialogButton;

  @FXML
  public void initialize() {
    openDialogButton.setOnAction(event -> System.out.println("Ola"));
  }

}
