package programa;

public class CaixaEletronico {

    public static void main(String[] args) {

        Conta contaDoHardbits = new Conta(); // criação de um novo objeto

        contaDoHardbits.setSaldo(5000);
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
        contaDoBruno.saldo = 15000;
        contaDoBruno.transferir( contaDoHardbits, valor); // Parâmetros

        System.out.println("---------------------------------------------------");
        System.out.println("Usuário: "+ contaDoBruno.getUsuario() +", possui um saldo de " + contaDoBruno.getSaldo() + ", na conta "+ contaDoBruno.getNumero() +".");
        System.out.println("Usuário: "+ contaDoHardbits.getUsuario() +", possui um saldo de " + contaDoHardbits.getSaldo() + ", na conta "+ contaDoHardbits.getNumero() +".");

    }

}
