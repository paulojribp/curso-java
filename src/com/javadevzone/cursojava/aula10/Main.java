package com.javadevzone.cursojava.aula10;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		var palmeiras = new TimeDeFutebol("Palmeiras", 1914, 3.4);
		var flamengo = new TimeDeFutebol("Flamengo", 1895, 0.4);
		var cruzeiro = new TimeDeFutebol("Cruzeiro", 1945, 0.4);
		var ceara = new TimeDeFutebol("Ceará", 1912, 0.4);
		var gremio = new TimeDeFutebol("Gremio", 1972, 0.4);
		var internacional = new TimeDeFutebol("Internacional", 1922, 0.4);
		var coritiba = new TimeDeFutebol("Coritiba", 1947, 0.4);
		var fortaleza = new TimeDeFutebol("Fortaleza", 1939, 0.4);
		
		List<TimeDeFutebol> times = Arrays.asList(palmeiras, flamengo, cruzeiro, ceara,
				gremio, internacional, coritiba, fortaleza);
		
		List<String> nomeDosTimes = new LinkedList<String>();
		times.forEach((time) -> nomeDosTimes.add(time.getNome()));
		
		// Classe Interna >> Inner Class
		// Functional Interface
		// Lambda Expression
		times.sort(TimeDeFutebol::compareTo);
		
		// Method Reference
		nomeDosTimes.sort(String::compareTo);
		
		times.forEach(out::println);
		nomeDosTimes.forEach(out::println);
		
	}
	
}
