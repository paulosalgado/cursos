package br.com.alura.reflection;

import java.util.List;
import java.util.Map;

import br.com.alura.reflection.dinamico.exemplo.InterfaceExemplo;
import br.com.alura.reflection.util.Mapeador;

public class CarregaDinamico {
	
	public static void main(String[] args) throws Exception {
		
		Mapeador mapeador = new Mapeador();
		mapeador.load("classes.prop");
		
		List<?> lista = mapeador.getInstancia(List.class);
		
		System.out.println(lista.getClass());
		System.out.println(mapeador.getImplementacao(Map.class));
		
		InterfaceExemplo interfaceExemplo = mapeador.getInstancia(InterfaceExemplo.class, "");
		System.out.println(interfaceExemplo.toString());
	}
	
}
