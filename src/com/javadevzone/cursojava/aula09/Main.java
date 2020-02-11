package com.javadevzone.cursojava.aula09;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Aluno nequinho = new Aluno();
		nequinho.setNome("Nequinho");
		nequinho.getNotas().add(9D);
		nequinho.getNotas().add(8d);
		nequinho.getNotas().add(7.);
		nequinho.getNotas().add(8.5);
		nequinho.getNotas().add(9.7);
		nequinho.getNotas().add(9.1);
		
		Aluno lumus = new Aluno();
		lumus.setNome("Lumus Code");
		List<Double> notas = lumus.getNotas();
		
		notas.add(5d);
		notas.add(3d);
		notas.add(9d);
		notas.add(10.);
		notas.add(9.5);
		notas.add(8.5);
		
		for (int x=0; x<1000; x++) {
			notas.add( x * x + 0.5);
		}
		
		imprimeResultadoAnual(nequinho);
		
		imprimeResultadoAnual(lumus);
		
		nequinho.imprimeNotas();
		lumus.imprimeNotas();
	}

	private static void imprimeResultadoAnual(Aluno aluno) {
		if (aluno.getMedia() > 7) {
			System.out.println(aluno.getNome() + " foi Aprovado");
		} else {
			System.out.println(aluno.getNome() + " foi Reprovado");
		}
	}
	
	
}
