package programa;

class ContaPoupanca extends Conta {

    public boolean saque(double valor) {
        if (super.getSaldo() >= valor) {
            super.saque(valor);
            return true;
        }

        System.out.println("Não possui saldo para realização do Saque na Conta Poupança");
        return false;
    }

}



// Evite Herança prefira Composição