package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import application.Main;

public class CadastroAgua implements Initializable {
    @FXML
    private Button btnRetornar;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnbtnVoltarTelaIncial;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("tipoconta");
    }

    public void changeScreenVoltarTelaInicial(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmação de Cadastro");
        alert.setHeaderText(null);
        alert.setContentText("Deseja adicionar o cadastro?");
        alert.getDialogPane().setPrefSize(700, 500);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            Main.changeScreen("main");
            alert.showAndWait();
            Alert Alert = new Alert(AlertType.INFORMATION);
            Alert.setTitle("Confirmação de Cadastro");
            Alert.setHeaderText(null);
            Alert.setContentText("Cadastro efetuado com sucesso!");
            Alert.getDialogPane().setPrefSize(700, 500);
            Alert.showAndWait();
        } else {
            // ... user chose CANCEL or closed the dialog
        }
    }
    
    public void salvarCadastro(ActionEvent evenent){

    }
}