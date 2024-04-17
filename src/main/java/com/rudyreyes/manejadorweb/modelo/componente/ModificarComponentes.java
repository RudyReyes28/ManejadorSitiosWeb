/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.componente;

import com.rudyreyes.manejadorweb.modelo.util.QuitarCorchetes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rudyo
 */
public class ModificarComponentes {
    private String idComponente;
    private String idPagina;
    private String claseComponente;
    private List<Atributo> listaAtributos; 

    public ModificarComponentes() {
        listaAtributos = new ArrayList<>();
    }

    public ModificarComponentes(String idComponente, String idPagina, String claseComponente) {
        this.idComponente = idComponente;
        this.idPagina = idPagina;
        this.claseComponente = claseComponente;
    }

    public ModificarComponentes(String idComponente, String idPagina, String claseComponente, List<Atributo> listaAtributos) {
        this.idComponente = idComponente;
        this.idPagina = idPagina;
        this.claseComponente = claseComponente;
        this.listaAtributos = listaAtributos;
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

    public String getClaseComponente() {
        return claseComponente;
    }

    public void setClaseComponente(String claseComponente) {
        this.claseComponente = claseComponente;
    }

    public List<Atributo> getListaAtributos() {
        return listaAtributos;
    }

    public void setListaAtributos(List<Atributo> listaAtributos) {
        this.listaAtributos = listaAtributos;
    }
    
    public void imprimirComponentes(){
        System.out.println("Componente a modificar");
        System.out.println("ID componente: "+ this.idComponente);
        System.out.println("ID pagina: "+this.idPagina);
        System.out.println("Clase: "+this.claseComponente);
        System.out.println("Atributos: ");
        
        if(this.listaAtributos.isEmpty()){
            System.out.println("Es nulo");
        }
        for(Atributo atrib: this.listaAtributos){
            atrib.imprimirAtributo();
        }
    }
}
