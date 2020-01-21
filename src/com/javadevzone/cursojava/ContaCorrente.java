package com.javadevzone.cursojava;

public class ContaCorrente extends Conta {

	private double chequeEspecial = 200;
	
	@Override
	public boolean saque(double valor) {
		if (this.getSaldo() + chequeEspecial  >= valor) {
			super.setSaldo(this.getSaldo() - valor);
			
			return true;
		}
		
		return false;
	}
	
}
