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

public class CadastroEnergiaSemEnd implements Initializable {
    @FXML
    private TextField txtMesReferenciaEnergia;
    @FXML
    private TextField txtContaKwH;
    @FXML
    private TextField txtDataVencimento;
    @FXML
    private TextField txtDataLeituraAnterior;
    @FXML
    private TextField txtDataLeituraAtual;
    @FXML
    private TextField txtNRdoMedidor;
    @FXML
    private TextField txtConstMulti;
    @FXML
    private TextField txtValorTotalAPagar;
    @FXML
    private TextField txtLeituraAnterior; 
    @FXML 
    private TextField txtLeituraAtual;
    @FXML
    private TextField txtCodigoFiscal;
    @FXML
    private TextField txtGrupoSubgrupo;
    @FXML
    private TextField txtFornecimento;
    @FXML
    private TextField txtClasseSubclasse;
    @FXML
    private TextField txtTensaoNominal;
    @FXML
    private TextField txtMTarifaria;
    @FXML 
    private TextField txtRoteiroLeitura;
    @FXML
    private Button btnRetornarEnergia;
    @FXML
    private Button btnVoltarTelaIncial;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("instalacaoCadastradaScene");
    }

    public void changeScreenVoltarTelaInicial(ActionEvent event) {
            Alert confirmacao = new Alert(AlertType.CONFIRMATION);
        confirmacao.setTitle("Confirmação de Informações");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("CONFIRMA ESSAS INFORMAÇÕES?");

        Optional<ButtonType> result = confirmacao.showAndWait();
        if (result.get() == ButtonType.OK){
            txtMesReferenciaEnergia.setText("");
            txtContaKwH.setText("");
            txtDataVencimento.setText("");
            txtDataLeituraAnterior.setText("");
            txtDataLeituraAtual.setText("");
            txtNRdoMedidor.setText("");
            txtConstMulti.setText("");
            txtValorTotalAPagar.setText("");
            txtLeituraAnterior.setText("");
            txtLeituraAtual.setText("");
            txtCodigoFiscal.setText("");
            txtGrupoSubgrupo.setText("");
            txtFornecimento.setText("");
            txtClasseSubclasse.setText("");
            txtTensaoNominal.setText("");
            txtMTarifaria.setText("");
            txtRoteiroLeitura.setText("");
            Main.changeScreen("main");
        } else {
            
        }
    }
// Mascaras
    @FXML
    private void mascaraVencimento(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("##/##/####");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtDataVencimento);
        tff.formatter();
    }
    @FXML
    private void mascaraDataAnt(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("##/##/####");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtDataLeituraAnterior);
        tff.formatter();
    }
    @FXML
    private void mascaraDataAtual(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("##/##/####");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtDataLeituraAtual);
        tff.formatter();
    }
}

