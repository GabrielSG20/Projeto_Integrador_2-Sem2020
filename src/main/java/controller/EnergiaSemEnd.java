package controller;

import java.math.BigDecimal;
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
import classes.Energia;
import dao.EnergiaDAO;

public class EnergiaSemEnd implements Initializable {
    @FXML
    private TextField txtContaMes;
    @FXML
    private TextField txtConsumo;
    @FXML
    private TextField txtDataVencimento;
    @FXML
    private TextField txtTotalPagar;
    @FXML
    private TextField txtConstMulti;
    @FXML
    private TextField txtNRmedidor;
    @FXML
    private TextField txtLeituraAnterior;
    @FXML
    private TextField txtLeituraAtual;
    @FXML
    private TextField txtDataLeituraAnterior;
    @FXML
    private TextField txtDataLeituraAtual;
    @FXML
    private TextField txtCodigoFiscal;
    @FXML
    private TextField txtGrupoSubgrupo;
    @FXML
    private TextField txtFornecimento;
    @FXML
    private TextField txtClasseSubclasse;
    @FXML
    private TextField txtTarifaria;
    @FXML
    private TextField txtRoteiroLeitura;
    @FXML
    private TextField txtTensaoNominal;
    @FXML
    private ComboBox comboBandeirasTarifaria;
    @FXML
    private Button btnRetornarEnergia;
    @FXML
    private Button btnVoltarTelaIncial;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

        comboBandeirasTarifaria.getItems().add("Verde");
        comboBandeirasTarifaria.getItems().add("Amarela");
        comboBandeirasTarifaria.getItems().add("Vermelha");
    }

    public void changeScreenRetornar(ActionEvent event) {
        Main.changeScreen("instalacaocadastrada");
    }

    public void changeScreenVoltarTelaInicial(ActionEvent event) {
        Alert confirmacao = new Alert(AlertType.CONFIRMATION);
        confirmacao.setTitle("Confirmação de Cadastro");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("DESEJA ADICIONAR UM CADASTRO?");

        Optional<ButtonType> result = confirmacao.showAndWait();
        if (result.get() == ButtonType.OK){

            Energia n = new Energia();
            EnergiaDAO dao_ene = new EnergiaDAO();
            n.setCta_mes_referencia(txtContaMes.getText());
            n.setEne_consumo_conta_mes(BigInteger.valueOf(Long.parseLong(txtConsumo.getText())));
            n.setEne_valor_total(BigDecimal.valueOf(Long.parseLong(txtTotalPagar.getText())));
            n.setEne_const_multi(BigDecimal.valueOf(Long.parseLong(txtConstMulti.getText())));
            n.setEne_numero_medidor(Integer.parseInt(txtNRmedidor.getText()));
            n.setEne_leitura_anterior_cod(Integer.parseInt(txtLeituraAnterior.getText()));
            n.setEne_leitura_atual_cod(Integer.parseInt(txtLeituraAtual.getText()));
            n.setEne_data_leitura_anterior(txtDataLeituraAnterior.getText());
            n.setEne_data_leitura_atual(txtDataLeituraAtual.getText());
            n.setEne_tipo_bandeira(String.valueOf(comboBandeirasTarifaria.getValue()));
            n.setEne_codigo_fiscal(BigInteger.valueOf(Long.parseLong(txtCodigoFiscal.getText())));
            n.setEne_grupo_subgrupo(txtGrupoSubgrupo.getText());
            n.setEne_classe_subclasse(txtClasseSubclasse.getText());
            n.setEne_tipo_fornecimento(txtFornecimento.getText());
            n.setEne_modalidade_tarifaria(txtTarifaria.getText());
            n.setEne_roteiro_leitura(txtRoteiroLeitura.getText());
            n.setEne_tensao_nominal(txtTensaoNominal.getText());

            dao_ene.create(n);

            Main.changeScreen("main");

            txtContaMes.setText("");
            txtConsumo.setText("");
            txtDataVencimento.setText("");
            txtTotalPagar.setText("");
            txtConstMulti.setText("");
            txtNRmedidor.setText("");
            txtLeituraAnterior.setText("");
            txtLeituraAtual.setText("");
            txtDataLeituraAnterior.setText("");
            txtDataLeituraAtual.setText("");
            txtCodigoFiscal.setText("");
            txtGrupoSubgrupo.setText("");
            txtFornecimento.setText("");
            txtClasseSubclasse.setText("");
            txtTarifaria.setText("");
            txtRoteiroLeitura.setText("");
            txtTensaoNominal.setText("");

            Alert Alert = new Alert(AlertType.INFORMATION);
            Alert.setTitle("Confirmação de Cadastro");
            Alert.setHeaderText(null);
            Alert.setContentText("CADASTRO EFETUADO COM SUCESSO!");
            Alert.showAndWait();
        } else {
            
        }
    }
}