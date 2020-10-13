package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

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
    }
    
    public void salvarCadastro(ActionEvent evenent){

    }
}