package com.javadevzone.cursojava.exercicios;

public class ExercicioAula06 {

	public static void main(String[] args) {
		
		// Tipo      		= 	Instância
		Pessoa pessoaFisica = new PessoaFisica("123.456.789-10");
		if (pessoaFisica.isIdentificacaoFederalValida()) {
			String identificacao = pessoaFisica.obterIdentificacaoFederal();
			System.out.println(identificacao);
		}
		
		Pessoa pessoaJuridica = new PessoaJuridica("25.039.743/0001-04", TipoRegime.REGIME_NORMAL);
		if (pessoaJuridica.isIdentificacaoFederalValida()) {
			System.out.println(pessoaJuridica.obterIdentificacaoFederal());
		}
		
		PessoaJuridica mcDonalds = new PessoaJuridica("25.039.743/0003-07");
		System.out.println(mcDonalds.getTipoRegime().obterImposto());
		mcDonalds.mudarRegima(TipoRegime.REGIME_NORMAL);
		System.out.println(mcDonalds.getTipoRegime().obterImposto());
	}
	
}
