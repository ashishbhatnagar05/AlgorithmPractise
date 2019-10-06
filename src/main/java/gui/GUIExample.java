package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GUIExample extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("IFlow Update Screen");
    Label interfaceId = new Label("Please enter interface ID:  ");
    TextField textField = new TextField();
    Label label = new Label("   Please click to call service    ");
    Button button = new Button("Click");

    button.setOnAction(
        value -> {
          label.setText("  Service called!");
          System.out.println(textField.getText());
          textField.clear();
        });

    HBox hbox = new HBox(interfaceId, textField, button, label);

    Scene scene = new Scene(hbox, 500, 100);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
