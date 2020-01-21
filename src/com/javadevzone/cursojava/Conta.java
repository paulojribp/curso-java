package com.javadevzone.cursojava;

public abstract class Conta {
	
	private double saldo;
	private String usuario;
	private int numero;
	

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public void transferir(Conta conta, double valor) {
		if (this.saque(valor)) {
			conta.deposito(valor);
		}
	}
	
	public abstract boolean saque(double valor);

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean pagar(String codigoDeBarras, double valor) {
		// está pago!
		return false;
	}

	// Bad Smells
	public void xpto() {
		this.usuario = usuario.substring(5);
	}
	
}
