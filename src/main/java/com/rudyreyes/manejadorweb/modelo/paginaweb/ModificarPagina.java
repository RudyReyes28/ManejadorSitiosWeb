/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.paginaweb;

import com.rudyreyes.manejadorweb.modelo.util.QuitarCorchetes;
import java.util.List;

/**
 *
 * @author rudyo
 */
public class ModificarPagina {
    private String idPagina;
    private String titulo;
    List<String> etiquetas;

    public ModificarPagina() {
    }

    public ModificarPagina(String idPagina, String titulo, List<String> etiquetas) {
        this.idPagina = idPagina;
        this.titulo = titulo;
        this.etiquetas = etiquetas;
    }

    public String getIdPagina() {
        return idPagina;
    }

    public void setIdPagina(String idPagina) {
        this.idPagina = QuitarCorchetes.quitarCorchetes(idPagina);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = QuitarCorchetes.quitarCorchetes(titulo);
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }
    
    
   
    
}
