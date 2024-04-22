/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.util;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
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
    private static Map<String, Integer> visitasPorPagina = new HashMap<>();
    private static Server server;
    public static void levantarServidor() throws InterruptedException, Exception {
         // Crear un servidor Jetty en el puerto 8080
        
        server = new Server(8080);

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
            String paginaVisitada = eliminarDiagonalYExtension(target);
            visitasPorPagina.put(paginaVisitada, visitasPorPagina.getOrDefault(paginaVisitada, 0) + 1);
            System.out.println("Has ingresado a " + paginaVisitada);
        }
    }
    
   public static void pararServidor() throws Exception{
       if (server != null && server.isRunning()) {
            server.stop();
        }
   }
   
   // Método para obtener el número de visitas para una página específica
    public static int obtenerVisitasPorPagina(String pagina) {
        return visitasPorPagina.getOrDefault(pagina, 0);
    }

    // Método para obtener todas las páginas visitadas y su número de visitas
    public static Map<String, Integer> obtenerTodasLasVisitas() {
        return visitasPorPagina;
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
    
    public static void abrirPagina(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void imprimirTodasLasVisitas() {
        System.out.println("=== Registro de visitas ===");
        for (Map.Entry<String, Integer> entry : visitasPorPagina.entrySet()) {
            String pagina = entry.getKey();
            int visitas = entry.getValue();
            System.out.println(pagina + ": " + visitas + " visitas");
        }
        System.out.println("===========================");
    }
}
