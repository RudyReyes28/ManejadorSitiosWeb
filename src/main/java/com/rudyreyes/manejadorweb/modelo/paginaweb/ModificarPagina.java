/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.paginaweb;

import com.rudyreyes.manejadorweb.modelo.util.QuitarCorchetes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rudyo
 */
public class ModificarPagina {
    private String idPagina;
    private String titulo;
    private String sitio;
    private String idPadre;
    private String usuarioCreacion;
    private String fechaCreacion;
    private String fechaModificacion;
    private String usuarioModificacion;
    List<String> etiquetas;

    public ModificarPagina() {
        etiquetas = new ArrayList<>();
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
    
    public void setIdPaginaSinCorchetes(String idPagina) {
        this.idPagina = idPagina;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = QuitarCorchetes.quitarCorchetes(titulo);
    }
    
    public void setTituloSinCorchetes(String titulo) {
        this.titulo = titulo;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = QuitarCorchetes.quitarCorchetes(sitio);
    }
    
    public void setSitioSinCorchetes(String sitio) {
        this.sitio = sitio;
    }

    public String getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(String idPadre) {
        this.idPadre = QuitarCorchetes.quitarCorchetes(idPadre);
    }
    
    public void setIdPadreCorchetes(String idPadre) {
        this.idPadre = idPadre;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = QuitarCorchetes.quitarCorchetes(usuarioCreacion);
    }
    
    public void setUsuarioCreacionSinCorchetes(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = QuitarCorchetes.quitarCorchetes(fechaCreacion);
    }
    
    public void setFechaCreacionSinCorchetes(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = QuitarCorchetes.quitarCorchetes(fechaModificacion);
    }
    
    public void setFechaModificacionSinCorchetes(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = QuitarCorchetes.quitarCorchetes(usuarioModificacion);;
    }
    
    public void setUsuarioModificacionSinCorchetes(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }
    
    public void setEtiqueta(String etiqueta) {
        this.etiquetas.add(etiqueta);
    }
    
    public void imprimirPagina(){
        System.out.println("Pagina a modificar");
        System.out.println("idPagina: "+idPagina);
        System.out.println("titulo: "+titulo);
        System.out.println("sitio: "+sitio);
        System.out.println("idPadre: "+idPadre);
        System.out.println("usuarioCreacion: "+usuarioCreacion);
        System.out.println("fechaCreacion: "+fechaCreacion);
        System.out.println("fechaModificacion: "+fechaModificacion);
        System.out.println("usuarioModificacion: "+usuarioModificacion);
        
        
        for(String at: etiquetas){
            System.out.println("Etiqueta: "+at);
        }
    }
   
    
}
