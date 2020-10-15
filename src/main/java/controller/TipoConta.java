package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import application.Main;

public class TipoConta implements Initializable {
	   @FXML
	   private Button btn_CDA;
	   @FXML
	   private Button btn_CDL;
	   
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	
	public void changeScreenContaAgua(ActionEvent event){
        Main.changeScreen("agua1");
    }
    
    public void changeScreenContaLuz(ActionEvent event){
        Main.changeScreen("luz");
    }
    
    public void changeScreenRetornar(ActionEvent event){
        Main.changeScreen("pj");
	}

}