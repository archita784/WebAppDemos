package com.Demo.list;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionLifeListner
 *
 */
@WebListener
public class SessionLifeListner implements HttpSessionListener {

	static int count;
	public static int getCount() {
		return count;
	}
    /**
     * Default constructor. 
     */
    public SessionLifeListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         System.out.println("session created");
         count++;
         System.out.println(count);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
        System.out.println("session destroyed");
    }
	
}
