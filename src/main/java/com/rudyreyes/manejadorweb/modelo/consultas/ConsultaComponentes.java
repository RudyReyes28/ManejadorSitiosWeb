/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.consultas;

/**
 *
 * @author rudyo
 */
public class ConsultaComponentes {
    private String idPagina;
    private String tipoComponente;

    public ConsultaComponentes(String idPagina, String tipoComponente) {
        this.idPagina = idPagina;
        this.tipoComponente = tipoComponente;
    }

    public ConsultaComponentes() {
    }

    public String getIdPagina() {
        return idPagina;
    }

    public void setIdPagina(String idPagina) {
        this.idPagina = idPagina;
    }

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }
    
    public void imprimirDatos(){
        System.out.println("Consulta Componente");
        System.out.println("Tipo "+tipoComponente+" idPagina"+idPagina);
    }
    
}
