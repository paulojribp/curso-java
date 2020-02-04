package com.javadevzone.cursojava.exercicios.strategy;

import com.javadevzone.cursojava.exercicios.Produto;
import com.javadevzone.cursojava.exercicios.TipoProduto;

public class CustoPorLaticinio implements CustoPorTipoProduto {

	@Override
	public double calcular(Produto produto) {
		return produto.getCusto() - (produto.getCusto() * 0.1);
	}

	@Override
	public TipoProduto getTipoProduto() {
		return TipoProduto.LATICINIO;
	}

}
