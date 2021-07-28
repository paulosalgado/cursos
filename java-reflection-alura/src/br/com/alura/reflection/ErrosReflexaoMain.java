package br.com.alura.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import br.com.alura.reflection.util.ErrosReflexao;

public class ErrosReflexaoMain {
	
	public static void main(String[] args) throws Exception {
		
		ErrosReflexao instancia = new ErrosReflexao();
		Class<?> instanciaClass = instancia.getClass();
		
		try {
			
			Method metodo = instanciaClass.getMethod("metodo", String.class);
			metodo.invoke(instancia, "");
			
		} catch (InvocationTargetException e) {
			e.getTargetException().printStackTrace();
		}
	}
	
}
