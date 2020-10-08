package javaapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;


public class FXMLFormularioController implements Initializable {

    @FXML
    private TextField nomeTextField;
    @FXML
    private TextField sobrenomeTextField;
    @FXML
    private TextField diaTextField;
    @FXML
    private TextField mesTextField;
    @FXML
    private TextField anoTextField;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void botaoCadastrarClicado(ActionEvent event) {
        System.out.println("Cadastrado");
        System.out.println("Nome " + nomeTextField.getText() + " " + sobrenomeTextField.getText());
        System.out.println("Data de nascimento " + diaTextField.getText() + "/" + mesTextField.getText()+ "/" + anoTextField.getText());
        nomeTextField.setText(" ");
        sobrenomeTextField.setText(" ");
        diaTextField.setText(" ");
        mesTextField.setText(" ");
        anoTextField.setText(" ");
    }

    @FXML
    private void botaoCancelarClicado(ActionEvent event) {
        System.out.println("Cancelar");
        nomeTextField.setText(" ");
        sobrenomeTextField.setText(" ");
        diaTextField.setText(" ");
        mesTextField.setText(" ");
        anoTextField.setText(" ");
        
    }
    
}
