package com.demo.session;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class SessionAttribute
 *
 */
@WebListener
public class SessionAttribute implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public SessionAttribute() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
        System.out.println("attribute added");
        System.out.println("name"+se.getName());
        System.out.println("value"+se.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	System.out.println("attribute removed");
        System.out.println("name"+se.getName());
        System.out.println("value"+se.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	System.out.println("attribute replaced");
        System.out.println("name"+se.getName());
        System.out.println("value"+se.getValue());
    }
	
}
