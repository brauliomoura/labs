package br.com.impacta.javaweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamServlet
 */
@WebServlet("/param")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		
		if((nome != null) && (idade != null)) {
			response.getWriter().append("Bem Vindo " + nome + ". Sua idade atual é de " + idade + " anos.");	
		}else {
			response.getWriter().append("Favor informar nome e idade"); 
		}
		
	}

}
