class Aula02 {
	
	public static void main(String[] args) {

		int x = 25;
		int y = 25;

		int soma = x + y;

		String frase = "O resultado da soma é: " + soma;

		System.out.println(frase);

		// boolean resultado = (soma == 50); // a soma é 50?
		boolean resultado = (soma != 50); // a soma é 50?

		if (resultado) {
			System.out.println("Soma é igual a 50");
		}

		
	}

}