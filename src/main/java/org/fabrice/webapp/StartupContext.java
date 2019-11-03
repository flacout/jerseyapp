package org.fabrice.webapp;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartupContext implements ServletContextListener {
    public static String TRIPLE_STORE;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Context started");
        TRIPLE_STORE = "I'm a database connection";
        ServletContext context = servletContextEvent.getServletContext();
        context.setAttribute("database", "I'am the REAL CONTEEEXT DATABASE");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Context dying");
    }
}
