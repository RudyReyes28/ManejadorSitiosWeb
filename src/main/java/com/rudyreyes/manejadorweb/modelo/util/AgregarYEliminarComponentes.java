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
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author rudyo
 */
public class AgregarYEliminarComponentes {
    
    public static boolean eliminarComponente(List<PaginaWeb> paginas, EliminarComponente comp){
        
        for(int i=0; i<paginas.size();i++){
            if(paginas.get(i).getIdPagina().equals(comp.getIdPagina())){
                
                for(int j=0; j<paginas.get(i).getComponentes().size(); j++){
                    if(paginas.get(i).getComponentes().get(j).getIdComponente().equals(comp.getIdComponente())){
                        paginas.get(i).getComponentes().remove(j);
                        //SI LO ENCUENTRA LLAMAR LA FUNCION PARA REESCRIBIR LA PAGINA WEB
                        
                        return true;
                    }
                }
            }
        }
        
        return false;
        
    }
    
    public static boolean agregarComponente(List<PaginaWeb> paginas, Componente comp){
        for(int i=0; i<paginas.size();i++){
            if(paginas.get(i).getIdPagina().equals(comp.getIdPagina())){
                paginas.get(i).setComponente(comp);
                return true;
                //SI LO ENCUENTRA LLAMAR LA FUNCION PARA REESCRIBIR LA PAGINA WEB
            }
        }
        
        return false;
    }
    
    public static boolean modificarComponente(List<PaginaWeb> paginas, ModificarComponentes comp){
       
        for(int i=0; i<paginas.size();i++){
            if(paginas.get(i).getIdPagina().equals(comp.getIdPagina())){
                
                for(int j=0; j<paginas.get(i).getComponentes().size(); j++){
                    if(paginas.get(i).getComponentes().get(j).getIdComponente().equals(comp.getIdComponente())){
                        paginas.get(i).getComponentes().get(j).setClaseComponente(comp.getClaseComponente());
                        paginas.get(i).getComponentes().get(j).setListaAtributos(comp.getListaAtributos());
                        //SI LO ENCUENTRA LLAMAR LA FUNCION PARA REESCRIBIR LA PAGINA WEB
                        
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    public static void borrarPaginaWeb(List<PaginaWeb> paginas, BorrarPaginaWeb comp){
        for(int i=0; i<paginas.size();i++){
            if(paginas.get(i).getIdPagina().equals(comp.getIdPagina())){
                paginas.remove(i);
                //ELIMINAMOS LA PAGINA
                //VOLVEMOS A REESTRUCTURAR
                break;
            }
        }
    }
    
    public static void modificarPaginaWeb(List<PaginaWeb> paginas, ModificarPagina comp){
        for(int i=0; i<paginas.size();i++){
            if(paginas.get(i).getIdPagina().equals(comp.getIdPagina())){
               
                String titulo = comp.getTitulo();
                paginas.get(i).setTituloSinCorchetes(titulo);
                if(!comp.getEtiquetas().isEmpty()){
                    paginas.get(i).setEtiquetas(comp.getEtiquetas());
                }
                //ELIMINAMOS LA PAGINA
                //VOLVEMOS A REESTRUCTURAR
                break;
            }
        }
    }
    
    public static boolean borrarSitioWeb(List<SitioWeb> sitios, BorrarSitioWeb borrar){
       for(int i =0; i<sitios.size(); i++){
           if(sitios.get(i).getIdSitio().equals(borrar.getIdSitio())){
               sitios.remove(i);
               return true;
               //actualizar sitios
           }
       } 
       
       return false;
    }
    
}
