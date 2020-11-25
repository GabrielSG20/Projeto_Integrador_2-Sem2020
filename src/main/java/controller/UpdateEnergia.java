package controller;

import java.math.BigInteger;
import java.net.URL;
import javafx.scene.control.ComboBox;
import java.util.Optional;
import java.util.ResourceBundle;
import util.TextFieldFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import application.Main;
import dao.EnergiaDAO;

public class UpdateEnergia implements Initializable {
    
    @FXML
    private TextField txtNumInstalacao;
    @FXML
    private TextField txtMesReferenciaEnergia;
    @FXML
    private TextField txtContaKwH;
    @FXML
    private TextField txtDataVencimento;
    @FXML
    private TextField txtValorTotalAPagar;
    @FXML
    private TextField txtDataLeituraAnterior;
    @FXML
    private TextField txtDataLeituraAtual;
    @FXML
    private ComboBox comboBandeirasTarifarias;
    @FXML
    private TextField txtConstMulti;
    @FXML
    private TextField txtNRdoMedidor;
    @FXML
    private TextField txtLeituraAnterior;
    @FXML
    private TextField txtLeituraAtual;
    @FXML
    private TextField txtCodigoFiscal;
    @FXML
    private TextField txtGrupoSubgrupo;
    @FXML
    private TextField txtClasseSubclasse;
    @FXML
    private TextField txtRoteiroLeitura;
    @FXML
    private TextField txtMTarifaria;
    @FXML
    private TextField txtTensaoNominal;
    @FXML
    private TextField txtFornecimento;
    @FXML
    private Button btnBuscar;
    @FXML
    private Button btnRetornarEnergia;
    @FXML
    private Button btnEditar;

    @Override
        public void initialize(URL arg0, ResourceBundle arg1) {
            // TODO Auto-generated method stub
            comboBandeirasTarifarias.getItems().add("Verde");
            comboBandeirasTarifarias.getItems().add("Amarelo");
            comboBandeirasTarifarias.getItems().add("Vermelho");
        }

    public void changeScreenRetornarRelatorio(ActionEvent event) {
        Main.changeScreen("main");

        txtNumInstalacao.setText("");
        txtMesReferenciaEnergia.setText("");
        txtContaKwH.setText("");
        txtValorTotalAPagar.setText("");
        txtDataLeituraAnterior.setText("");
        txtDataLeituraAtual.setText("");
        comboBandeirasTarifarias.setValue("");
        txtConstMulti.setText("");
        txtNRdoMedidor.setText("");
        txtLeituraAnterior.setText("");
        txtLeituraAtual.setText("");
        txtCodigoFiscal.setText("");
        txtGrupoSubgrupo.setText("");
        txtClasseSubclasse.setText("");
        txtRoteiroLeitura.setText("");
        txtMTarifaria.setText("");
        txtTensaoNominal.setText("");
        txtFornecimento.setText("");
    }
    public void buscarNumeroInstalacao(ActionEvent event) {
         if (EnergiaDAO.validacaoConta(BigInteger.valueOf(Long.parseLong(txtNumInstalacao.getText())), txtMesReferenciaEnergia.getText())){

                EnergiaDAO.buscar(BigInteger.valueOf(Long.parseLong(txtNumInstalacao.getText())), txtMesReferenciaEnergia.getText(),txtContaKwH,txtValorTotalAPagar,txtDataLeituraAnterior,txtDataLeituraAtual,comboBandeirasTarifarias,txtConstMulti,txtNRdoMedidor,txtLeituraAnterior,txtLeituraAtual,txtCodigoFiscal,txtGrupoSubgrupo,txtClasseSubclasse,txtRoteiroLeitura,txtMTarifaria,txtTensaoNominal,txtFornecimento);       
        } else {
            Alert cadastro = new Alert(Alert.AlertType.INFORMATION);
            cadastro.setTitle("Numero de instalação e/ou mês de referência não encontrado");
            cadastro.setHeaderText("Digite um numero de instalação e/ou mês de referência válido!");
            cadastro.showAndWait();

            txtNumInstalacao.setText("");
            txtMesReferenciaEnergia.setText("");

        }
    }
    
}


   
