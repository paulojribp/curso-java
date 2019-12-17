class CaixaEletronico {

    public static void main(String[] args) {

        Conta contaDoHardbits = new Conta(); // criação de um novo objeto

        
        contaDoHardbits.setNumero(-14558);

        contaDoHardbits.setUsuario("Hardbits");
        contaDoHardbits.saque(500);

        Conta contaDoBruno = new Conta();
        contaDoBruno.setUsuario("Bruno");
        contaDoBruno.setNumero(125);

        contaDoBruno.deposito(800);

        // copia e cola? Isola!

        System.out.println("Usuário: "+ contaDoBruno.getUsuario() +", possui um saldo de " + contaDoBruno.getSaldo() + ", na conta "+ contaDoBruno.getNumero() +".");
        System.out.println("Usuário: "+ contaDoHardbits.getUsuario() +", possui um saldo de " + contaDoHardbits.getSaldo() + ", na conta "+ contaDoHardbits.getNumero() +".");

        var valor = 350; // int valor = 35
        contaDoBruno.transferir( contaDoHardbits, valor); // Parâmetros

        System.out.println("---------------------------------------------------");
        System.out.println("Usuário: "+ contaDoBruno.getUsuario() +", possui um saldo de " + contaDoBruno.getSaldo() + ", na conta "+ contaDoBruno.getNumero() +".");
        System.out.println("Usuário: "+ contaDoHardbits.getUsuario() +", possui um saldo de " + contaDoHardbits.getSaldo() + ", na conta "+ contaDoHardbits.getNumero() +".");

    }

}

class Conta {

    private int numero;

    private String usuario;

    private double saldo; // Encapsulamento!

    void saque(double valor) { // método == comportamento
        if (this.saldo >= valor) {
            this.saldo -= (valor + (valor * 0.005)) ;  // saque
        } else {
            System.out.println("Não possui saldo para sacar!");
        }
    }

    void deposito(double valor) {
        this.saldo += valor; // depósito
    }

    void transferir(Conta contaParaTransferir, double valor) {
        //this.saldo -= valor;
        this.saque(valor);
        //contaParaTransferir.saldo += valor;
        contaParaTransferir.deposito(valor);
    }

    void setNumero(int numeroDaConta) {
        if (numeroDaConta > 0) {
            this.numero = numeroDaConta;
        } 
    }
    void setUsuario(String nomeUsuario) {
        this.usuario = nomeUsuario;
    }

    String getUsuario() {
        return this.usuario;
    }

    int getNumero() {
        return this.numero;
    }

    double getSaldo() {
        return this.saldo;
    }

}



