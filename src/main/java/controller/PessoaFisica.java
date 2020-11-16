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

public class PessoaFisica implements Initializable {
    @FXML
    private TextField txtNomeCompleto;
    @FXML
    private TextField txtCPF;
    @FXML
    private TextField txtNomeFornecedor;
    @FXML
    private TextField txtCNPJFornecedor;
    @FXML
    private TextField txtEmail;
    @FXML
    private ComboBox comboTipo;
    @FXML
    private Button btnbuscarCPF;
    @FXML
    private Button btnBuscarCNPJ;
    @FXML
    private Button btnProsseguirPF;
    @FXML
    private Button btnRetornarPF;
    @FXML
    private Button btnFornecedor;
    @FXML
    private Button btnPessoaFIsica;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        comboTipo.getItems().add("Água");
        comboTipo.getItems().add("Energia");
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("main");
    }
    public void changeScreenCadastrarPessoaFisica(ActionEvent event) {
        Main.changeScreen("cadastrarpessoafisica");
    }
    public void changeScreenCadastrarFornecedor(ActionEvent event) {
        Main.changeScreen("cadastrarfornecedor");
    }

    public void changeScreenProsseguir(ActionEvent event) {
        if(txtNomeCompleto.getText().equals("") || txtNomeFornecedor.getText().equals("") || txtCNPJFornecedor.getText().equals("") || txtCPF.getText().equals("") || comboTipo.getValue().equals("")) {
            
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
                String CPF1 = txtCPF.getText().replace("-","");
                String CPF = CPF1.replace(".","");
                String CNPJFornecedor = txtCNPJFornecedor.getText().replace("-","");
                String CNPJFornecedor2 = CNPJFornecedor.replace("/","");
                String CNPJFornecedorFinal = CNPJFornecedor2.replace(".","");

                Cliente c = new Cliente();
                ClienteDAO dao = new ClienteDAO();
                c.setCli_documento(BigInteger.valueOf(Long.parseLong(CPF)));
                c.setCli_nome(txtNomeCompleto.getText());
                c.setEmail(txtEmail.getText());

                dao.create(c);

                Fornecedor f = new Fornecedor();
                FornecedorDAO daofor = new FornecedorDAO();
                f.setFor_cnpj(BigInteger.valueOf(Long.parseLong(CNPJFornecedorFinal)));
                f.setFor_nome(txtNomeFornecedor.getText());
                f.setFor_tipo(String.valueOf(comboTipo.getValue()));

                daofor.create(f);

                Main.salvarIntalacaoCliente(CPF, CNPJFornecedorFinal);

                Main.changeScreen("tipoconta");

                txtNomeCompleto.setText("");
                txtCPF.setText("");
                txtNomeFornecedor.setText("");
                txtCNPJFornecedor.setText("");
                txtEmail.setText("");
            } else {
            }    
        }
    }

// Mascaras
    @FXML
    private void mascaraCPF(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("###.###.###-##");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtCPF);
        tff.formatter();
    }

    @FXML
    private void mascaraCNPJ(){
        TextFieldFormatter tff = new TextFieldFormatter();
        tff.setMask("##.###.###/####-##");
        tff.setCaracteresValidos("0123456789");
        tff.setTf(txtCNPJFornecedor);
        tff.formatter();
    }
}