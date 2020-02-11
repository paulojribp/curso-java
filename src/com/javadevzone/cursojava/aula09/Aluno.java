package com.javadevzone.cursojava.aula09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Aluno {

	private String nome;
	private List<Double> notas = new LinkedList<>(); // <Double> >> Generics
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}

	public double getMedia() {
		double soma = 0.0;
		
		for (double nota : notas) {
			soma += nota;
		}
			
		return soma / notas.size();
	}
	
	public void imprimeNotas() {
		for (double nota : notas) {
			System.out.println(nota);
		}
	}

}
