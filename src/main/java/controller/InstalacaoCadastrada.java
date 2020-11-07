package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import util.TextFieldFormatter;
import application.Main;

public class InstalacaoCadastrada implements Initializable {
    @FXML
    private TextField txtNumeroInstalacao;
    @FXML
    private TextField txtRGI;
    @FXML
    private Button btnBuscarEnergia;
    @FXML
    private Button btnBuscarAgua;
    @FXML
    private Button btnRetornarInicial;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("main");
    }

    public void buscarEnergia(ActionEvent event) {
        Alert Alert = new Alert(AlertType.INFORMATION);
        Alert.setTitle("Confirmação de Instalação");
        Alert.setHeaderText(null);
        Alert.setContentText("INSTALAÇÃO ENCONTRADA COM SUCESSO!");
        Alert.showAndWait();
        
        // Colocar opção de erro

        Main.changeScreen("energiasemend");
    }

    public void buscarAgua(ActionEvent event) {
        Alert Alert = new Alert(AlertType.INFORMATION);
        Alert.setTitle("Confirmação de Instalação");
        Alert.setHeaderText(null);
        Alert.setContentText("INSTALAÇÃO ENCONTRADA COM SUCESSO!");
        Alert.showAndWait();
        
        // Colocar opção de erro

        Main.changeScreen("aguasemend");
    }

    // Mascaras
    @FXML
    private void mascaraRGI(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("########/##");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtRGI);
        tff.formatter();
    }
}