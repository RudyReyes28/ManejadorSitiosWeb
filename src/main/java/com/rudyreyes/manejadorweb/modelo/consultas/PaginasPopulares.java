/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.consultas;

/**
 *
 * @author rudyo
 */
public class PaginasPopulares {
    private String idPagina;

    public PaginasPopulares() {
    }

    public PaginasPopulares(String idPagina) {
        this.idPagina = idPagina;
    }

    public String getIdPagina() {
        return idPagina;
    }

    public void setIdPagina(String idPagina) {
        this.idPagina = idPagina;
    }
    
    public void imprimirDatos(){
        System.out.println("Paginas Populares");
        System.out.println(" id Sitio: "+idPagina);
    }
}
