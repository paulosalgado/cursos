package br.com.alura.reflection.util;

import java.lang.reflect.Method;

public class ValidadorObjetos {
	
	public static boolean validarObjeto(Object object) throws Exception {
		
		boolean resultado = true;
		
		Class<?> objectClass = object.getClass();
		
		for (Method method : objectClass.getMethods()) {
			
			if (method.getName().startsWith("validar") 
					&& method.getReturnType() == boolean.class
					&& method.getParameterTypes().length == 0) {
				
				Boolean retorno = (Boolean) method.invoke(object);
				
				resultado = resultado && retorno.booleanValue();
			}
		}
		
		return resultado;
	}
	
}
