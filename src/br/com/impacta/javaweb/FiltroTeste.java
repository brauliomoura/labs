package br.com.impacta.javaweb;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FiltroTeste
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD
		}
					, urlPatterns = { "/param" })
public class FiltroTeste implements Filter {

   
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Filtro da servlet de param - IDA");
		
		HttpServletRequest httpReq = (HttpServletRequest) request;
		String nome = httpReq.getParameter("nome");
		
		System.out.println("Request feito informando o nome: " + nome);
			
		chain.doFilter(request, response);
		
		System.out.println("Filtro da servlet de param - VOLTA");
		
	}

	
}
