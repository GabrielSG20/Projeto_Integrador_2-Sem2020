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
public class CadastroEnergia2 implements Initializable {
    @FXML
    private TextField txtMesReferenciaEnergia;
    @FXML 
    private TextField txtNumeroInstalacao;
    @FXML
    private TextField txtContadoMesKWG;
    @FXML
    private TextField txtDataVencimento;
    @FXML
    private TextField txtValorTotal;
    @FXML
    private TextField txtConstMulti;
    @FXML
    private TextField txtNRdoMedidor;
    @FXML
    private TextField txtLeituraAnteriorEnergia;
    @FXML 
    private TextField txtLeituraAtualEnergia;
    @FXML 
    private TextField txtDataLeituraAnterior;
    @FXML
    private TextField txtDataLeituraAtual;
    @FXML
    private ComboBox txtBandeirasTarifarias;
    @FXML
    private Button btnVoltarTelaInical;
    @FXML
    private Button btnRetornarEnergia;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

        txtBandeirasTarifarias.getItems().add("Verd");
        txtBandeirasTarifarias.getItems().add("Amarela");
        txtBandeirasTarifarias.getItems().add("Vermelha");
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("energia1Scene");
    }

    public void changeScreenVoltarTelaInicial(ActionEvent event) {
        Alert confirmacao = new Alert(AlertType.CONFIRMATION);
        confirmacao.setTitle("Confirmação de Cadastro");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("DESEJA ADICIONAR UM CADASTRO?");

        Optional<ButtonType> result = confirmacao.showAndWait();
        if (result.get() == ButtonType.OK){
            Main.changeScreen("main");
            txtMesReferenciaEnergia.setText("");
            txtNumeroInstalacao.setText("");
            txtContadoMesKWG.setText("");
            txtDataVencimento.setText("");
            txtValorTotal.setText("");
            txtConstMulti.setText("");
            txtNRdoMedidor.setText("");
            txtLeituraAnteriorEnergia.setText("");
            txtLeituraAtualEnergia.setText("");
            txtDataLeituraAnterior.setText("");
            txtDataLeituraAtual.setText("");
            Alert Alert = new Alert(AlertType.INFORMATION);
            Alert.setTitle("Confirmação de Cadastro");
            Alert.setHeaderText(null);
            Alert.setContentText("CADASTRO EFETUADO COM SUCESSO!");
            Alert.showAndWait();
        } else {
            
        }
    }
}