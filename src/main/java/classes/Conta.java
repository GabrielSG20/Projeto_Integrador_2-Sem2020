package classes;

import java.util.Date;

public class Conta {

	private int int_numero_instalacao;
	private Date cta_mes_referencia;
	private Date cta_vencimento;
	
	public int getInt_numero_instalacao() {
		return int_numero_instalacao;
	}
	public void setInt_numero_instalacao(int int_numero_instalacao) {
		this.int_numero_instalacao = int_numero_instalacao;
	}
	public Date getCta_mes_referencia() {
		return cta_mes_referencia;
	}
	public void setCta_mes_referencia(Date cta_mes_referencia) {
		this.cta_mes_referencia = cta_mes_referencia;
	}
	public Date getCta_vencimento() {
		return cta_vencimento;
	}
	public void setCta_vencimento(Date cta_vencimento) {
		this.cta_vencimento = cta_vencimento;
	}
	
}
