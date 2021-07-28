package br.com.caelum.relatorio.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.relatorio.ConnectionFactory;
import br.com.caelum.relatorio.gerador.GeradorRelatorio;

@WebServlet("/movimentacoes")
public class RelatorioServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String nome = request.getServletContext().getRealPath("/WEB-INF/jasper/movimentacoes.jasper");
	        Connection connection = new ConnectionFactory().getConnection();

	        String tipo = request.getParameter("tipo");

	        Map<String, Object> parametros = new HashMap<String, Object>();
	        parametros.put("TIPO", tipo);

	        GeradorRelatorio gerador = new GeradorRelatorio(nome, parametros, connection);
	        gerador.geraPDFParaOutputStream(response.getOutputStream());

	        connection.close();
			
		} catch (SQLException e) {
			throw new ServletException(e);
		}
	}
	
}
