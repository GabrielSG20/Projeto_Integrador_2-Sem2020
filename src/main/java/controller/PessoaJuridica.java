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
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import application.Main;

public class PessoaJuridica implements Initializable {
    @FXML
    private TextField txtNomeFantasia;
    @FXML
    private TextField txtCNPJEmpresa;
    @FXML
    private TextField txtNomeFornecedor;
    @FXML
    private TextField txtCNPJFornecedor;
    @FXML
    private TextField txtTipoFornecedor;
    @FXML
    private TextField txtEmail;
    @FXML
    private Button btnRetornarPJ;
    @FXML
    private Button btnProsseguirPJ;

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
            Main.salvarPJ(txtNomeFantasia.getText(), txtCNPJEmpresa.getText(), txtNomeFornecedor.getText(),
            txtCNPJFornecedor.getText(), txtTipoFornecedor.getText());

            txtNomeFantasia.setText("");
            txtCNPJEmpresa.setText("");
            txtEmail.setText("");
            txtNomeFornecedor.setText("");
            txtCNPJFornecedor.setText("");
            txtTipoFornecedor.setText("");

            Main.changeScreen("tipoconta");
        } else {
            
        }
    }
}