/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rudyreyes.manejadorweb;

import com.rudyreyes.manejadorweb.modelo.componente.*;
import com.rudyreyes.manejadorweb.modelo.paginaweb.BorrarPaginaWeb;
import com.rudyreyes.manejadorweb.modelo.paginaweb.ModificarPagina;
import com.rudyreyes.manejadorweb.modelo.paginaweb.PaginaWeb;
import com.rudyreyes.manejadorweb.modelo.sitioweb.*;
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
        
        
        
        String prueba = "<accion nombre=\"NUEVO_SITIO_WEB\">\n" +
"	<parametros>\n" +
"		<parametro nombre=\"ID\">\n" +
"			[_sitiomercado]\n" +
"		</parametro>\n" +
"		\n" +
"		<parametro nombre=\"USUARIO_CREACION\"> \n" +
"			[_Juan]\n" +
"		</parametro>\n" +
"		\n" +
"		<parametro nombre=\"FECHA_CREACION\">\n" +
"			[2024-04-11]\n" +
"		</parametro>\n" +
"		\n" +
"		<parametro nombre=\"FECHA_MODIFICACION\">\n" +
"			[2024-04-11]\n" +
"		</parametro>\n" +
"		\n" +
"		<parametro nombre=\"USUARIO_MODIFICACION\"> \n" +
"			[$juan]\n" +
"		</parametro>\n" +
"	</parametros>\n" +
"</accion>\n" +
"\n" +
"<accion nombre=\"BORRAR_SITIO_WEB\">\n" +
"	<parametros>\n" +
"		<parametro nombre=\"ID\">\n" +
"			[_sitioWebMercado]\n" +
"		</parametro>\n" +
"	</parametros>\n" +
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
                    }
                }else if(objetos instanceof ModificarComponentes){
                    ModificarComponentes nuevoComponente = (ModificarComponentes)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirComponentes();
                    }
                }else if(objetos instanceof EliminarComponente){
                    EliminarComponente nuevoComponente = (EliminarComponente)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirComponentes();
                    }
                    
                }else if(objetos instanceof PaginaWeb){
                    PaginaWeb nuevoComponente = (PaginaWeb)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirPagina();
                    }
                    
                }else if(objetos instanceof BorrarPaginaWeb){
                    BorrarPaginaWeb nuevoComponente = (BorrarPaginaWeb)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirBorrarPagina();
                    }
                }else if(objetos instanceof ModificarPagina){
                    ModificarPagina nuevoComponente = (ModificarPagina)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirPagina();
                    }
                    
                }else if(objetos instanceof SitioWeb){
                    SitioWeb nuevoComponente = (SitioWeb)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirSitio();
                    }
                    
                }else if(objetos instanceof BorrarSitioWeb){
                    BorrarSitioWeb nuevoComponente = (BorrarSitioWeb)objetos;
                    if(nuevoComponente!=null){
                        nuevoComponente.imprimirBorrarSitio();
                    }
                    
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ManejadorWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
