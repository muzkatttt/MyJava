package lesson3;

import lesson1.Applications;

import java.awt.*;
import java.io.IOException;

public class Gui extends Applications {


    public static void main(String[] args) {
        System.out.println("код с семинара");
        //Applications.launch(Gui.class);
    }

    /*
    private void prepareStage(Button button, Stage stage) {
        VBox vBox = new VBox();
        vBox.setAligment(Pos.CENTER);
        vBox.
    }
        @Override
        public void start(Stage primaryStage) throws Exception {
            Button button = new Button("save");
            button.setOnAction((event) -> {
                SaveService saveService = new saveService();
                try {
                    saveService.save();
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "saved successfully");
                    alert.getDialogPane().setStyle("-fx-font-family: serif");
                    alert.showAndWait();
                } catch (IOException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR, "saved successfully");
                    alert.getDialogPane().setStyle("-fx-font-family: serif");
                    alert.showAndWait();
                }
            });
            prepareStage(button, primaryStage);
            primaryStage.show();
        }
    }
*/
}
