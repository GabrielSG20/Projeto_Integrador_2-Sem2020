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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import util.TextFieldFormatter;
import application.Main;
import classes.Endereco;
import dao.EnderecoDAO;

public class CadastroEnergia1 implements Initializable {
    @FXML
    private TextField txtCidade;
    @FXML
    private TextField txtCEPEnergia;
    @FXML
    private ComboBox comboUF;
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

        comboUF.getItems().add("AC");
        comboUF.getItems().add("AL");
        comboUF.getItems().add("AP");
        comboUF.getItems().add("AM");
        comboUF.getItems().add("BA");
        comboUF.getItems().add("CE");
        comboUF.getItems().add("ES");
        comboUF.getItems().add("GO");
        comboUF.getItems().add("MA");
        comboUF.getItems().add("MT");
        comboUF.getItems().add("MS");
        comboUF.getItems().add("MG");
        comboUF.getItems().add("PA");
        comboUF.getItems().add("PB");
        comboUF.getItems().add("PR");
        comboUF.getItems().add("PE");
        comboUF.getItems().add("PI");
        comboUF.getItems().add("RJ");
        comboUF.getItems().add("RN");
        comboUF.getItems().add("RS");
        comboUF.getItems().add("RO");
        comboUF.getItems().add("RR");
        comboUF.getItems().add("SC");
        comboUF.getItems().add("SP");
        comboUF.getItems().add("SE");
        comboUF.getItems().add("TO");
        comboUF.getItems().add("DF");
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
            String CEP = txtCEPEnergia.getText().replace("-","");

            Endereco e = new Endereco();
            EnderecoDAO dao = new EnderecoDAO();
            e.setEnd_cep(BigInteger.valueOf(Long.parseLong(CEP)));
            e.setEnd_numero(BigInteger.valueOf(Long.parseLong(txtNumeroEnergia.getText())));
            e.setEnd_rua(txtEnderecoEnergia.getText());
            e.setEnd_estado(String.valueOf(comboUF.getValue()));
            e.setEnd_cidade(txtCidade.getText());
            e.setEnd_complemento(txtComplemento.getText());

            dao.create(e);

            Main.salvarEnergia1(txtCodigoFiscal, txtGrupoSubgrupo, txtClasseSubclasse, txtFornecimento, txtTarifaria, txtRoteiroLeitura, txtTensaoNominal);

            Main.salvarIntalacaoEndereco(txtCEPEnergia, txtNumeroEnergia);

            Main.changeScreen("energia2");
            
            txtCidade.setText("");
            txtCEPEnergia.setText("");
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

    // Mascaras
    @FXML
    private void mascaraCEP(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("#####-###");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtCEPEnergia);
        tff.formatter();
    }

    @FXML
    private void mascaraNumero(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtNumeroEnergia);
        tff.formatter();
    }

    @FXML
    private void mascaraCodigoFiscal(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtCodigoFiscal);
        tff.formatter();
    }
}