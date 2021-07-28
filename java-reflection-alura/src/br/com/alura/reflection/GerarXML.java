package br.com.alura.reflection;

import br.com.alura.reflection.util.GeradorXML;
import br.com.alura.reflection.xml.modelo.Usuario;

public class GerarXML {
	
	public static void main(String[] args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setLogin("paulo");
		usuario.setPapel("Usuário");
		usuario.setAtivo(true);
		
		System.out.println(GeradorXML.getXML(usuario));
		System.out.println(GeradorXML.getFieldMap(usuario));
	}
	
}
