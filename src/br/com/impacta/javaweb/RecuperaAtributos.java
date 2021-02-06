package br.com.impacta.javaweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecuperaAtributos
 */
@WebServlet("/recupera-atributos")
public class RecuperaAtributos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mensagemDoRequest = (String) request.getAttribute("mensagem");
		String mensagemDaSessao = (String) request.getSession().getAttribute("mensagem");
		String mensagemDaAplicacao = (String) this.getServletContext().getAttribute("mensagem");
		
		StringBuilder sb = new StringBuilder("<html><h3>msg no request: " + mensagemDoRequest + "\n<p>");
		sb.append("msg na sessao: " + mensagemDaSessao + "\n<p>");
		sb.append("msg na aplicação: " + mensagemDaAplicacao + "</h3></html>");
		
		response.getWriter().append(sb.toString());
		
	
	}

}
