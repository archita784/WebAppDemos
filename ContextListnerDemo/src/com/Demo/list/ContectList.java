package com.Demo.list;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ContectList
 *
 */
@WebListener
public class ContectList implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ContectList() {
        System.out.println("in const");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("destroyred");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         System.out.println("initiated");
         ServletContext context=sce.getServletContext();
         String newMessage=context.getInitParameter("message");
         context.setAttribute("newMessage", newMessage);
    }
	
}
