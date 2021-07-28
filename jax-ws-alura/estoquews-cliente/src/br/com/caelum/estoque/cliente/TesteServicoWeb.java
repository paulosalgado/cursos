package br.com.caelum.estoque.cliente;

public class TesteServicoWeb {
	
	public static void main(String[] args) {
		
		Filtro filtro = new Filtro();
		filtro.setNome("Iphone");
		filtro.setTipo(TipoItem.LIVRO.name());
		
		Filtros filtros = new Filtros();
		filtros.getFiltro().add(filtro);
		
		EstoqueWS cliente = new EstoqueWS_Service().getEstoqueWSImplPort();
		ListaItens itens = cliente.todosOsItens(filtros);
		
		System.out.println(itens);
	}
	
}
