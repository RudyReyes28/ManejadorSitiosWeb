/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.util;

import com.rudyreyes.manejadorweb.modelo.paginaweb.PaginaWeb;
import com.rudyreyes.manejadorweb.modelo.sitioweb.SitioWeb;
import java.util.List;

/**
 *
 * @author rudyo
 */
public class EscribirSitiosWeb {
    
    public static String generarContenidoHTMLSitio(String titulo, String encabezado) {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>" + titulo + "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>" + encabezado + "</h1>\n" +
                "</body>\n" +
                "</html>";
    }
    
    
    public static void verificarPaginasHijas(List<SitioWeb> sitios, List<PaginaWeb> paginas){
        for (SitioWeb sitio : sitios) {
            String si = "<!DOCTYPE html>\n"
                    + "<html>\n"
                    + "<head>\n"
                    + "<title>" + sitio.getIdSitio() + "</title>\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "<h1> Sitio WEB" + sitio.getIdSitio() + "</h1>\n";
            String estructura = "";
            for (PaginaWeb pagina : paginas) {
                if (pagina.getSitio() != null) {
                    if (sitio.getIdSitio().equals(pagina.getSitio())) {

                        if (pagina.getIdPadre() == null || sitio.getIdSitio().equals(pagina.getIdPadre())) {

                            estructura += "\n<a href=\"http://localhost:8080/" + pagina.getIdPagina() + ">Ir a la pagina " + pagina.getTitulo() + "</a>";

                        }

                    }
                }
            }

            si += estructura;
            si += "</body>\n"
                    + "</html>";
            
            GenerarArchivos.escribirArchivo(si, sitio.getIdSitio());

        }
        
        
    }
    
}
