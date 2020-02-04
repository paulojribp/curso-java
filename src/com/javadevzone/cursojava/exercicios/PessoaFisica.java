package com.javadevzone.cursojava.exercicios;

public class PessoaFisica implements Pessoa {

	// variável de instância / propriedade da classe / field / atributo
	private String cpf;
	private int idade;
	private String nome;
	
	public PessoaFisica(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public PessoaFisica(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String obterIdentificacaoFederal() {
		return this.cpf;
	}

	@Override
	public boolean isIdentificacaoFederalValida() {
		return true;
	}

}
