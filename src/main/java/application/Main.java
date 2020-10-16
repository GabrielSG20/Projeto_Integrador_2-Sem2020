package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.util.ArrayList;

import classes.Conta_agua;

public class Main extends Application {

    private static Stage stage;
    private static Scene mainScene;
    private static Scene tipoclienteScene;
    private static Scene PJScene;
    private static Scene PFScene;
    private static Scene tipocontaScene;
    private static Scene agua1Scene;
    private static Scene agua2Scene;
    private static Scene energiaScene;
    private static Scene tiporelatorioScene;
    private static Scene relatorioaguaScene;
    private static Scene relatorioenergiaScene;
    private static ArrayList<Conta_agua> conta_agua;
    private static Conta_agua a;

	@Override
	public void start(Stage primaryStage) {
		try {
            conta_agua = new ArrayList<Conta_agua>();

            stage = primaryStage;

			Parent fxmlMain = FXMLLoader.load(getClass().getResource("/view/TelaInicial.fxml"));
            mainScene = new Scene(fxmlMain);

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

            Parent fxmlEnergia = FXMLLoader.load(getClass().getResource("/view/CadastroEnergia.fxml"));
            energiaScene = new Scene(fxmlEnergia);

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
        if (tela == "energia"){
            stage.setScene(energiaScene);
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
    
    public static void salvarPJ(String nome_cliente, String cnpj_cliente, String nome_fornecedor,
            String cnpj_fornecedor, String tipo_fornecedor) {
        a = new Conta_agua();
        a.setNome_cliente(nome_cliente);
        a.setCnpj_cliente(cnpj_cliente);
        a.setNome_fornecedor(nome_fornecedor);
        a.setCnpj_fornecedor(cnpj_fornecedor);
        a.setTipo_fornecedor(tipo_fornecedor);
    }

    public static void salvarAgua1(int cep, String endereco, int numero, int rgi_conta, int gr_conta, String mes_referencia_conta, String codigo_cliente, int consumo_conta){
        a.setCep(cep);
        a.setEndereco(endereco);
        a.setNumero(numero);
        a.setRgi_conta(rgi_conta);
        a.setGr_conta(gr_conta);
        a.setMes_referencia_conta(mes_referencia_conta);
        a.setConsumo_conta(consumo_conta);
    }

    public static void salvarAgua2(float total_pagar_residencial_conta){
        a.setTotal_pagar_residencial_conta(total_pagar_residencial_conta);

        conta_agua.add(a);
    }

    public static void procurarRelatorioAgua(TextField nome_cliente,TextField cnpj_cliente,TextField nome_fornecedor,TextField cnpj_fornecedor,
	TextField tipo_fornecedor,
	TextField cep,
	TextField endereco,
	TextField numero,
	TextField rgi_conta,
	TextField gr_conta,
	TextField mes_referencia_conta,
	TextField consumo_conta,
	TextField total_pagar_residencial_conta){
        Conta_agua b = new Conta_agua();
        
        for(int i = 0; i < conta_agua.size();i++){
            b = (Conta_agua)conta_agua.get(i);
			
			if (b.getRgi_conta() == Integer.valueOf(rgi_conta.getText())) {
                nome_cliente.setText(a.getNome_cliente());
                cnpj_cliente.setText(a.getCnpj_cliente());
                nome_fornecedor.setText(a.getNome_fornecedor());
                cnpj_fornecedor.setText(a.getCnpj_fornecedor());
	            tipo_fornecedor.setText(a.getTipo_fornecedor());
	            cep.setText(String.valueOf(a.getCep()));
	            endereco.setText(a.getEndereco());
	            numero.setText(String.valueOf(a.getNumero()));
	            rgi_conta.setText(String.valueOf(a.getRgi_conta()));
	            gr_conta.setText(String.valueOf(a.getGr_conta()));
	            mes_referencia_conta.setText(a.getMes_referencia_conta());
                consumo_conta.setText(String.valueOf(a.getConsumo_conta()));
	            total_pagar_residencial_conta.setText(String.valueOf(a.getTotal_pagar_residencial_conta()));
				break;
			}
        }
    }

	public static void main(String[] args) {
		launch(args);
	}
}
