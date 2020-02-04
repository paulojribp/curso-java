package com.javadevzone.cursojava.exercicios;

import static com.javadevzone.cursojava.exercicios.TipoProduto.*;

import java.util.HashMap;
import java.util.Map;

import com.javadevzone.cursojava.exercicios.strategy.CustoPorCongelados;
import com.javadevzone.cursojava.exercicios.strategy.CustoPorFrutasLegumes;
import com.javadevzone.cursojava.exercicios.strategy.CustoPorLaticinio;
import com.javadevzone.cursojava.exercicios.strategy.CustoPorQualquerProduto;
import com.javadevzone.cursojava.exercicios.strategy.CustoPorTipoProduto;

public class RegimeNormal implements TipoRegime {

	private Map<TipoProduto, CustoPorTipoProduto> custosPorTipoProduto;
	
	public RegimeNormal() {
		custosPorTipoProduto = new HashMap<TipoProduto, CustoPorTipoProduto>();
		custosPorTipoProduto.put(CONGELADOS, new CustoPorCongelados());
		custosPorTipoProduto.put(LATICINIO, new CustoPorLaticinio());
		custosPorTipoProduto.put(FRUTAS_LEGUMES, new CustoPorFrutasLegumes());
		custosPorTipoProduto.put(OUTROS, new CustoPorQualquerProduto());
		custosPorTipoProduto.put(MATINAIS, new CustoPorMatinais());
	}
	
	public double obterImposto() {
		return 0.15;
	}

	@Override
	public double calcularImposto(Produto produto) {
		CustoPorTipoProduto custoPorTipoProduto = custosPorTipoProduto.get(produto.getTipoProduto());
		return obterImposto() * custoPorTipoProduto.calcular(produto);
	}
	
}
