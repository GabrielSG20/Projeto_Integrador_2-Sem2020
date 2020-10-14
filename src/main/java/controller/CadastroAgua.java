package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import application.Main;

public class CadastroAgua implements Initializable {
	   @FXML
	   private Button btnRetornar;
	   @FXML
	   private Button btnSalvar;
	   @FXML
	   private Button btnbtnVoltarTelaIncial;
	   
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	
	public void changeScreenRetornar(ActionEvent event){
        Main.changeScreen("tipoconta");
	}
    
    public void changeScreenVoltarTelaInicial(ActionEvent event){
        Main.changeScreen("main");
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Confirmação de Cadastro");
        alert.setHeaderText(null);
        alert.setContentText("Cadastro realizado com sucesso!");

        alert.showAndWait();
    }
    
    public void salvarCadastro(ActionEvent evenent){

    }
}