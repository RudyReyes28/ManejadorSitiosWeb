/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.sitioweb;

import com.rudyreyes.manejadorweb.modelo.paginaweb.PaginaWeb;
import com.rudyreyes.manejadorweb.modelo.util.QuitarCorchetes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rudyo
 */
public class SitioWeb {
    private String idSitio;
    
    private String usuarioCreacion;
    private String fechaCreacion;
    private String fechaModificacion;
    private String usuarioModificacion;
    List<PaginaWeb> paginasWeb;

    public SitioWeb() {
        this.paginasWeb = new ArrayList<>();
    }

    public String getIdSitio() {
        return idSitio;
    }

    public void setIdSitio(String idSitio) {
        this.idSitio = QuitarCorchetes.quitarCorchetes(idSitio);
    }
    
    public void setIdSitioSinCorchetes(String idSitio) {
        this.idSitio = idSitio;
    }

    public List<PaginaWeb> getPaginasWeb() {
        return paginasWeb;
    }

    public void setPaginasWeb(List<PaginaWeb> paginasWeb) {
        this.paginasWeb = paginasWeb;
    }
    
    public void setPaginaWeb(PaginaWeb paginaWeb){
        this.paginasWeb.add(paginaWeb);
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
    
    public void imprimirSitio(){
        System.out.println("Sitio Web");
        System.out.println("idSitio: "+idSitio);
        System.out.println("usuarioCreacion: "+usuarioCreacion);
        System.out.println("fechaCreacion: "+fechaCreacion);
        System.out.println("fechaModificacion: "+fechaModificacion);
        System.out.println("usuarioModificacion: "+usuarioModificacion);
        
        for(PaginaWeb pag: paginasWeb){
            pag.imprimirPagina();
        }
        
    }
    
}
