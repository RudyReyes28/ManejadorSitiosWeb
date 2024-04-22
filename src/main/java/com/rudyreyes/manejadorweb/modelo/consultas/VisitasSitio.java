/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.consultas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rudyo
 */
public class VisitasSitio {
    private List<String> idSitios;

    public VisitasSitio() {
    }

    public VisitasSitio(List<String> idSitios) {
        this.idSitios = new ArrayList<>(idSitios);
    }
    
    

    public List<String> getIdSitios() {
        return idSitios;
    }

    public void setIdSitios(List<String> idSitios) {
        this.idSitios = idSitios;
    }
    
    
    public void imprimirDatos(){
        System.out.println("VISITAS SITIO");
        for(String sitio: idSitios){
            System.out.println("Sitio: "+sitio);
        }
    }
    
}
