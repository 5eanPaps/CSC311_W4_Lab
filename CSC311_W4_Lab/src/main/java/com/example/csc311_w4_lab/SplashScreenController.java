package com.example.csc311_w4_lab;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class SplashScreenController {
    @FXML
    ImageView img = new ImageView();

    @FXML
    void onClick(MouseEvent event) throws IOException {
        Scene scene = ((ImageView)event.getSource()).getScene();

        FXMLLoader loginRoot = new FXMLLoader(Application.class.getResource("login-view.fxml"));

        scene.setRoot(loginRoot.load());
    }

}