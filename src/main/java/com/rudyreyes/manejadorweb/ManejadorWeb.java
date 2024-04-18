/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rudyreyes.manejadorweb;

import com.rudyreyes.manejadorweb.modelo.componente.*;
import com.rudyreyes.manejadorweb.modelo.paginaweb.BorrarPaginaWeb;
import com.rudyreyes.manejadorweb.modelo.paginaweb.ModificarPagina;
import com.rudyreyes.manejadorweb.modelo.paginaweb.PaginaWeb;
import com.rudyreyes.manejadorweb.modelo.sitioweb.*;
import com.rudyreyes.manejadorweb.modelo.util.*;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rudyo
 */
public class ManejadorWeb {

    public static void main(String[] args) {
        generarCarpeta();
        
        
        String prueba = "<accion nombre=\"AGREGAR_COMPONENTE\">\n" +
"	<parametros>\n" +
"	\n" +
"		<parametro nombre=\"ID\">\n" +
"			[_componente-1]\n" +
"		</parametro>\n" +
"		\n" +
"		<parametro nombre=\"PAGINA\">\n" +
"			[_MIPagina]\n" +
"		</parametro>\n" +
"\n" +
"		<parametro nombre=\"CLASE\">\n" +
"			[TITULO]\n" +
"		</parametro>\n" +
"	</parametros>\n" +
"\n" +
"	<atributos>\n" +
"		<atributo nombre=\"TEXTO\">\n" +
"			[https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png]\n" +
"		</atributo>\n" +
"		\n" +
"		<atributo nombre=\"COLOR\">\n" +
"			[#5A5A5A]\n" +
"		</atributo>\n" +
"	</atributos>\n" +
"</accion>";
        LexerXML lexer = new LexerXML(new StringReader(prueba));
        ParserXML parser = new ParserXML(lexer);
        
        try {
            parser.parse();
            List<Object> acciones = new ArrayList<>(parser.obtenerAcciones());
            
            for(Object objetos: acciones){
                
                if(objetos instanceof Componente){
                    Componente nuevoComponente = (Componente)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirComponentes();
                        //LISTO
                    }
                
                }else if(objetos instanceof ModificarComponentes){
                    ModificarComponentes nuevoComponente = (ModificarComponentes)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirComponentes();
                        //LISTO
                    }
                
                }else if(objetos instanceof EliminarComponente){
                    EliminarComponente nuevoComponente = (EliminarComponente)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirComponentes();
                        //HACER VERIFICACIONES
                        //YA ESTA MANEJADO
                    }
                    
                }else if(objetos instanceof PaginaWeb){
                    PaginaWeb nuevoComponente = (PaginaWeb)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirPagina();
                        //HACER VERIFICACIONES
                        //AGREGARLA A LA LISTA
                        //MANDAR A CREAR EL SITIO WEB
                    }
                    
                }else if(objetos instanceof BorrarPaginaWeb){
                    BorrarPaginaWeb nuevoComponente = (BorrarPaginaWeb)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirBorrarPagina();
                        //listo
                    }
                }else if(objetos instanceof ModificarPagina){
                    ModificarPagina nuevoComponente = (ModificarPagina)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirPagina();
                        //listo
                    }
                    
                }else if(objetos instanceof SitioWeb){
                    SitioWeb nuevoComponente = (SitioWeb)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirSitio();
                        if(VerificacionesHtml.verificarSitiosWeb(nuevoComponente)){
                            String contenido = EscribirSitiosWeb.generarContenidoHTMLSitio(nuevoComponente.getIdSitio(), "Sitio Web "+nuevoComponente.getIdSitio());
                            GenerarArchivos.escribirArchivo(contenido, nuevoComponente.getIdSitio());
                        }
                    }
                    
                }else if(objetos instanceof BorrarSitioWeb){
                    BorrarSitioWeb nuevoComponente = (BorrarSitioWeb)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirBorrarSitio();
                        //listo
                    }
                    
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ManejadorWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void generarCarpeta(){
        File carpeta = new File("paginasHTML");
        if (!carpeta.exists()) {
            carpeta.mkdirs(); // Crea los directorios necesarios si no existen
        }
    }
}
