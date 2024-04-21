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
public class ImprimirDatosConsola {
    
    public static void imprimirPaginasWeb(List<PaginaWeb> paginas){
        System.out.println("\n\nPAGINAS ENCONTRADAS");
        if (!paginas.isEmpty()) {
            for (PaginaWeb pagina : paginas) {
                pagina.imprimirPagina();
                System.out.println("\n");
            }
        }else{
            System.out.println("No hay paginas");
        }
        
    }
    
    public static void imprimirSitiosWeb(List<SitioWeb> sitios){
        System.out.println("\n\nSITIOS ENCONTRADAS");
        if (!sitios.isEmpty()) {
            for (SitioWeb sitio : sitios) {
                sitio.imprimirSitio();
                System.out.println("\n");
            }
        }else{
            System.out.println("No hay sitios");
        }
    }
    
}
