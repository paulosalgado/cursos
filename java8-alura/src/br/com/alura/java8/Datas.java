package br.com.alura.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate copaRussia = LocalDate.of(2018, Month.JUNE, 5);
		int anos = copaRussia.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, copaRussia);
		System.out.println(periodo);
		
		LocalDate proximaCopa = copaRussia.plusYears(4);
		System.out.println(proximaCopa);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = proximaCopa.format(formatador);
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
	}
	
}
