package com.javadevzone.cursojava.exercicios.strategy;

import com.javadevzone.cursojava.exercicios.Produto;
import com.javadevzone.cursojava.exercicios.TipoProduto;

public class CustoPorQualquerProduto implements CustoPorTipoProduto {

	@Override
	public double calcular(Produto produto) {
		return produto.getCusto();
	}

	@Override
	public TipoProduto getTipoProduto() {
		return TipoProduto.OUTROS;
	}

}
