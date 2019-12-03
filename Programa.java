
class Programa {

  public static void main(String[] itsevolution) {
    // 0 = fechada
    // 1 = aberta
    var janela = 0;
    var visitante = "Olá @Mareugena";

    // booleano (true, false)
    var estarDia = true;
    var hora = 10;

    var nome = "Luti";

    while (estarDia == true) {
      janela = 1;
      hora = hora + 1;

      if (hora >= 18) {
        janela = 0;
        estarDia = false;
      }
      
      System.out.println("Hora atual: " + hora); // CONCATENAÇÃO
    }
      
    System.out.println("Boa noite " + nome + ", hora de dormir");
    // boa noite Luti, hora de dormir!
  }

}