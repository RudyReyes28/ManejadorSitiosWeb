/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.util;

/**
 *
 * @author rudyo
 */
public class QuitarCorchetes {
    
    public static String quitarCorchetes(String cadena) {
        // Verificar si la cadena tiene al menos dos caracteres (para evitar una excepción)
        if (cadena.length() >= 2) {
            // Usar substring para obtener la subcadena sin el primer y último carácter
            return cadena.substring(1, cadena.length() - 1);
        } else {
            // Si la cadena es demasiado corta, retornarla sin cambios
            return cadena;
        }
    }
}
