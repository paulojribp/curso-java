package com.javadevzone.cursojava.exercicios.strategy;

import com.javadevzone.cursojava.exercicios.Produto;
import com.javadevzone.cursojava.exercicios.TipoProduto;

public class CustoPorCongelados implements CustoPorTipoProduto {

	@Override
	public double calcular(Produto produto) {
		return produto.getCusto() + (produto.getCusto() * 0.05);
	}

	@Override
	public TipoProduto getTipoProduto() {
		return TipoProduto.CONGELADOS;
	}

}
