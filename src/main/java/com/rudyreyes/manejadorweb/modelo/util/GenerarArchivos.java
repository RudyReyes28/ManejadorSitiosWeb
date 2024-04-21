/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author rudyo
 */
public class GenerarArchivos {
    
    public static void escribirArchivo(String contenido, String nombreArchivo) {
        try {
            
            String rutaCompleta = "paginasHTML" + File.separator + nombreArchivo+".html"; // Construir la ruta completa del archivo

            BufferedWriter writer = new BufferedWriter(new FileWriter(rutaCompleta));
            writer.write(contenido);
            writer.close();
            System.out.println("Archivo HTML generado con éxito.");
        } catch (IOException e) {
            System.err.println("Error al generar el archivo HTML: " + e.getMessage());
        }
    }
    
    public static void eliminarArchivo(String nombreArchivo) {
        String rutaCompleta = "paginasHTML" + File.separator + nombreArchivo+".html";
        File archivo = new File(rutaCompleta);
        
        // Verificar si el archivo existe
        if (archivo.exists()) {
            // Intentar eliminar el archivo
            if (archivo.delete()) {
                System.out.println("El archivo " + nombreArchivo + " ha sido eliminado exitosamente.");
            } else {
                System.err.println("No se pudo eliminar el archivo " + nombreArchivo + ".");
            }
        } else {
            System.err.println("El archivo " + nombreArchivo + " no existe.");
        }
    }
    
    public static void generarCarpeta(){
        File carpeta = new File("paginasHTML");
        if (!carpeta.exists()) {
            carpeta.mkdirs(); // Crea los directorios necesarios si no existen
        }
    }
}
