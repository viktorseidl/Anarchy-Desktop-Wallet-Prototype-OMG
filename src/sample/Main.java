package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
            stage.setTitle("Anarchy");
            Scene scene = new Scene(root);

            // Icon am fenster feslegen
            Image icon = new Image("sample/logo.png");
            stage.getIcons().add(icon);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
