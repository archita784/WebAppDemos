package com.Demo.list;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ContextAtt
 *
 */
@WebListener
public class ContextAtt implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public ContextAtt() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
        System.out.println("saved");
        System.out.println("name"+scae.getName());
        System.out.println("value"+scae.getValue());
        
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    	 System.out.println("removed");
         System.out.println("name"+scae.getName());
         System.out.println("value"+scae.getValue());
         
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	 System.out.println("replaced");
         System.out.println("name"+scae.getName());
         System.out.println("value"+scae.getValue());
         
    }
	
}
