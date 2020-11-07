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


public class CadastroEnergia1 implements Initializable {
    @FXML
    private TextField txtCEPEnergia;
    @FXML
    private TextField txtUFEnergia;
    @FXML
    private TextField txtComplementoEnergia;
    @FXML
    private TextField txtCidadeEnergia;
    @FXML
    private TextField txtCodigoFiscalEnergia;
    @FXML
    private TextField txtEnderecoEnergia;
    @FXML
    private TextField txtNumeroEnergia;
    @FXML
    private TextField txtGrupoSubgrupoEnergia;
    @FXML
    private TextField txtClasseSubclasseEnergia;
    @FXML
    private TextField txtFornecimentoEnergia;
    @FXML
    private TextField txtMTarifaEnergia;
    @FXML
    private TextField txtRoteiroLeituraEnergia;
    @FXML
    private TextField txtTensaoNominalEnergia;
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
            txtUFEnergia.setText("");
            txtCEPEnergia.setText("");
            txtComplementoEnergia.setText("");
            txtCidadeEnergia.setText("");
            txtCodigoFiscalEnergia.setText("");
            txtEnderecoEnergia.setText("");
            txtNumeroEnergia.setText("");
            txtGrupoSubgrupoEnergia.setText("");
            txtClasseSubclasseEnergia.setText("");
            txtFornecimentoEnergia.setText("");
            txtMTarifaEnergia.setText("");
            txtRoteiroLeituraEnergia.setText("");
            txtTensaoNominalEnergia.setText("");
            Main.changeScreen("energia2Scene");

            
        } else {
            
        }
    }
 // Mascaras
    @FXML
    private void mascaraCEP(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("#####-###");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtCEPEnergia);
        tff.formatter();
    }
}