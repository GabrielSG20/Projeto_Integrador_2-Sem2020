package classes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Conta_agua {
	private String nome_cliente;
	private String cnpj_cliente;
	private String nome_fornecedor;
	private String cnpj_fornecedor;
	private String tipo_fornecedor;
	private int cep;
	private String endereco;
	private int numero;
	private int rgi_conta;
	private int numero_conta;
	private int gr_conta;
	private String mes_referencia_conta;
	private String codigo_cliente;
	private int consumo_conta;
	private float total_pagar;
	
	public Conta_agua(int rgi_conta) {
		this.setRgi_conta(rgi_conta);
	}

	public Conta_agua() {
		
	}
	
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getCnpj_cliente() {
		return cnpj_cliente;
	}
	public void setCnpj_cliente(String cnpj_cliente) {
		this.cnpj_cliente = cnpj_cliente;
	}
	public String getNome_fornecedor() {
		return nome_fornecedor;
	}
	public void setNome_fornecedor(String nome_fornecedor) {
		this.nome_fornecedor = nome_fornecedor;
	}
	public String getCnpj_fornecedor() {
		return cnpj_fornecedor;
	}
	public void setCnpj_fornecedor(String cnpj_fornecedor) {
		this.cnpj_fornecedor = cnpj_fornecedor;
	}
	public String getTipo_fornecedor() {
		return tipo_fornecedor;
	}
	public void setTipo_fornecedor(String tipo_fornecedor) {
		this.tipo_fornecedor = tipo_fornecedor;
	}
	public int getRgi_conta() {
		return rgi_conta;
	}
	public void setRgi_conta(int rgi_conta) {
		this.rgi_conta = rgi_conta;
	}
	public int getNumero_conta() {
		return numero_conta;
	}
	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
	}
	public int getGr_conta() {
		return gr_conta;
	}
	public void setGr_conta(int gr_conta) {
		this.gr_conta = gr_conta;
	}
	public String getMes_referencia_conta() {
		return mes_referencia_conta;
	}
	public void setMes_referencia_conta(String mes_referencia_conta) {
		this.mes_referencia_conta = mes_referencia_conta;
	}
	public String getCodigo_cliente() {
		return codigo_cliente;
	}
	public void setCodigo_cliente(String codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}
	public int getConsumo_conta() {
		return consumo_conta;
	}
	public void setConsumo_conta(int consumo_conta) {
		this.consumo_conta = consumo_conta;
	}
	public float getTotal_pagar() {
		return total_pagar;
	}
	public void setTotal_pagar(float total_pagar_residencial_conta) {
		this.total_pagar = total_pagar_residencial_conta;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
    }
    
    // Métodos
    public String salvarCliente() {

        try {
            FileWriter arq = new FileWriter("RelatorioAgua.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println("Informações do Cliente e do Fornecedor do Serviço: ");
            gravarArq.println("\nNome do Cliente: " + this.nome_cliente);
            gravarArq.println("Documento do Cliente: " + this.cnpj_cliente);
            gravarArq.println("Nome do Fornecedor: " + this.nome_fornecedor);
            gravarArq.println("CNPJ Fornecedor: " + this.cnpj_fornecedor);
            gravarArq.println("Tipo Fornecedor: " + this.tipo_fornecedor);
            gravarArq.flush();
            gravarArq.close();
            arq.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String salvarAgua1() {

        try {
            FileWriter arq = new FileWriter("RelatorioAgua.txt", true);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println("\nInformações da Conta de Água: ");
            gravarArq.println("\nCEP: " + this.cep);
            gravarArq.println("Endereço: " + this.endereco);
            gravarArq.println("Número (endereço): " + this.numero);
            gravarArq.println("Nome do Cliente: " + this.nome_cliente);
            gravarArq.println("RGI: " + this.rgi_conta);
            gravarArq.println("GR: " + this.gr_conta);
            gravarArq.println("Mês Referência: " + this.mes_referencia_conta);
            gravarArq.println("Consumo: " + this.consumo_conta);
            gravarArq.flush();
            gravarArq.close();
            arq.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String salvarAgua2() {

        try {
            FileWriter arq = new FileWriter("RelatorioAgua.txt", true);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println("Total a pagar: " + this.total_pagar);
            gravarArq.flush();
            gravarArq.close();
            arq.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
