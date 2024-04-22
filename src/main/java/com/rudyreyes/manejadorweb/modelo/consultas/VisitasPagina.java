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
public class VisitasPagina {
    List<String> idPaginas;

    public VisitasPagina() {
    }

    public VisitasPagina(List<String> idPaginas) {
        this.idPaginas = new ArrayList<>(idPaginas);
    }

    public List<String> getIdPaginas() {
        return idPaginas;
    }

    public void setIdPaginas(List<String> idPaginas) {
        this.idPaginas = idPaginas;
    }
    
    public void imprimirDatos(){
        System.out.println("VISITAS PAGINA");
        for(String pag: idPaginas){
            System.out.println("Sitio: "+pag);
        }
    }
}
