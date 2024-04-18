/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.util;

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
    
}
