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
        if(txtCodigoCliente.getText().equals("") || txtGR.getText().equals("") || txtMesReferencia.getText().equals("") || txtNumeroConta.getText().equals("") || txtLeituraAnteriorData.getText().equals("") || txtLeituraAnteriorLeitura.getText().equals("") || txtLeituraAtualData.getText().equals("") || txtLeituraAtualLeitura.getText().equals("") || txtConsumo.getText().equals("")) {
            
            Alert Alert = new Alert(AlertType.INFORMATION);
            Alert.setTitle("Campos Obrigatórios Vazios");
            Alert.setHeaderText(null);
            Alert.setContentText("PREENCHA OS CAMPOS COM *");
            Alert.showAndWait(); 

        }
        else {
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
                txtLeituraAnteriorData.setText("");
                txtLeituraAtualData.setText("");
                txtLeituraAnteriorLeitura.setText("");
                txtLeituraAtualLeitura.setText("");
                txtHidrometro.setText("");
                txtTipoLigacao.setText("");

                Main.changeScreen("agua2");
            } else {
            
            }
        }
    }
}