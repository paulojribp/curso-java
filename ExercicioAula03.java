class Carro {

    String cor;
    int anoFabricao;
    String marca;
    String modelo;

    void ligar() {
        System.out.println("Seu carro "+ this.marca + " / " + this.modelo + " está ligado! Bom passeio...");
    }

    void andar() {
        System.out.println("Seu carro "+ this.modelo + " de ano " + this.anoFabricao + " está andando! Dirija com segurança.");
    }

    void acelerar() {
        if (this.modelo.equals("Fusca")) {
            System.out.println("Seu carro não acelera porque é um fusca. Paciência!!!");
        } else {
            System.out.println("Seu carro está acelerando. Fique de olho na estrada!");
        }
    }

}


class TesteDoExercicio {

    public static void main(String[] args) {
        Carro fusca = new Carro();
        fusca.anoFabricao = 1938;
        fusca.cor = "Azul";
        fusca.marca = "VW";
        fusca.modelo = "Fusca";

        fusca.ligar();

        fusca.andar();

        fusca.acelerar();
    }

}

