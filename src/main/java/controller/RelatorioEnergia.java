package controller;

import dao.InstalacaoDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.math.BigInteger;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import classes.Energia;
import classes.Instalacao;
import conexao.ConexaoBd;
import dao.EnergiaDAO;

public class RelatorioEnergia implements Initializable {
    @FXML
    private TableView TabelaInstalacao;
    @FXML
    private TableColumn <Energia, BigInteger> NumInstalacao;
    @FXML
    private TableColumn <Energia, BigInteger> DocCliente;
    @FXML
    private TableColumn <Energia, BigInteger> CNPJFornecedor;
    @FXML
    private TableColumn <Energia, BigInteger> CEP;
    @FXML
    private TableColumn <Energia, BigInteger> NResidencia;
    
    private List<Instalacao> instalacoesList;
    private ObservableList<Instalacao> observableListInstalacao;

    private final InstalacaoDAO instalacaoDAO = new InstalacaoDAO();

    @Override
    public void initialize(URL url, ResourceBundle resources) {
        
        carregarTableViewInstalacao();
    }

    public void carregarTableViewInstalacao(){
        NumInstalacao.setCellValueFactory(new PropertyValueFactory<>("int_numero_instalacao"));
        DocCliente.setCellValueFactory(new PropertyValueFactory<>("cli_documento"));
        CNPJFornecedor.setCellValueFactory(new PropertyValueFactory<>("for_cnpj"));
        CEP.setCellValueFactory(new PropertyValueFactory<>("end_cep"));
        NResidencia.setCellValueFactory(new PropertyValueFactory<>("end_numero"));

        instalacoesList = InstalacaoDAO.read();
        observableListInstalacao = FXCollections.observableArrayList(instalacoesList);
        TabelaInstalacao.setItems(observableListInstalacao);
    }

    

}