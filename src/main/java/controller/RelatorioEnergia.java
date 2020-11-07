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
import classes.Instalacao;

public class RelatorioEnergia implements Initializable {
    @FXML
    private TableView <Instalacao> TabelaInstalacao;
    @FXML
    private TableColumn <Instalacao, BigInteger> clmNumInstalacao;
    @FXML
    private TableColumn <Instalacao, BigInteger> clmDocCliente;
    @FXML
    private TableColumn <Instalacao, BigInteger> clmCNPJFornecedor;
    @FXML
    private TableColumn <Instalacao, BigInteger> clmCEP;
    @FXML
    private TableColumn <Instalacao, BigInteger> clmNResidencia;

    private List<Instalacao> listInstalacao;
    private ObservableList<Instalacao> observableListInstalacao;
   
    
    @Override
    public void initialize(URL url, ResourceBundle resources) {
        
        carregarTableViewInstalacao();
    }

    public void carregarTableViewInstalacao(){
        clmNumInstalacao.setCellValueFactory(new PropertyValueFactory<>("int_numero_instalacao"));
        clmDocCliente.setCellValueFactory(new PropertyValueFactory<>("cli_documento"));
        clmCNPJFornecedor.setCellValueFactory(new PropertyValueFactory<>("for_cnpj"));
        clmCEP.setCellValueFactory(new PropertyValueFactory<>("end_cep"));
        clmNResidencia.setCellValueFactory(new PropertyValueFactory<>("end_numero"));

        listInstalacao =  InstalacaoDAO.read();
        observableListInstalacao = FXCollections.observableArrayList(listInstalacao);
        TabelaInstalacao.setItems(observableListInstalacao);
    }
}
