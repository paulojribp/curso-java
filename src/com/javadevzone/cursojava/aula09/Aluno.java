package com.javadevzone.cursojava.aula09;

import java.util.ArrayList;

public class Aluno {

	private String nome;
	private String endereco;
	private ArrayList<Double> notas = new ArrayList<>(); // <Double> >> Generics
	private double[] outrasNotas = new double[5];
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> notas) {
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
