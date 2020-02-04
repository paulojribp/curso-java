package com.javadevzone.cursojava.exercicios;

public class SimplesNacional implements TipoRegime {

	public double obterImposto() {
		return 0.06;
	}

	@Override
	public double calcularImposto(Produto produto) {
		return produto.getCusto() * obterImposto();
	}
	
}
