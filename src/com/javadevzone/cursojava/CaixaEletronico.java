package com.javadevzone.cursojava;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		// tipo da vari�vel   =  tipo da inst�ncia
		Conta conta 	= 		 new ContaCorrente();
		conta.setUsuario("Crys Tiro Certo");
		conta.deposito(500);
		conta.xpto();
		
		System.out.println(conta.getUsuario());
		
		if (conta.pagar("xpto", 500)) {
			System.out.println("Boleto pago com sucesso!");
		} else {
			System.out.println("Voc� n�o tem saldo para pagar!");
		}
		
		Conta contaDoLucasSanti = new ContaPoupanca();
		contaDoLucasSanti.deposito(500);
		contaDoLucasSanti.saque(600);
		
		
		
		conta.transferir(contaDoLucasSanti, 700);
		
		System.out.println("O saldo da Conta �: " + conta.getSaldo());
		System.out.println("O saldo da Conta do Lucas Santi �: " + contaDoLucasSanti.getSaldo());
	}
	
}
