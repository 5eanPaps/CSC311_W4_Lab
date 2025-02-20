package com.example.csc311_w4_lab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginViewController {

    @FXML
    private TextField password;

    @FXML
    private TextField username;

    @FXML
    void onEnterClick(ActionEvent event) throws IOException {
        Scene scene = username.getScene();

        FXMLLoader landingRoot = new FXMLLoader(Application.class.getResource("landing-view.fxml"));

        scene.setRoot(landingRoot.load());
    }

    @FXML
    void onRegisterClick(ActionEvent event) {

    }

}
