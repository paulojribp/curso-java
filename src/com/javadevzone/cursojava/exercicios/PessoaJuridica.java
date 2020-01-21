package com.javadevzone.cursojava.exercicios;

public class PessoaJuridica implements Pessoa {

	private String cnpj;
	
	private TipoRegime tipoRegime;

	public PessoaJuridica(String cnpj) {
		this.cnpj = cnpj;
		this.tipoRegime = new SimplesNacional();
	}
	
	public PessoaJuridica(String cnpj, int tipoRegimeValue) {
		this.cnpj = cnpj;
		mudarRegima(tipoRegimeValue);
	}

	@Override
	public String obterIdentificacaoFederal() {
		return cnpj;
	}

	@Override
	public boolean isIdentificacaoFederalValida() {
		return true;
	}
	
	public TipoRegime getTipoRegime() {
		return this.tipoRegime;
	}
	
	// Polimorfismo >> Muitas Formas
	public void mudarRegima(int tipoRegimeValue) {
		if (tipoRegimeValue == TipoRegime.REGIME_NORMAL) {
			this.tipoRegime = new RegimeNormal();
		} else if (tipoRegimeValue == TipoRegime.SIMPLES_NACIONAL) {
			this.tipoRegime = new SimplesNacional();
		}
	}

}
