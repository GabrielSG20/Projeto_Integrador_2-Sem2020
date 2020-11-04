package controller;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import classes.Energia;
public class controller {
    @FXML
    private TableView<Energia> TabelaEnergia;
    @FXML
    private TableColumn NumInstalacao;
    @FXML
    private TableColumn DocCliente;
    @FXML
    private TableColumn CNPJFornecedor;
    @FXML
    private TableColumn CEP;
    @FXML
    private TableColumn NResidencia;
}