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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
