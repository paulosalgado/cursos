package br.com.alura.reflection.util;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Mapeador {
	
	private Map<Class<?>, Class<?>> mapa = new HashMap<>();
	
	public void load(String nomeArquivo) throws Exception {
		
		Properties properties = new Properties();
		properties.load(new FileInputStream(nomeArquivo));
		
		for (Object key : properties.keySet()) {
			
			Class<?> classInterface = Class.forName(key.toString());
			
			if (!classInterface.isInterface())
				throw new RuntimeException("A classe " + classInterface.getName() + " não é uma interface");
			
			Class<?> classImplementacao = Class.forName(properties.get(key).toString());
			
			if (!classInterface.isAssignableFrom(classImplementacao))
				throw new RuntimeException("A classe " + classImplementacao.getName() + " não implementa a interface " + classInterface.getName());
			
			mapa.put(classInterface, classImplementacao);
		}
	}
	
	public Class<?> getImplementacao(Class<?> classInterface) {
		return mapa.get(classInterface);
	}
	
	@SuppressWarnings("unchecked")
	public <E> E getInstancia(Class<E> classInterface) throws Exception {
		return (E) mapa.get(classInterface).newInstance();
	}
	
	@SuppressWarnings("unchecked")
	public <E> E getInstancia(Class<E> classInterface, Object... params) throws Exception {
		
		Class<?> classImplementacao = mapa.get(classInterface);
		Class<?>[] tiposConstrutor = new Class<?>[params.length];
		
		for (int i = 0; i < tiposConstrutor.length; i++) {
			tiposConstrutor[i] = params[i].getClass();
		}
		
		Constructor<?> constructor = classImplementacao.getConstructor(tiposConstrutor);
		
		return (E) constructor.newInstance(params);
	}
	
}
