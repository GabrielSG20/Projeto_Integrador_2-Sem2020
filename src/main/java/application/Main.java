package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

    private static Stage stage;
    private static Scene mainScene;
    private static Scene aguaScene;
    private static Scene tipocontaScene;
    private static Scene tipoclienteScene;

	@Override
	public void start(Stage primaryStage) {
		try {
            stage = primaryStage;

			Parent fxmlMain = FXMLLoader.load(getClass().getResource("/view/TelaInicial.fxml"));
            mainScene = new Scene(fxmlMain);

            Parent fxmlAgua = FXMLLoader.load(getClass().getResource("/view/CadastroAgua.fxml"));
            aguaScene = new Scene(fxmlAgua);

            Parent fxmlTipoConta = FXMLLoader.load(getClass().getResource("/view/TipoConta.fxml"));
            tipocontaScene = new Scene(fxmlTipoConta);

            Parent fxmlTipoCliente = FXMLLoader.load(getClass().getResource("/view/TipoCliente.fxml"));
            tipoclienteScene = new Scene(fxmlTipoCliente);

			primaryStage.setTitle("Cadastro de Contas");
			primaryStage.setScene(mainScene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

    public static void changeScreen(String tela){
        if (tela == "main"){
            stage.setScene(mainScene);
        }
        if (tela == "agua"){
            stage.setScene(aguaScene);
        }
        if (tela == "tipoconta"){
            stage.setScene(tipocontaScene);
        }
        if (tela == "tipocliente"){
            stage.setScene(tipoclienteScene);
        }
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
