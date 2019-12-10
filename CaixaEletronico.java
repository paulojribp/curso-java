class CaixaEletronico {

    public static void main(String[] args) {

        Conta contaDoHardbits = new Conta(); // criação de um novo objeto

        contaDoHardbits.saldo = 500;
        contaDoHardbits.numero = "14558";
        contaDoHardbits.usuario = "Hardbits";
        contaDoHardbits.saque(500);

        Conta contaDoBruno = new Conta();
        contaDoBruno.saldo = 400;
        contaDoBruno.usuario = "Bruno";
        contaDoBruno.numero = "125";

        contaDoBruno.deposito(800);
        

        // copia e cola? Isola!

        System.out.println("Usuário: "+ contaDoBruno.usuario +", possui um saldo de " + contaDoBruno.saldo + ", na conta "+ contaDoBruno.numero +".");
        System.out.println("Usuário: "+ contaDoHardbits.usuario +", possui um saldo de " + contaDoHardbits.saldo + ", na conta "+ contaDoHardbits.numero +".");

        var valor = 350; // int valor = 35
        contaDoBruno.transferir( contaDoHardbits, valor); // Parâmetros

        System.out.println("---------------------------------------------------");
        System.out.println("Usuário: "+ contaDoBruno.usuario +", possui um saldo de " + contaDoBruno.saldo + ", na conta "+ contaDoBruno.numero +".");
        System.out.println("Usuário: "+ contaDoHardbits.usuario +", possui um saldo de " + contaDoHardbits.saldo + ", na conta "+ contaDoHardbits.numero +".");

        System.out.println(contaDoHardbits);

    }

}

class Conta {

    String numero;

    String usuario;

    double saldo;

    void saque(double valor) { // método == comportamento
        this.saldo -= valor; // saque
    }

    void deposito(double valor) {
        this.saldo += valor; // depósito
    }

    void transferir(Conta contaParaTransferir, double valor) {
        this.saldo -= valor;
        contaParaTransferir.saldo += valor;
    }

}



