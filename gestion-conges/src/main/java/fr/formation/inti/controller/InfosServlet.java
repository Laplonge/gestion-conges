package fr.formation.inti.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfosServlet
 */
public class InfosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InfosServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<hr>ServerName : "+request.getServerName());
		out.println("<hr>Method : "+request.getMethod());
		out.println("<hr>PathInfo : "+request.getPathInfo());
		out.println("<hr>ContextPath : "+request.getContextPath());
		out.println("<hr>PathTranslated : "+request.getPathTranslated());
		out.println("<hr>Locale : "+request.getLocale());
		out.println("<hr>ServletContext : "+request.getServletContext());
		out.println("<hr>LocalAddr : "+request.getLocalAddr());
		out.println("<hr>QueryString : "+request.getQueryString());
		out.println("<hr>SALUT, C'EST COOL");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	// ceci est un test prout prout 2
}
