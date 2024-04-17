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
public class Atributo {
    private String atributo;
    private String valor;

    public Atributo(String atributo, String valor) {
        this.atributo = atributo;
        this.valor = QuitarCorchetes.quitarCorchetes(valor);
    }
    
    
    public String getAtributo() {
        return atributo;
    }

    public String getValor() {
        return valor;
    }
    
    public void imprimirAtributo(){
        System.out.println("Atributo "+this.atributo+" Valor: "+this.valor);
    }
    
  
}
