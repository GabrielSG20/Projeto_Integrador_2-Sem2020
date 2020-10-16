package classes;

public class Conta_luz {
	private int numero_instalacao_conta;
	private String nome_cliente;
	private String cnpj_cliente;
	private String nome_fornecedor;
	private String cnpj_fornecedor;
	private String tipo_fornecedor;
	private int cep_cliente;
	private String endereco_cliente;
	private int numero_conta;
	private String mes_referencia_conta;
	private String data_vencimento_conta;
	private int consumo_conta;
	private float valor_total;
	
	public Conta_luz(int numero_instalacao_conta) {
		this.setNumero_instalacao_conta(numero_instalacao_conta);
	}

	public Conta_luz() {
		
	}
	public String getMes_referencia_conta() {
		return mes_referencia_conta;
	}
	public void setMes_referencia_conta(String mes_referencia_conta) {
		this.mes_referencia_conta = mes_referencia_conta;
	}

	public int getConsumo_conta() {
		return consumo_conta;
	}
	public void setConsumo_conta(int consumo_conta) {
		this.consumo_conta = consumo_conta;
	}
	public int getNumero_instalacao_conta() {
		return numero_instalacao_conta;
	}
	public void setNumero_instalacao_conta(int numero_instalacao_conta) {
		this.numero_instalacao_conta = numero_instalacao_conta;
	}
	public float getValor_total() {
		return valor_total;
	}
	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
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

	public int getCep_cliente() {
		return cep_cliente;
	}

	public void setCep_cliente(int cep_cliente) {
		this.cep_cliente = cep_cliente;
	}

	public String getEndereco_cliente() {
		return endereco_cliente;
	}

	public void setEndereco_cliente(String endereco_cliente) {
		this.endereco_cliente = endereco_cliente;
	}

	public int getNumero_conta() {
		return numero_conta;
	}

	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
	}

	public String getData_vencimento_conta() {
		return data_vencimento_conta;
	}

	public void setData_vencimento_conta(String data_vencimento_conta) {
		this.data_vencimento_conta = data_vencimento_conta;
	}

}
