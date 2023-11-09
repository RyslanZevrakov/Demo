package com.example.demo;



import com.example.demo.User;
import com.example.demo.Users;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField loginTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private Label messageText;

    @FXML
    public void onLoginButtonClic(ActionEvent actionEvent) throws IOException {
        if(checkData()) {
            Stage menuStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 620, 440);
            menuStage.setTitle("Menu");
            menuStage.setScene(scene);
            menuStage.show();
        }
        messageText.setText("Неверные данные. Попробуйте ещё.");
    }

    private boolean checkData() {
        Users usersList = new Users();
        for (User user: usersList.users) {
            if (user.getLogin().equals(loginTextField.getText())
                    && (user.getPassword().equals(passwordTextField.getText()))) {
                return true;
            }
        }
        return false;
    }
}