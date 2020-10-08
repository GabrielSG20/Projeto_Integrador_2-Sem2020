package javaapplication1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class JavaApplication1 extends Application {

    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane anchorPane = (AnchorPane) FXMLLoader.load(this.getClass().getResource("FXMLFormulario.fxml"));
        Scene scene = new Scene(anchorPane);
        primaryStage.setScene(scene);
        
        primaryStage.setTitle("Formulario");
        
        primaryStage.show();
    }

    
}
