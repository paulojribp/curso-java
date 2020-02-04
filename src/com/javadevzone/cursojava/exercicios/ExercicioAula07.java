package com.javadevzone.cursojava.exercicios;

import static com.javadevzone.cursojava.exercicios.TipoRegime.REGIME_NORMAL;
import static java.lang.System.out;

public class ExercicioAula07 {

	public static void main(String[] args) {
		
		PessoaJuridica pj = new PessoaJuridica("11222333000155");
		pj.mudarRegima(REGIME_NORMAL);
		Produto produto = new Produto(50D, TipoProduto.MATINAIS);
		
		out.println(pj.calcularImposto(produto));
	}
	
}
