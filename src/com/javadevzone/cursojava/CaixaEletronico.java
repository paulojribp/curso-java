package com.javadevzone.cursojava;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		// tipo da variável   =  tipo da instância
		Conta conta 	= 		 new ContaCorrente();
		conta.setUsuario("Crys Tiro Certo");
		conta.deposito(500);
		conta.xpto();
		
		System.out.println(conta.getUsuario());
		
		if (conta.pagar("xpto", 500)) {
			System.out.println("Boleto pago com sucesso!");
		} else {
			System.out.println("Você não tem saldo para pagar!");
		}
		
		Conta contaDoLucasSanti = new ContaPoupanca();
		contaDoLucasSanti.deposito(500);
		contaDoLucasSanti.saque(600);
		
		
		
		conta.transferir(contaDoLucasSanti, 700);
		
		System.out.println("O saldo da Conta é: " + conta.getSaldo());
		System.out.println("O saldo da Conta do Lucas Santi é: " + contaDoLucasSanti.getSaldo());
	}
	
}
