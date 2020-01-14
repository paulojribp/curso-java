package programa;

public class CaixaEletronicoDaContaCorrente{

    public static void main(String[] args) {

        // À direita da variável temos a INSTÂNCIA
        // À esqueda temos o TIPO
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.deposito(500);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.deposito(500);

        contaCorrente.transferir(contaPoupanca, 600);
        System.out.println("O saldo da Conta Corrente é: " + contaCorrente.getSaldo());
        System.out.println("O saldo da Conta Poupança é: " + contaPoupanca.getSaldo());


        // poli == muitos
        // morfismo == formas
        Conta conta = new ContaCorrente();
        conta.deposito(500);
        conta.saque(1500);
        // vários comportamentos
        // Polimorfismo
        

        System.out.println("O saldo da Conta é: " + conta.getSaldo());

    }
}