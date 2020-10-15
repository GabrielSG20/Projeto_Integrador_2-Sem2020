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

public class CadastroEnergia implements Initializable {
    @FXML
    private TextField txtNumeroInstalacao;
    @FXML
    private TextField txtCEPEnergia;
    @FXML
    private TextField txtMesReferenciaEnergia;
    @FXML
    private TextField txtTotalResidencial;
    @FXML
    private TextField txtDataVencimento;
    @FXML
    private TextField txtConsumo;
    @FXML
    private TextField txtValorTotal;
    @FXML
    private TextField txtEnderecoEnergia;
    @FXML
    private TextField txtNumeroEnergia;
    @FXML
    private Button btnVoltarTelaIncial;
    @FXML
    private Button btnRetornarEnergia;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("tipoconta");
    }

    public void changeScreenVoltarTelaInicial(ActionEvent event) {
        Alert confirmacao = new Alert(AlertType.CONFIRMATION);
        confirmacao.setTitle("Confirmação de Cadastro");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("DESEJA ADICIONAR UM CADASTRO?");

        Optional<ButtonType> result = confirmacao.showAndWait();
        if (result.get() == ButtonType.OK){
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