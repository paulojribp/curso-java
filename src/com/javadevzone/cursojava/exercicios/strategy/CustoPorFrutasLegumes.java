package com.javadevzone.cursojava.exercicios.strategy;

import com.javadevzone.cursojava.exercicios.Produto;
import com.javadevzone.cursojava.exercicios.TipoProduto;

public class CustoPorFrutasLegumes implements CustoPorTipoProduto {

	public TipoProduto getTipoProduto() {
		return TipoProduto.FRUTAS_LEGUMES;
	}
	
	@Override
	public double calcular(Produto produto) {
		return produto.getCusto() - (produto.getCusto() * 0.25);
	}

}
