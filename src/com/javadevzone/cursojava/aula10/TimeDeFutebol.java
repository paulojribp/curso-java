package com.javadevzone.cursojava.aula10;

public class TimeDeFutebol implements Comparable<TimeDeFutebol> {

	private String nome;
	private int anoFundacao;
	private double mediaDeGols;
	
	public TimeDeFutebol(String nome, int anoFundacao, double mediaDeGols) {
		this.nome = nome;
		this.anoFundacao = anoFundacao;
		this.mediaDeGols = mediaDeGols;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getMediaDeGols() {
		return mediaDeGols;
	}
	public void setMediaDeGols(double mediaDeGols) {
		this.mediaDeGols = mediaDeGols;
	}
	public int getAnoFundacao() {
		return anoFundacao;
	}
	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}

	@Override
	public String toString() {
		return "TimeDeFutebol [nome=" + nome + ", anoFundacao=" + anoFundacao + ", mediaDeGols=" + mediaDeGols + "]";
	}

	@Override
	public int compareTo(TimeDeFutebol time) {
		return this.getAnoFundacao() - time.getAnoFundacao();
	}
	
}
