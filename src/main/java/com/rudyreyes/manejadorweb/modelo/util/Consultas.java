/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.util;

import com.rudyreyes.manejadorweb.modelo.componente.Componente;
import com.rudyreyes.manejadorweb.modelo.consultas.ConsultaComponentes;
import com.rudyreyes.manejadorweb.modelo.paginaweb.PaginaWeb;
import com.rudyreyes.manejadorweb.modelo.sitioweb.SitioWeb;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rudyo
 */
public class Consultas {
    
    public static String componentesPagina(List<PaginaWeb> paginas, ConsultaComponentes comp){
        String consulta = "";
        
        
        for(PaginaWeb pagina: paginas ){
            if(pagina.getIdPagina().equalsIgnoreCase(comp.getIdPagina())){
                int cantidad =1;
                for(Componente compP: pagina.getComponentes()){
                    consulta += "  ---> Componentes del tipo "+comp.getTipoComponente()+" de la Pagina "+comp.getIdPagina()+"\n";

                    if(!comp.getTipoComponente().equalsIgnoreCase("TODOS")){
                        if(compP.getClaseComponente().equalsIgnoreCase(comp.getTipoComponente())){
                            consulta += cantidad +". Componente: "+compP.getIdComponente()+"\n";
                            cantidad ++;
                        }
                    }else if(comp.getTipoComponente().equalsIgnoreCase("TODOS")){
                            consulta += cantidad +". Componente: "+compP.getClaseComponente()+" ID:"+compP.getIdComponente()+"\n";
                            cantidad ++;
                    }
                }
                break;
            }
        }
        return consulta;
    }
    
    public static String paginasPopulares(List<Map.Entry<String, Integer>> lista, List<SitioWeb> sitios, String buscarSitio){
        String paginas = "--> 10 PAGINAS MAS POPULARES\n";
        
        for(SitioWeb sitio: sitios){
            if(sitio.getIdSitio().equalsIgnoreCase(buscarSitio)){
                int i=1;
                for (Map.Entry<String, Integer> entry : lista) {
                    if(buscarPaginasWeb(sitio.getPaginasWeb(), entry.getKey())){
                        paginas += i+" Pagina: "+entry.getKey()+" Visitas: "+entry.getValue()+"\n";
                        i++;
                        
                    }
                    if(i>=11){
                        return paginas;
                    }
                }
                
                return paginas;
            }
        }
        
        return paginas;
        
    }
    
    public static boolean buscarPaginasWeb(List<String> paginas, String key){
        for(String pagina: paginas){
            if(pagina.equalsIgnoreCase(key)){
                return true;
            }
        }
        
        return false;
    }
}
