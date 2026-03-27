package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ColorChooser extends Application {
    @Override
    
    public void start(Stage stage) throws Exception {
        // Adding the leading / makes it look globally in the resources folder
        Parent root = FXMLLoader.load(getClass().getResource("/org/example/ColorChooser.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("Color Chooser");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}