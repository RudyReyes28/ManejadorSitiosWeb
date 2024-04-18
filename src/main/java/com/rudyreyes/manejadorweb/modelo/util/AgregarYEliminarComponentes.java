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
    
    public static void eliminarComponente(List<PaginaWeb> paginas, EliminarComponente comp){
        boolean componenteEncontrado = false;
        for (PaginaWeb pagina : paginas) {
            if (pagina.getIdPagina().equals(comp.getIdPagina())) {
                Iterator<Componente> iter = pagina.getComponentes().iterator();
                while (iter.hasNext()) {
                    Componente compE = iter.next();
                    if (compE.getIdComponente().equals(comp.getIdComponente())) {
                        iter.remove(); // Eliminar el componente de la lista
                        //SI LO ENCUENTRA LLAMAR LA FUNCION PARA REESCRIBIR LA PAGINA WEB
                        componenteEncontrado = true; // Cambia el estado de la variable a verdadero
                        break;
                    }
                }
            }

            if (componenteEncontrado) {
                break; // Salir del ciclo 'for' si el componente fue encontrado
            }
        }
        
    }
    
    public static void agregarComponente(List<PaginaWeb> paginas, Componente comp){
        for(int i=0; i<paginas.size();i++){
            if(paginas.get(i).getIdPagina().equals(comp.getIdPagina())){
                paginas.get(i).setComponente(comp);
                //SI LO ENCUENTRA LLAMAR LA FUNCION PARA REESCRIBIR LA PAGINA WEB
                break;
            }
        }
    }
    
    public static void modificarComponente(List<PaginaWeb> paginas, ModificarComponentes comp){
        boolean componenteEncontrado = false;
        for(int i=0; i<paginas.size();i++){
            if(paginas.get(i).getIdPagina().equals(comp.getIdPagina())){
                
                for(int j=0; j<paginas.get(i).getComponentes().size(); j++){
                    if(paginas.get(i).getComponentes().get(j).getIdComponente().equals(comp.getIdComponente())){
                        paginas.get(i).getComponentes().get(j).setClaseComponente(comp.getClaseComponente());
                        paginas.get(i).getComponentes().get(j).setListaAtributos(comp.getListaAtributos());
                        //SI LO ENCUENTRA LLAMAR LA FUNCION PARA REESCRIBIR LA PAGINA WEB
                        componenteEncontrado = true;
                        break;
                    }
                }
            }
            if (componenteEncontrado) {
                break; // Salir del ciclo 'for' si el componente fue encontrado
            }
        }
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
                paginas.get(i).setTitulo(titulo);
                if(!comp.getEtiquetas().isEmpty()){
                    paginas.get(i).setEtiquetas(comp.getEtiquetas());
                }
                //ELIMINAMOS LA PAGINA
                //VOLVEMOS A REESTRUCTURAR
                break;
            }
        }
    }
    
    public static void borrarSitioWeb(List<SitioWeb> sitios, BorrarSitioWeb borrar){
       for(int i =0; i<sitios.size(); i++){
           if(sitios.get(i).getIdSitio().equals(borrar.getIdSitio())){
               sitios.remove(i);
               break;
               //actualizar sitios
           }
       } 
    }
    
}
