package com.nbicocchi.javafx.planes.login;

import com.nbicocchi.javafx.planes.login.Validator;
import com.nbicocchi.javafx.planes.login.ValidatorDatabase;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.io.IOException;
import java.util.Optional;

public class Applogin extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("application-view.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Application");
        primaryStage.setScene(scene);
        primaryStage.show();
        //showLogin(primaryStage);
    }

    /*
    private void showLogin(Stage primaryStage) throws IOException {
        LoginDialog loginDialog = new LoginDialog(primaryStage);
        Optional<Pair<String, String>> result = loginDialog.showAndWait();
        result.ifPresentOrElse(credentials -> {
            Validator validator = new ValidatorDatabase();
            validator.connect();
            if (!validator.checkCredentials(credentials.getKey(), credentials.getValue())) {
                Alert a = new Alert(Alert.AlertType.WARNING, "Login Failed");
                a.setHeaderText("Login failed");
                a.setContentText("Username and/or password not valid");
                a.showAndWait();
                Platform.exit();
            }
        }, Platform::exit);
    }

     */
}
