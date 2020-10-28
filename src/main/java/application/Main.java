package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

    private static Stage stage;
    private static Scene mainScene;
    private static Scene instalacaocadastradaScene;
    private static Scene tipoclienteScene;
    private static Scene PJScene;
    private static Scene PFScene;
    private static Scene tipocontaScene;
    private static Scene agua1Scene;
    private static Scene agua2Scene;
    private static Scene aguasemendScene;
    private static Scene energia1Scene;
    private static Scene energia2Scene;
    private static Scene energiasemendScene;
    private static Scene tiporelatorioScene;
    private static Scene relatorioaguaScene;
    private static Scene relatorioenergiaScene;

	@Override
	public void start(Stage primaryStage) {
		try {
            stage = primaryStage;

			Parent fxmlMain = FXMLLoader.load(getClass().getResource("/view/TelaInicial.fxml"));
            mainScene = new Scene(fxmlMain);

            Parent fxmlInstalacaoCadastrada = FXMLLoader.load(getClass().getResource("/view/InstalacaoCadastrada.fxml"));
            instalacaocadastradaScene = new Scene(fxmlInstalacaoCadastrada);

            Parent fxmlTipoCliente = FXMLLoader.load(getClass().getResource("/view/TipoCliente.fxml"));
            tipoclienteScene = new Scene(fxmlTipoCliente);

            Parent fxmlPJ= FXMLLoader.load(getClass().getResource("/view/PessoaJuridica.fxml"));
            PJScene = new Scene(fxmlPJ);

            Parent fxmlPF= FXMLLoader.load(getClass().getResource("/view/PessoaFisica.fxml"));
            PFScene = new Scene(fxmlPF);

            Parent fxmlTipoConta = FXMLLoader.load(getClass().getResource("/view/TipoConta.fxml"));
            tipocontaScene = new Scene(fxmlTipoConta);

            Parent fxmlAgua1 = FXMLLoader.load(getClass().getResource("/view/CadastroAgua1.fxml"));
            agua1Scene = new Scene(fxmlAgua1);

            Parent fxmlAgua2 = FXMLLoader.load(getClass().getResource("/view/CadastroAgua2.fxml"));
            agua2Scene = new Scene(fxmlAgua2);

            Parent fxmlAguaSemEnd = FXMLLoader.load(getClass().getResource("/view/CadastroAguaSemEnd.fxml"));
            aguasemendScene = new Scene(fxmlAguaSemEnd);

            Parent fxmlEnergia1 = FXMLLoader.load(getClass().getResource("/view/CadastroEnergia1.fxml"));
            energia1Scene = new Scene(fxmlEnergia1);

            Parent fxmlEnergia2 = FXMLLoader.load(getClass().getResource("/view/CadastroEnergia2.fxml"));
            energia2Scene = new Scene(fxmlEnergia2);

            Parent fxmlEnergiaSemEnd = FXMLLoader.load(getClass().getResource("/view/EnergiaSemEnd.fxml"));
            energiasemendScene = new Scene(fxmlEnergiaSemEnd);

            Parent fxmlTipoRelatorio = FXMLLoader.load(getClass().getResource("/view/TipoRelatorio.fxml"));
            tiporelatorioScene = new Scene(fxmlTipoRelatorio);

            Parent fxmlRelatorioAgua = FXMLLoader.load(getClass().getResource("/view/RelatorioAgua.fxml"));
            relatorioaguaScene = new Scene(fxmlRelatorioAgua);

            Parent fxmlRelatorioEnergia = FXMLLoader.load(getClass().getResource("/view/RelatorioEnergia.fxml"));
            relatorioenergiaScene = new Scene(fxmlRelatorioEnergia);

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
        if (tela == "instalacaocadastrada"){
            stage.setScene(instalacaocadastradaScene);
        }
         if (tela == "tipocliente"){
            stage.setScene(tipoclienteScene);
        }
        if (tela == "pj"){
            stage.setScene(PJScene);
        }
        if (tela == "pf"){
            stage.setScene(PFScene);
        }
        if (tela == "tipoconta"){
            stage.setScene(tipocontaScene);
        }
        if (tela == "agua1"){
            stage.setScene(agua1Scene);
        }
        if (tela == "agua2"){
            stage.setScene(agua2Scene);
        }
        if (tela == "aguasemend"){
            stage.setScene(aguasemendScene);
        }
        if (tela == "energia1"){
            stage.setScene(energia1Scene);
        }
        if (tela == "energia2"){
            stage.setScene(energia2Scene);
        }
        if (tela == "energiasemend"){
            stage.setScene(energiasemendScene);
        }
        if (tela == "tiporelatorio"){
            stage.setScene(tiporelatorioScene);
        }
        if (tela == "relatorioagua"){
            stage.setScene(relatorioaguaScene);
        }
        if (tela == "relatorioenergia"){
            stage.setScene(relatorioenergiaScene);
        }
    }
    
	public static void main(String[] args) {
		launch(args);
	}
}
