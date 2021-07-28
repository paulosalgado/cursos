package br.com.alura.reflection.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import br.com.alura.reflection.nulos.modelo.NotaFiscal;
import br.com.alura.reflection.nulos.modelo.Produto;
import br.com.alura.reflection.nulos.modelo.Usuario;
import br.com.alura.reflection.util.ValidadorNulo;

public class ValidarNuloTest {
	
	@Test
	public void produtoTest() {
		
		Produto produto = new Produto();
		produto.codigo = "123";
		produto.nome = "Produto qualquer";
		produto.preco = 10.00F;
		
		List<String> atributosNulos = ValidadorNulo.getAtributosNulos(produto);
		
		assertEquals(2, atributosNulos.size());
		assertTrue(atributosNulos.contains("fornecedor"));
		assertTrue(atributosNulos.contains("descricao"));
	}
	
	@Test
	public void usuarioTest() {
		
		Usuario nota = new Usuario();
		nota.login = "paulo";
		nota.papel = "Usuário";
		nota.ativo = true;
		
		List<String> atributosNulos = ValidadorNulo.getAtributosNulos(nota);
		
		assertEquals(2, atributosNulos.size());
		assertTrue(atributosNulos.contains("senha"));
		assertTrue(atributosNulos.contains("email"));
	}
	
	@Test
	public void notaFiscalTest() {
		
		NotaFiscal nota = new NotaFiscal();
		nota.sequencia = 5;
		nota.data = new Date();
		
		List<String> atributosNulos = ValidadorNulo.getAtributosNulos(nota);
		
		assertEquals(3, atributosNulos.size());
		assertTrue(atributosNulos.contains("talao"));
		assertTrue(atributosNulos.contains("cnpj"));
		assertTrue(atributosNulos.contains("endereco"));
	}
	
}
