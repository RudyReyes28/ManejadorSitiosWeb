/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.util;

import com.rudyreyes.manejadorweb.modelo.componente.Componente;
import com.rudyreyes.manejadorweb.modelo.componente.EliminarComponente;
import com.rudyreyes.manejadorweb.modelo.componente.ModificarComponentes;
import com.rudyreyes.manejadorweb.modelo.paginaweb.BorrarPaginaWeb;
import com.rudyreyes.manejadorweb.modelo.paginaweb.ModificarPagina;
import com.rudyreyes.manejadorweb.modelo.paginaweb.PaginaWeb;
import com.rudyreyes.manejadorweb.modelo.sitioweb.BorrarSitioWeb;
import com.rudyreyes.manejadorweb.modelo.sitioweb.SitioWeb;

/**
 *
 * @author rudyo
 */
public class VerificacionesHtml {
    
    public static boolean verificarSitiosWeb(SitioWeb sitio){
        return sitio.getIdSitio()!= null;
    }
    
    public static boolean borrarPaginaWeb(BorrarPaginaWeb sitio){
        return sitio.getIdPagina()!= null;
    }
    
    public static boolean verificarBorrarSitio(BorrarSitioWeb sitio){
        return sitio.getIdSitio()!= null;
    }
    
    public static boolean modificarPaginaWeb(ModificarPagina pagina){
        return pagina.getIdPagina()!= null;
    }
    
    
    public static boolean verficarAgregarComponente(Componente comp){
        if(comp.getIdPagina()!=null && comp.getIdComponente()!= null &&comp.getClaseComponente()!=null){
            return true;
        }
        
        return false;
    }
    
    public static boolean verificarModificarComponente(ModificarComponentes comp){
        if(comp.getIdPagina()!=null && comp.getIdComponente()!= null &&comp.getClaseComponente()!=null){
            return true;
        }
        
        return false;
    }
    
    
    public static boolean verificarEliminarComponente(EliminarComponente comp){
        if(comp.getIdPagina()!=null && comp.getIdComponente()!= null ){
            return true;
        }
        
        return false;
    }

    
    public static boolean verificarPaginaWeb(PaginaWeb pagina){
        if(pagina.getIdPagina()!= null && pagina.getSitio()!=null){
            return true;
        }
        
        return false;
    }
}
