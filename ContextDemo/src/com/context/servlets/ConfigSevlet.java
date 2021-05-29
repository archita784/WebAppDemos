package com.context.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigSevlet
 */
@WebServlet(value="/configSevlet",
	initParams= {
		@WebInitParam(name="message1",value="Learning JSP"),
		@WebInitParam(name="message",value="This is boring")
})

public class ConfigSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		out.print("<b>config page</b><Br>");
		String mess1=config.getInitParameter("message1<br>");
		out.print(mess1);
		
		String mess2=config.getInitParameter("message2<br>");
		out.print(mess2);
		Enumeration<String> en=config.getInitParameterNames();
		while(en.hasMoreElements()) {
			String paramname=en.nextElement();
			String value=config.getInitParameter(paramname);
			out.print(value+"<br>");
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("configNext");
		dispatcher.include(request, response);	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
