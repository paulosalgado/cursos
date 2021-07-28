package br.com.alura.reflection.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class GeradorXML {
	
	public static String getXML(Object object) throws Exception {
		
		Class<?> objectClass = object.getClass();
		
		StringBuilder builder = new StringBuilder();
		builder.append("<" + objectClass.getSimpleName() + "> \n");
		
		for (Field field : objectClass.getDeclaredFields()) {
			
			builder.append("  <" + field.getName() + ">");
			
			field.setAccessible(true);
			
			builder.append(field.get(object));
			
			builder.append("</" + field.getName() + "> \n");
		}
		
		builder.append("</" + objectClass.getSimpleName() + "> \n");
		
		return builder.toString();
	}
	
	public static Map<String, Object> getFieldMap(Object object) throws Exception {
		
		Map<String,Object> mapa = new HashMap<>();
		
		Class<?> objectClass = object.getClass();
		
		for (Field field : objectClass.getDeclaredFields()) { 
			
			field.setAccessible(true);
			
			mapa.put(field.getName(), field.get(object));
		}
		
		return mapa;
	}
	
}
