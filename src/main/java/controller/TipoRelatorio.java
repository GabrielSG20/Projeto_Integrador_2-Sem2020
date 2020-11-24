package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import application.Main;

public class TipoRelatorio implements Initializable {
	   @FXML
	   private Button btnRelatorioLuz;
	   @FXML
       private Button btnRelatorioAgua;
       @FXML
       private Button btnRetornarTipoR;
       @FXML
       private Button btnRelatorioCliente;
       
	   
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	
	public void changeScreenRelatorioAgua(ActionEvent event){
        Main.changeScreen("relatorioagua");
    }
    
    public void changeScreenRelatorioLuz(ActionEvent event){
        Main.changeScreen("relatorioenergia");
    }
    public void changeScreenRelatorioCliente(ActionEvent event){
        Main.changeScreen("relatoriocliente");
	}
    
    public void changeScreenRetornar(ActionEvent event){
        Main.changeScreen("main");
	}

}