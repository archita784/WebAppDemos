package com.context.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigNext
 */
@WebServlet(value="/configNext",
initParams= {
		@WebInitParam(name="greet1",value="Learning EL"),
		@WebInitParam(name="greet2",value="Goodbye")
})
public class ConfigNext extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigNext() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		out.print("<b>Config Next page</b><br>");
		String mess1=config.getInitParameter("greet1<br>");
		out.print(mess1);
		
		String mess2=config.getInitParameter("greet2<br>");
		out.print(mess2);
		Enumeration<String> en=config.getInitParameterNames();
		while(en.hasMoreElements()) {
			String paramname=en.nextElement();
			String value=config.getInitParameter(paramname);
			out.print(value+"<br>");
		}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
