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
import application.Main;
import classes.Endereco;
import dao.EnderecoDAO;

public class CadastroEnergia1 implements Initializable {
    @FXML
    private TextField txtCidade;
    @FXML
    private TextField txtCEPEnergia;
    @FXML
    private TextField txtUf;
    @FXML
    private TextField txtEnderecoEnergia;
    @FXML
    private TextField txtNumeroEnergia;
    @FXML
    private TextField txtComplemento;
    @FXML
    private TextField txtCodigoFiscal;
    @FXML
    private TextField txtGrupoSubgrupo;
    @FXML
    private TextField txtClasseSubclasse;
    @FXML
    private TextField txtFornecimento;
    @FXML
    private TextField txtTarifaria;
    @FXML
    private TextField txtRoteiroLeitura;
    @FXML
    private TextField txtTensaoNominal;
    @FXML
    private Button btnSalvarContinuar;
    @FXML
    private Button btnRetornarEnergia;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("tipoconta");
    }

    public void changeScreenSalvarContinuar(ActionEvent event) {
        Alert confirmacao = new Alert(AlertType.CONFIRMATION);
        confirmacao.setTitle("Confirmação de Informações");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("CONFIRMA ESSAS INFORMAÇÕES?");

        Optional<ButtonType> result = confirmacao.showAndWait();
        if (result.get() == ButtonType.OK){
            Main.changeScreen("energia2");
            Endereco e = new Endereco();
            EnderecoDAO dao = new EnderecoDAO();
            e.setEnd_cep(BigInteger.valueOf(Long.parseLong(txtCEPEnergia.getText())));
            e.setEnd_numero(BigInteger.valueOf(Long.parseLong(txtNumeroEnergia.getText())));
            e.setEnd_rua(txtEnderecoEnergia.getText());
            e.setEnd_estado(txtUf.getText());
            e.setEnd_cidade(txtCidade.getText());
            e.setEnd_complemento(txtComplemento.getText());

            dao.create(e);

            txtCidade.setText("");
            txtCEPEnergia.setText("");
            txtUf.setText("");
            txtEnderecoEnergia.setText("");
            txtNumeroEnergia.setText("");
            txtComplemento.setText("");
            txtCodigoFiscal.setText("");
            txtGrupoSubgrupo.setText("");
            txtClasseSubclasse.setText("");
            txtFornecimento.setText("");
            txtTarifaria.setText("");
            txtRoteiroLeitura.setText("");
            txtTensaoNominal.setText("");
        } else {
            
        }
    }
}