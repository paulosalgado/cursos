package br.com.alura.reflection.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ValidadorNulo {
	
	public static List<String> getAtributosNulos(Object object) {
		
		List<String> lista = new ArrayList<String>();
		Class<?> objectClass = object.getClass();
		
		for (Field field : objectClass.getFields()) {
			
			try {
				
				if (field.get(object) == null)
					lista.add(field.getName());
				
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		
		return lista;
	}
	
}
