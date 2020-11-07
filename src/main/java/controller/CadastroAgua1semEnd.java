package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import util.TextFieldFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import application.Main;

public class CadastroAgua1semEnd implements Initializable  {
    @FXML
    private TextField txtGR;
    @FXML
    private TextField txtCodigoCliente;
    @FXML
    private TextField txtNumeroConta;
    @FXML
    private TextField txtMesReferencia;
    @FXML
    private TextField txtTipoLigacao;
    @FXML
    private TextField txtHidrometro;
    @FXML
    private TextField txtLeituraAntData;
    @FXML
    private TextField txtLeituraAntNumero;
    @FXML
    private TextField txtLeituraAtualData;
    @FXML
    private TextField txtLeituraAtualNumero;
    @FXML
    private TextField txtConsumo;   
    @FXML
    private Button btnRetornarAgua1;
    @FXML
    private Button btnSalvarContinuar;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("tipoconta");
    }

    public void changeScreenContinuar(ActionEvent event) {
            Alert confirmacao = new Alert(AlertType.CONFIRMATION);
        confirmacao.setTitle("Confirmação de Informações");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("CONFIRMA ESSAS INFORMAÇÕES?");

        Optional<ButtonType> result = confirmacao.showAndWait();
        if (result.get() == ButtonType.OK){          
            txtGR.setText("");
            txtMesReferencia.setText("");
            txtConsumo.setText("");
            txtCodigoCliente.setText("");
            txtNumeroConta.setText("");
            txtLeituraAntData.setText("");
            txtLeituraAntNumero.setText("");
            txtLeituraAtualData.setText("");
            txtLeituraAtualNumero.setText("");
            txtHidrometro.setText("");
            txtTipoLigacao.setText("");
            Main.changeScreen("agua2");
        } else {
            
        }
    }

 // Mascaras
    @FXML
    private void mascaraDataAnt(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("##/##/##");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtLeituraAntData);
        tff.formatter();
    }

    @FXML
    private void mascaraDataAtual(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("##/##/##");
        tff.setCaracteresValidos("0123456789");
        tff.setTf( txtLeituraAtualData);
        tff.formatter();
    }
}
