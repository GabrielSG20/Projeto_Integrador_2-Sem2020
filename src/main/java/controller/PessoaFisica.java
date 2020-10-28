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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import application.Main;

public class PessoaFisica implements Initializable {
    @FXML
    private TextField txtNomeCompleto;
    @FXML
    private TextField txtCPF;
    @FXML
    private TextField txtNomeFornecedor;
    @FXML
    private TextField txtCNPJFornecedor;
    @FXML
    private TextField txtEmail;
    @FXML
    private ComboBox comboTipoFornecedor;
    @FXML
    private Button btnRetornarPF;
    @FXML
    private Button btnProsseguirPF;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("main");
    }

    public void changeScreenProsseguir(ActionEvent event) {
            Alert confirmacao = new Alert(AlertType.CONFIRMATION);
        confirmacao.setTitle("Confirmação de Informações");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("CONFIRMA ESSAS INFORMAÇÕES?");

        Optional<ButtonType> result = confirmacao.showAndWait();
        if (result.get() == ButtonType.OK){
            txtNomeCompleto.setText("");
            txtCPF.setText("");
            txtNomeFornecedor.setText("");
            txtCNPJFornecedor.setText("");
            txtEmail.setText("");

            Main.changeScreen("tipoconta");
        } else {
            
        }
    }
}