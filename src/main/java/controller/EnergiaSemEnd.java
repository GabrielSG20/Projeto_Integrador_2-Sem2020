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

public class EnergiaSemEnd implements Initializable {
    @FXML
    private TextField txtContaMes;
    @FXML
    private TextField txtConsumo;
    @FXML
    private TextField txtDataVencimento;
    @FXML
    private TextField txtTotalPagar;
    @FXML
    private TextField txtConstMulti;
    @FXML
    private TextField txtNRmedidor;
    @FXML
    private TextField txtLeituraAnterior;
    @FXML
    private TextField txtLeituraAtual;
    @FXML
    private TextField txtDataLeituraAnterior;
    @FXML
    private TextField txtDataLeituraAtual;
    @FXML
    private TextField txtCodigoFiscal;
    @FXML
    private TextField txtGrupoSubgrupo;
    @FXML
    private TextField txtFornecimento;
    @FXML
    private TextField txtClasseSubclasse;
    @FXML
    private TextField txtTarifaria;
    @FXML
    private TextField txtRoteiroLeitura;
    @FXML
    private TextField txtTensaoNominal;
    @FXML
    private ComboBox comboBandeirasTarifaria;
    @FXML
    private Button btnRetornarEnergia;
    @FXML
    private Button btnVoltarTelaIncial;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("instalacaocadastrada");
    }

    public void changeScreenVoltarTelaInicial(ActionEvent event) {
        Alert confirmacao = new Alert(AlertType.CONFIRMATION);
        confirmacao.setTitle("Confirmação de Cadastro");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("DESEJA ADICIONAR UM CADASTRO?");

        Optional<ButtonType> result = confirmacao.showAndWait();
        if (result.get() == ButtonType.OK){
            Main.changeScreen("main");

            txtContaMes.setText("");
            txtConsumo.setText("");
            txtDataVencimento.setText("");
            txtTotalPagar.setText("");
            txtConstMulti.setText("");
            txtNRmedidor.setText("");
            txtLeituraAnterior.setText("");
            txtLeituraAtual.setText("");
            txtDataLeituraAnterior.setText("");
            txtDataLeituraAtual.setText("");
            txtCodigoFiscal.setText("");
            txtGrupoSubgrupo.setText("");
            txtFornecimento.setText("");
            txtClasseSubclasse.setText("");
            txtTarifaria.setText("");
            txtRoteiroLeitura.setText("");
            txtTensaoNominal.setText("");

            Alert Alert = new Alert(AlertType.INFORMATION);
            Alert.setTitle("Confirmação de Cadastro");
            Alert.setHeaderText(null);
            Alert.setContentText("CADASTRO EFETUADO COM SUCESSO!");
            Alert.showAndWait();
        } else {
            
        }
    }
}