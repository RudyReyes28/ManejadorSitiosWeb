/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.componente;

import com.rudyreyes.manejadorweb.modelo.util.QuitarCorchetes;

/**
 *
 * @author rudyo
 */
public class EliminarComponente {
    
    private String idComponente;
    private String idPagina;

    public EliminarComponente() {
    }

    public EliminarComponente(String idComponente, String idPagina) {
        this.idComponente = QuitarCorchetes.quitarCorchetes(idComponente);
        this.idPagina = QuitarCorchetes.quitarCorchetes(idPagina);
    }

    public String getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(String idComponente) {
        this.idComponente = QuitarCorchetes.quitarCorchetes(idComponente);
    }
    
    public void setIdComponenteSinCorchetes(String idComponente){
        this.idComponente = idComponente;
    }

    public String getIdPagina() {
        return idPagina;
    }

    public void setIdPagina(String idPagina) {
        this.idPagina = QuitarCorchetes.quitarCorchetes(idPagina);
    }
    
    public void setIdPaginaSinCorchetes(String idPagina) {
        this.idPagina = idPagina;
    }
    
    public void imprimirComponentes(){
        System.out.println("Eliminar Componente");
        System.out.println("ID Componente: "+this.idComponente);
        System.out.println("ID Pagina: "+this.idPagina);
    }
    
}
