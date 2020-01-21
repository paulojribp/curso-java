package com.javadevzone.cursojava;

public class ContaPoupanca extends Conta {

	public boolean saque(double valor) {
		if (this.getSaldo() >= valor) {
			super.setSaldo(this.getSaldo() - valor);
			
			return true;
		}
		
		return false;
	}
	
}
