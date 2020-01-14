package programa;

public class ContaCorrente extends Conta {

    private double chequeEspecial = 200;

    // SOBRESCRITA / OVERRIDE
    public boolean saque(double valor) {
        if (chequeEspecial + super.getSaldo() >= valor) {
            super.saque(valor);
           return true;
        }
        
        System.out.println("Não possui limite no cheque especial da classe Conta Corrente");
        return false;
    }

}

// 