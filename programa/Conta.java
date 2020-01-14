package programa;

abstract class Conta {

    private int numero;

    private String usuario;

    private double saldo; // Encapsulamento!

    public boolean saque(double valor) { // método == comportamento
        this.saldo -= (valor + (valor * 0.005)) ;  // saque
        return true;
    }

    public void deposito(double valor) {
        this.saldo = this.saldo + valor; // depósito
    }

    void transferir(Conta contaParaTransferir, double valor) {
        if (this.saque(valor)) {
            contaParaTransferir.deposito(valor);
        }
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

    void setSaldo(double valor) {
        this.saldo = valor;
    }

}