/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.paginaweb;

import com.rudyreyes.manejadorweb.modelo.componente.Componente;
import com.rudyreyes.manejadorweb.modelo.util.QuitarCorchetes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rudyo
 */
public class PaginaWeb {
    private String idPagina;
    private String titulo;
    private String idPadre;
    private String usuarioCreacion;
    private String fechaCreacion;
    private String fechaModificacion;
    private List<Componente> componentes;
    List<String> etiquetas;

    public PaginaWeb() {
        componentes = new ArrayList<>();
    }

    
    public PaginaWeb(String idPagina, String titulo, String idPadre, String usuarioCreacion, String fechaCreacion, String fechaModificacion, List<Componente> componentes, List<String> etiquetas) {
        this.idPagina = idPagina;
        this.titulo = titulo;
        this.idPadre = idPadre;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.componentes = componentes;
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

    public String getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(String idPadre) {
        this.idPadre = QuitarCorchetes.quitarCorchetes(idPadre);
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = QuitarCorchetes.quitarCorchetes(usuarioCreacion);
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = QuitarCorchetes.quitarCorchetes(fechaCreacion);
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = QuitarCorchetes.quitarCorchetes(fechaModificacion);
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }
    
    public void setComponente(Componente componente){
        this.componentes.add(componente);
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }
    
    
    
}
