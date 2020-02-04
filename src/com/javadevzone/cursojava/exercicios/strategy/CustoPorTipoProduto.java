package com.javadevzone.cursojava.exercicios.strategy;

import com.javadevzone.cursojava.exercicios.Produto;
import com.javadevzone.cursojava.exercicios.TipoProduto;

public interface CustoPorTipoProduto {
	
	TipoProduto getTipoProduto();

	double calcular(Produto produto);
	
}
