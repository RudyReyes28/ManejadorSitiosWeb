/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.util;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;

/**
 *
 * @author rudyo
 */
public class LevantarServidor {
    
    public static void levantarServidor() throws InterruptedException, Exception {
         // Crear un servidor Jetty en el puerto 8080
        
        Server server = new Server(8080);

        // Configurar el manejador de recursos estáticos
        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setDirectoriesListed(true);
        resourceHandler.setResourceBase("paginasHTML");
//paginasHTML
        // Configurar el manejador de solicitud personalizado
        RequestLoggerHandler requestLoggerHandler = new RequestLoggerHandler();

        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] { requestLoggerHandler , resourceHandler});
        server.setHandler(handlers);

        try {
            // Iniciar el servidor
            server.start();

            // Esperar a que el servidor se detenga
            server.join();
        } finally {
            // Detener el servidor cuando haya terminado de usarlo
            server.stop();
        }
    }

    static class RequestLoggerHandler extends AbstractHandler {
        @Override
        public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            // Imprimir en consola la página a la que se ha accedido
            System.out.println("Has ingresado a " + eliminarDiagonalYExtension(target));
        }
    }
    
   public static void pararServidor(){
       Server server = new Server(8080); // Reemplaza con el puerto real

       
        try {
            server.stop();
            System.out.println("Servidor Jetty detenido exitosamente.");
        } catch (Exception e) {
            System.err.println("Error al detener el servidor Jetty: " + e.getMessage());
        }
   }
    
    public static String eliminarDiagonalYExtension(String input) {
        // Remove the first slash if it exists
        if (input.startsWith("/")) {
            input = input.substring(1);
        }

        // Remove .html if it exists
        if (input.endsWith(".html")) {
            input = input.substring(0, input.length() - 5);
        }

        return input;
    }
}
