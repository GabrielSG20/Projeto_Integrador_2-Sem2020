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

public class CadastroAgua2 implements Initializable {
    @FXML
    private TextField txtTotalPagar;
    @FXML
    private TextField txtTarifaAguaAte10;
    @FXML 
    private TextField txtTarifaAgua11a20;
    @FXML
    private TextField txtTarifaAgua21a30;
    @FXML
    private TextField txtTarifaAgua31a50;
    @FXML
    private TextField txtTarifaAcima50;
    @FXML
    private TextField txtValorAguaAte10;
    @FXML
    private TextField txtValorAgua11a20;
    @FXML
    private TextField txtTarifaEsgotoAte10;
    @FXML
    private TextField txtTarifaEsgoto11a20;
    @FXML
    private TextField txtTarifaEsgoto21a30;
    @FXML
    private TextField txtTarifaEsgoto31a50;
    @FXML
    private TextField txtTarifaEsgotoAcima50;
    @FXML
    private TextField txtValorEsgotoAte10;
    @FXML
    private TextField txtValorEsgoto11a20;
    @FXML
    private TextField txtVencimento;
    @FXML
    private TextField txtVIAgua;
    @FXML
    private TextField txtVIEsgoto;
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
        Main.changeScreen("main");
        Alert confirmacao = new Alert(AlertType.CONFIRMATION);
        confirmacao.setTitle("Confirmação de Cadastro");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("DESEJA ADICIONAR UM CADASTRO?");

        Optional<ButtonType> result = confirmacao.showAndWait();
        if (result.get() == ButtonType.OK){
            txtTotalPagar.setText("");

            Main.changeScreen("main");

            Alert Alert = new Alert(AlertType.INFORMATION);
            Alert.setTitle("Confirmação de Cadastro");
            Alert.setHeaderText(null);
            Alert.setContentText("CADASTRO EFETUADO COM SUCESSO!");
            Alert.showAndWait();
        } else {
            
        }
    }
}