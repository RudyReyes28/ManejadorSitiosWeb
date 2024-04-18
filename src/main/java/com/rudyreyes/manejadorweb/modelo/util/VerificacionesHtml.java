/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.util;

import com.rudyreyes.manejadorweb.modelo.sitioweb.SitioWeb;

/**
 *
 * @author rudyo
 */
public class VerificacionesHtml {
    
    public static boolean verificarSitiosWeb(SitioWeb sitio){
        return sitio.getIdSitio()!= null;
    }
}
