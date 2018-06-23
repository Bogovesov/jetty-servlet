package com.company;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class App {
    public static void main(String[] args) {
        Server server = new Server(7080);
        ServletContextHandler handler = new ServletContextHandler(server, "/example");
        handler.addServlet(SimpleServlet.class, "/");
        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
