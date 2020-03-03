package com.javadevzone.cursojava.aula10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GerenciadorDeTimes {

	private List<TimeDeFutebol> times;
	
	public GerenciadorDeTimes() {
		var palmeiras = new TimeDeFutebol("Palmeiras", 1941, 3.4);
		var flamengo = new TimeDeFutebol("Flamengo", 1895, 0.4);
		var cruzeiro = new TimeDeFutebol("Cruzeiro", 1945, 0.4);
		var ceara = new TimeDeFutebol("Ceará", 1912, 0.4);
		var gremio = new TimeDeFutebol("Gremio", 1972, 0.4);
		var internacional = new TimeDeFutebol("Internacional", 1922, 0.4);
		var coritiba = new TimeDeFutebol("Coritiba", 1947, 0.4);
		var fortaleza = new TimeDeFutebol("Fortaleza", 1939, 0.4);
		
		times = Arrays.asList(palmeiras, flamengo, cruzeiro, ceara,
				gremio, internacional, coritiba, fortaleza);
	}
	
	public List<TimeDeFutebol> getTimes() {
		return times;
	}

//	public List<TimeDeFutebol> getTimesFiltrados(int ano) {
//		List<TimeDeFutebol> timesFiltrados = new ArrayList<>();
//		times.forEach(time -> {
//			if (time.getAnoFundacao() > ano) {
//				timesFiltrados.add(time);
//			}
//		});
//		
//		return timesFiltrados;
//	}
	
}














