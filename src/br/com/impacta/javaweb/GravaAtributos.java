package br.com.impacta.javaweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GravaAtributos
 */
@WebServlet("/grava-atributos")
public class GravaAtributos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//gravando mensagem no escopo de request
		request.setAttribute("mensagem", "dado colocado no escopo de request");
		
		//gravando mensagem no escopo de sessão
		request.getSession().setAttribute("mensagem", "dado colocado no escopo de sessão");
		
		//gravando mensagem no escopo de aplicação
		this.getServletContext().setAttribute("mensagem", "dado colocado no escopo de aplicação");
		
	}

}
