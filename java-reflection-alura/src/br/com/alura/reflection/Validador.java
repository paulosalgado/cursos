package br.com.alura.reflection;

import br.com.alura.reflection.util.ValidadorObjetos;
import br.com.alura.reflection.validador.modelo.Usuario;

public class Validador {
	
	public static void main(String[] args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setLogin("paulojose");
		usuario.setEmail("paulo@mail.com");
		usuario.setSenha("123456789");
		
		boolean valido = ValidadorObjetos.validarObjeto(usuario);
		
		if (valido)
			System.out.println("Objeto válido!");
		else
			System.out.println("Objeto inválido!");
	}
	
}
