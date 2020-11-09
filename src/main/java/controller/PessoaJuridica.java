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
import classes.Cliente;
import classes.Fornecedor;
import dao.ClienteDAO;
import dao.FornecedorDAO;

public class PessoaJuridica implements Initializable {
    @FXML
    private TextField txtNomeFantasia;
    @FXML
    private TextField txtCNPJEmpresa;
    @FXML
    private TextField txtNomeFornecedor;
    @FXML
    private TextField txtCNPJFornecedor;
    @FXML
    private TextField txtTipoFornecedor;
    @FXML
    private TextField txtEmail;
    @FXML
    private ComboBox comboTipo;
    @FXML
    private Button btnRetornarPJ;
    @FXML
    private Button btnProsseguirPJ;
   

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

        comboTipo.getItems().add("Água");
        comboTipo.getItems().add("Energia");
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("main");
    }


    public void changeScreenProsseguir(ActionEvent event) {
        if(txtNomeFantasia.getText().equals("") || txtCNPJFornecedor.getText().equals("") || txtCNPJFornecedor.getText().equals("") || comboTipo.getValue().equals("")) {
            
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
            confirmacao.setContentText("DESEJA ADICIONAR UM CADASTRO?");

            Optional<ButtonType> result = confirmacao.showAndWait();
            if (result.get() == ButtonType.OK){
                String CNPJCliente = txtCNPJEmpresa.getText().replace("-","");
                String CNPJCliente2 = CNPJCliente.replace(".","");
                String CNPJClienteFinal = CNPJCliente2.replace("/","");
                String CNPJFornecedor = txtCNPJFornecedor.getText().replace("-","");
                String CNPJFornecedor2 = CNPJFornecedor.replace(".","");
                String CNPJFornecedorFinal = CNPJFornecedor2.replace("/","");

                Cliente c = new Cliente();
                ClienteDAO dao = new ClienteDAO();
                c.setCli_documento(BigInteger.valueOf(Long.parseLong(CNPJClienteFinal)));
                c.setCli_nome(txtNomeFantasia.getText());
                c.setEmail(txtEmail.getText());

                dao.create(c);

                Fornecedor f = new Fornecedor();
                FornecedorDAO daofor = new FornecedorDAO();
                f.setFor_cnpj(BigInteger.valueOf(Long.parseLong(CNPJFornecedorFinal)));
                f.setFor_nome(txtNomeFornecedor.getText());
                f.setFor_tipo(String.valueOf(comboTipo.getValue()));

                daofor.create(f);

                Main.salvarIntalacaoCliente(CNPJClienteFinal, CNPJFornecedorFinal);

                Main.changeScreen("tipoconta");

                txtNomeFantasia.setText("");
                txtCNPJEmpresa.setText("");
                txtEmail.setText("");
                txtNomeFornecedor.setText("");
                txtCNPJFornecedor.setText("");
                txtTipoFornecedor.setText("");
            } else {
            }    
        }
    }
  // Mascaras
    @FXML
    private void mascaraCNPJCliente(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("##.###.###/####-##");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtCNPJEmpresa);
        tff.formatter();
    }   

    @FXML
    private void mascaraCNPJFornecedor(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("##.###.###/####-##");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtCNPJFornecedor);
        tff.formatter();
    }
}