/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.paginaweb;

import com.rudyreyes.manejadorweb.modelo.util.QuitarCorchetes;

/**
 *
 * @author rudyo
 */
public class BorrarPaginaWeb {
    private String idPagina;

    public BorrarPaginaWeb() {
    }

    public BorrarPaginaWeb(String idPagina) {
        this.idPagina = idPagina;
    }

    public String getIdPagina() {
        return idPagina;
    }

    public void setIdPagina(String idPagina) {
        this.idPagina = QuitarCorchetes.quitarCorchetes(idPagina);
    }
    
    
}
