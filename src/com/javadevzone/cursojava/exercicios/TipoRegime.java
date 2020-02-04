package com.javadevzone.cursojava.exercicios;

public interface TipoRegime {

	int REGIME_NORMAL = 1;
	int SIMPLES_NACIONAL = 0;
	
	double obterImposto();
	
	double calcularImposto(Produto produto);
	
}
