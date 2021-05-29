package com.coforge.employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coforge.model.Address;
import com.coforge.model.Employee;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/empServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		String empname=request.getParameter("empname");
		Integer empid=Integer.parseInt(request.getParameter("empid"));
		String state =request.getParameter("state");
		String city =request.getParameter("city");
		
		Long mobile=Long.parseLong(request.getParameter("mobile"));
		
		
		
		/*
		 * request.setAttribute("empname", empname); request.setAttribute("empid",
		 * empid); request.setAttribute("city", city); request.setAttribute("mobile",
		 * mobile);
		 */
		Employee employee=new Employee();
		
		
		employee.setEmpname(empname);
		employee.setEmpid(empid);
		employee.setMobileNo(mobile);
		
		
		Address address=new Address();
		address.setState(state);
		address.setCity(city);
		employee.setAddress(address);
		
		request.setAttribute("employee", employee);
		RequestDispatcher dispatcher=request.getRequestDispatcher("empadd.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
