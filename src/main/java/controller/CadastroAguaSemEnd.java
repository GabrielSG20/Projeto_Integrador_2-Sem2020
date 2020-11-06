package controller;

import java.math.BigInteger;
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
import util.TextFieldFormatter;
import application.Main;
import classes.Conta;
import dao.ContaDAO;

public class CadastroAguaSemEnd implements Initializable {
    @FXML
    private TextField txtGR;
    @FXML
    private TextField txtMesReferencia;
    @FXML
    private TextField txtConsumo;
    @FXML
    private TextField txtCodigoCliente;
    @FXML
    private TextField txtNumeroConta;
    @FXML
    private TextField txtLeituraAnteriorData;
    @FXML
    private TextField txtLeituraAtualData;
    @FXML
    private TextField txtLeituraAnteriorLeitura;
    @FXML
    private TextField txtLeituraAtualLeitura;
    @FXML
    private TextField txtHidrometro;
    @FXML
    private TextField txtTipoLigacao;
    @FXML
    private Button btnRetornarAguaSemEnd;
    @FXML
    private Button btnSalvarContinuar;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("instalacaocadastrada");
    }

    public void changeScreenContinuar(ActionEvent event) {
            Alert confirmacao = new Alert(AlertType.CONFIRMATION);
        confirmacao.setTitle("Confirmação de Informações");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("CONFIRMA ESSAS INFORMAÇÕES?");

        Optional<ButtonType> result = confirmacao.showAndWait();
        if (result.get() == ButtonType.OK){
            Conta cta = new Conta();
            ContaDAO conta_dao = new ContaDAO();
            cta.setCta_mes_referencia(txtMesReferencia.getText());

            conta_dao.create(cta);

            Main.changeScreen("agua2");

            txtGR.setText("");
            txtMesReferencia.setText("");
            txtConsumo.setText("");
            txtCodigoCliente.setText("");
            txtNumeroConta.setText("");
            txtLeituraAnteriorData.setText("");
            txtLeituraAtualData.setText("");
            txtLeituraAnteriorLeitura.setText("");
            txtLeituraAtualLeitura.setText("");
            txtHidrometro.setText("");
            txtTipoLigacao.setText("");
        } else {
            
        }
    }

    // Mascaras
    @FXML
    private void mascaraGR(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtGR);
        tff.formatter();
    }

    @FXML
    private void mascaraCodigoCliente(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtCodigoCliente);
        tff.formatter();
    }

    @FXML
    private void mascaraNumeroConta(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtNumeroConta);
        tff.formatter();
    }

    @FXML
    private void mascaraDataAnt(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("##/##/##");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtLeituraAnteriorData);
        tff.formatter();
    }

    @FXML
    private void mascaraDataAtual(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("##/##/##");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtLeituraAtualData);
        tff.formatter();
    }

    @FXML
    private void mascaraLeituraAnt(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtLeituraAnteriorLeitura);
        tff.formatter();
    }

    @FXML
    private void mascaraLeituraAtual(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtLeituraAtualLeitura);
        tff.formatter();
    }

    @FXML
    private void mascaraConsumo(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtConsumo);
        tff.formatter();
    }
}