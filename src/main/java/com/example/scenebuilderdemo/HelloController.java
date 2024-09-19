package com.example.scenebuilderdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField fnTextBox;

    @FXML
    private TextField snTextBox;

    @FXML
    private TextField totalTextBox;

    @FXML
    protected void calculate(){
        double first_number = Double.parseDouble(fnTextBox.getText());
        double second_number = Double.parseDouble(snTextBox.getText());

        double total = first_number + second_number;
        totalTextBox.setText(Double.toString(total));

    }
}