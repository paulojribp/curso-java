package com.javadevzone.cursojava.exercicios;

public class Produto {

	private double custo;
	private TipoProduto tipoProduto;

	public Produto(double custo, TipoProduto tipoProduto) {
		this.custo = custo;
		this.tipoProduto = tipoProduto;
	}

	public double getCusto() {
		return custo;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}
	
}
