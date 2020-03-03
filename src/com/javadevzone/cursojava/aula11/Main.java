package com.javadevzone.cursojava.aula10;

import static java.lang.System.out;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {		
		GerenciadorDeTimes gerenciador = new GerenciadorDeTimes();
		
		var times = gerenciador.getTimes();
		
		String nomes = times
			.stream()
			.sorted((timeA, timeB) -> timeA.getNome().compareTo(timeB.getNome()))
			.parallel()
			.filter(time -> time.getAnoFundacao() > 1900)
			.map(time -> time.getNome())
			.peek(out::println)			
			.reduce("", String::concat);
		
		out.println(nomes);
		
//		nomesDosTimes.forEach(out::println);

//		Palmeiras
//		Cruzeiro
//		Coritiba
//		Gremio
		
//		gerenciador.getTimesFiltrados(1940).forEach(time -> {
//			out.println(time.getNome());
//		});
		
	}
	
}






