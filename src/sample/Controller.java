package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;



    public void switchToScene1(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene2(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToDashboard(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        System.out.println("has been clicked");
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAccount(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("account.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToBalance(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("balance.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAnalytics(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("analytics.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPricing(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("pricing.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToHistory(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("history.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToIdea(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("newpool.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToDev(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("dev.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSupport(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("support.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToCommunity(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("community.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToCouncil(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("council.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToMetaverse(ActionEvent Event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("metaverse.fxml"));
        stage = (Stage)((Node)Event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
