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
import util.TextFieldFormatter;
import application.Main;

public class CadastroAgua2 implements Initializable {
    @FXML
    private TextField txtTarifa10agua;
    @FXML
    private TextField txtTarifa20agua;
    @FXML
    private TextField txtTarifa30agua;
    @FXML
    private TextField txtTarifa50agua;
    @FXML
    private TextField txtTarifaMais50agua;
    @FXML
    private TextField txtValorAgua1;
    @FXML
    private TextField txtValorAgua2;
    @FXML
    private TextField txtTarifa10esgoto;
    @FXML
    private TextField txtTarifa20esgoto;
    @FXML
    private TextField txtTarifa30esgoto;
    @FXML
    private TextField txtTarifa50esgoto;
    @FXML
    private TextField txtTarifaMais50esgoto;
    @FXML
    private TextField txtValorEsgoto1;
    @FXML
    private TextField txtValorEsgoto2;
    @FXML
    private TextField txtVencimento;
    @FXML
    private TextField txtTotalAgua;
    @FXML
    private TextField txtTotalEsgoto;
    @FXML
    private TextField txtTaxaRegulacao;
    @FXML
    private TextField txtMulta;
    @FXML
    private Button btnSalvarVoltarTelaInicial;
    @FXML
    private Button btnRetornarAgua2;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("agua1");
    }

    public void changeScreenVoltarTelaInicial(ActionEvent event) {
        Alert confirmacao = new Alert(AlertType.CONFIRMATION);
        confirmacao.setTitle("Confirmação de Cadastro");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("DESEJA ADICIONAR UM CADASTRO?");

        Optional<ButtonType> result = confirmacao.showAndWait();
        if (result.get() == ButtonType.OK){
            Main.salvarConta2(txtVencimento);
            Main.salvarAgua2(txtTarifa10agua, txtTarifa20agua, txtTarifa30agua, txtTarifa50agua, txtTarifaMais50agua, 
            txtValorAgua1, txtValorAgua2, txtTarifa10esgoto, txtTarifa20esgoto, txtTarifa30esgoto, txtTarifa50esgoto, 
            txtTarifaMais50esgoto, txtValorEsgoto1, txtValorEsgoto2, txtTotalAgua, txtTotalEsgoto, txtTaxaRegulacao, 
            txtMulta);

            Main.changeScreen("main");

            txtTarifa10agua.setText("");
            txtTarifa20agua.setText("");
            txtTarifa30agua.setText("");
            txtTarifa50agua.setText("");
            txtTarifaMais50agua.setText("");
            txtValorAgua1.setText("");
            txtValorAgua2.setText("");
            txtTarifa10esgoto.setText("");
            txtTarifa20esgoto.setText("");
            txtTarifa30esgoto.setText("");
            txtTarifa50esgoto.setText("");
            txtTarifaMais50esgoto.setText("");
            txtValorEsgoto1.setText("");
            txtValorEsgoto2.setText("");
            txtVencimento.setText("");
            txtTotalAgua.setText("");
            txtTotalEsgoto.setText("");
            txtTaxaRegulacao.setText("");
            txtMulta.setText("");

            Alert Alert = new Alert(AlertType.INFORMATION);
            Alert.setTitle("Confirmação de Cadastro");
            Alert.setHeaderText(null);
            Alert.setContentText("CADASTRO EFETUADO COM SUCESSO!");
            Alert.showAndWait();
        } else {
            
        }
    }

    // Mascaras
    @FXML
    private void mascaraVencimento(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("##/##/##");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtVencimento);
        tff.formatter();
    }
    @FXML
    private void mascaraTarifa10agua(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtTarifa10agua);
        tff.formatter();
    }
    @FXML
    private void mascaraTarifa20Agua(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtTarifa20agua);
        tff.formatter();
    }
    @FXML
    private void mascaraTarifa30Agua(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtTarifa30agua);
        tff.formatter();
    }
    @FXML
    private void mascaraTarifa50Agua(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtTarifa50agua);
        tff.formatter();
    }
    @FXML
    private void mascaraTarifa50Acima(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtTarifaMais50agua);
        tff.formatter();
    }
    @FXML
    private void mascaraValorAgua1(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtValorAgua1);
        tff.formatter();
    }
    @FXML
    private void mascaraValorAgua2(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtValorAgua2);
        tff.formatter();
    }
    @FXML
    private void mascaraTarifa10esgoto(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtTarifa10esgoto);
        tff.formatter();
    }
    @FXML
    private void mascaraTarifa20Esgoto(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtTarifa20esgoto);
        tff.formatter();
    }
    @FXML
    private void mascaraTarifa30Esgoto(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtTarifa30esgoto);
        tff.formatter();
    }
    @FXML
    private void mascaraTarifa50Esgoto(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtTarifa50esgoto);
        tff.formatter();
    }
    @FXML
    private void mascaraTarifaEsgoto50Acima(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtTarifaMais50esgoto);
        tff.formatter();
    }
    @FXML
    private void mascaraValorEsgoto1(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtValorEsgoto1);
        tff.formatter();
    }
    @FXML
    private void mascaraValorEsgoto2(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtValorEsgoto2);
        tff.formatter();
    }
    @FXML
    private void mascaraTotalAgua(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtTotalAgua);
        tff.formatter();
    }
    @FXML
    private void mascaraTotalEsgoto(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtTotalEsgoto);
        tff.formatter();
    }
    @FXML
    private void mascaraTaxaRegulamentacao(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtTaxaRegulacao);
        tff.formatter();
    }
    @FXML
    private void mascaraMulta(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtMulta);
        tff.formatter();
    }
}