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
    private ComboBox comboTipoFornecedor;
    @FXML
    private Button btnRetornarPF;
    @FXML
    private Button btnProsseguirPF;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

        comboTipoFornecedor.getItems().add("Água");
        comboTipoFornecedor.getItems().add("Energia");
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("main");
    }

    public void changeScreenProsseguir(ActionEvent event) {
        Alert confirmacao = new Alert(AlertType.CONFIRMATION);
        confirmacao.setTitle("Confirmação de Informações");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("DESEJA ADICIONAR UM NOVO CLIENTE?");

        Optional<ButtonType> result = confirmacao.showAndWait();
        if (result.get() == ButtonType.OK){
            Cliente c = new Cliente();
            ClienteDAO dao = new ClienteDAO();
            c.setCli_documento(BigInteger.valueOf(Long.parseLong(txtCPF.getText())));
            c.setCli_nome(txtNomeCompleto.getText());
            c.setEmail(txtEmail.getText());

            dao.create(c);

            Fornecedor f = new Fornecedor();
            FornecedorDAO daofor = new FornecedorDAO();
            f.setFor_cnpj(BigInteger.valueOf(Long.parseLong(txtCNPJFornecedor.getText())));
            f.setFor_nome(txtNomeFornecedor.getText());
            f.setFor_tipo(String.valueOf(comboTipoFornecedor.getValue()));

            daofor.create(f);

            txtNomeCompleto.setText("");
            txtCPF.setText("");
            txtNomeFornecedor.setText("");
            txtCNPJFornecedor.setText("");
            txtEmail.setText("");
            
            Main.changeScreen("tipoconta");
        } else {
            
        }
    }
}