package com.javadevzone.cursojava.exercicios;

import com.javadevzone.cursojava.exercicios.strategy.CustoPorTipoProduto;

public class CustoPorMatinais implements CustoPorTipoProduto {

	@Override
	public TipoProduto getTipoProduto() {
		return TipoProduto.MATINAIS;
	}

	@Override
	public double calcular(Produto produto) {
		return produto.getCusto() - (produto.getCusto() * 0.75);
	}

}
