/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.sitioweb;

import com.rudyreyes.manejadorweb.modelo.util.QuitarCorchetes;

/**
 *
 * @author rudyo
 */
public class BorrarSitioWeb {
    private String idSitio;

    public BorrarSitioWeb() {
    }

    public BorrarSitioWeb(String idSitio) {
        this.idSitio = idSitio;
    }

    public String getIdSitio() {
        return idSitio;
    }

    public void setIdSitio(String idSitio) {
        this.idSitio = QuitarCorchetes.quitarCorchetes(idSitio);
    }
    
    
    
    
    public void imprimirBorrarSitio(){
        System.out.println("Borrar sitio: "+this.idSitio);
    }
    
}
