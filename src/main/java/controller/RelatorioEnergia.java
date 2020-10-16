package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import application.Main;

public class RelatorioEnergia implements Initializable {
    @FXML
    private TextField NomeCliente;
    @FXML
    private TextField CNPJCliente;
    @FXML
    private TextField NomeFornecedor;
    @FXML
    private TextField CNPJFornecedor;
    @FXML
    private TextField TipoFornecedor;
    @FXML
    private TextField CEP;
    @FXML
    private TextField Endereco;
    @FXML
    private TextField Numero;
    @FXML
    private TextField MesReferencia;
    @FXML
    private TextField DataVencimento;
    @FXML
    private TextField Consumo;
    @FXML
    private TextField TotalPagar;
    @FXML
    private TextField NumeroInstalacao;
    @FXML
    private Button btnBuscar;
    @FXML
    private Button btnRetornarInicio;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("main");
    }

    public void procurarNumeroInstalacao(ActionEvent event) {
          
    }
}