package controller;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.math.BigInteger;
import java.net.URL;
import java.util.ResourceBundle;
import classes.Energia;
import dao.EnergiaDAO;

public class RelatorioEnergia implements Initializable {
    @FXML
    private TableView TabelaEnergia;
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
    
    @Override
     
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    

}