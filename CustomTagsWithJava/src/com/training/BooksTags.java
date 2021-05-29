package com.training;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class BooksTags extends SimpleTagSupport{
	String title;
	String publisher;
	 public void doTag() throws JspException, IOException {
	        JspWriter out = getJspContext().getOut();
	            if(title!=null){
	            ArrayList<String> list =  getItems();
	            
	            out.print("The book selected by you is "+ title+"<br>");
	            out.print("PUBLISHER "+ publisher +"<br>");
	            for(String bookname:list){
	                out.print(bookname+"<br>");
	            }
	            } 
	    }
	 public ArrayList<String> getItems(){
	        
	        ArrayList<String> al=new ArrayList<String>();
	        if(title.equalsIgnoreCase("java")){
	            al.add("HF Java");
	            al.add("Java Black Book");    
	        }else if(title.equalsIgnoreCase("spring")){
	            al.add("Spring MVC");
	            al.add("Spring in Action");
	        }else if(title.equalsIgnoreCase("hibernate")){
	            al.add("Learn Hibernate in 30 days");
	            al.add("Hibernate in Action");
	        }else if(title.equalsIgnoreCase("EJB")){
	            al.add("HF EJB");
	            al.add("EJB in Action");
	        }else {
	            al.add("HF JSP");
	            al.add("JSP & Servlets ");
	        }
	        return al;
	    }
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	

}
