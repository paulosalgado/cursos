package br.com.alura.java8;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		palavras.sort(comparing(String::length));
		System.out.println(palavras);
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(palavras);
		
		palavras.forEach(System.out::println);
		
		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}
	
}
