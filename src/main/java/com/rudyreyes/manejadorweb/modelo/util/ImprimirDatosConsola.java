/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.util;

import com.rudyreyes.manejadorweb.modelo.paginaweb.PaginaWeb;
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
    
}
