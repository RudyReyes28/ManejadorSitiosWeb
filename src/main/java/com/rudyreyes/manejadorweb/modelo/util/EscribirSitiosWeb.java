/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.util;

import com.rudyreyes.manejadorweb.modelo.paginaweb.BorrarPaginaWeb;
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
                    + "<h1> Sitio WEB" + sitio.getIdSitio() + "</h1><br>\n";
            String estructura = "";
            for (PaginaWeb pagina : paginas) {
                if (pagina.getSitio() != null) {
                    if (sitio.getIdSitio().equals(pagina.getSitio())) {

                        if (pagina.getIdPadre() == null || sitio.getIdSitio().equals(pagina.getIdPadre())) {

                            estructura += "<a href=\"http://localhost:8080/" + pagina.getIdPagina()+".html\"" + ">Ir a la pagina " + pagina.getTitulo() + "</a><br>";

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
    
    
    public static void agregarPaginaASitio(List<SitioWeb> sitios, PaginaWeb pagina){
        if (!sitios.isEmpty()) {
            for (int i = 0; i < sitios.size(); i++) {
                if(sitios.get(i).getIdSitio().equals(pagina.getSitio())){
                    sitios.get(i).setPaginaWeb(pagina.getIdPagina());
                }
            }
        }
        
    }
    
    
    public static boolean eliminarPaginaDeSitio(List<SitioWeb> sitios, BorrarPaginaWeb pagina){
        for(int i=0; i<sitios.size();i++){
           
                for(int j=0; j<sitios.get(i).getPaginasWeb().size(); j++){
                    if(sitios.get(i).getPaginasWeb().get(j).equals(pagina.getIdPagina())){
                        sitios.get(i).getPaginasWeb().remove(j);
                        return true;
                    }
                }
        }
        
        return false;
    }
    
    public static void generarIndex(List<SitioWeb> sitios) {

        String si = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<title>" + "Sitios_Web" + "</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1> SITIOS WEB DISPONIBLES</h1>\n\n";
        String estructura = "";
        for (SitioWeb sitio : sitios) {
            if (sitio.getIdSitio() != null) {

                estructura += "<a href=\"http://localhost:8080/" + sitio.getIdSitio() + ".html\"" + ">Ir al sitio " + sitio.getIdSitio() + "</a><br>";

            }
        }

        si += estructura;
        si += "</body>\n"
                + "</html>";

        GenerarArchivos.escribirArchivo(si, "indexSitiosWeb");
    }

}
