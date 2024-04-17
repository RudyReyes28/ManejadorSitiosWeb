/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rudyreyes.manejadorweb;

import com.rudyreyes.manejadorweb.modelo.componente.*;
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
        
        
        
        String prueba = "<accion nombre=\"BORRAR_COMPONENTE\">\n" +
"	<parametros>\n" +
"		<parametro nombre=\"ID\">\n" +
"			[$componente-1]\n" +
"		</parametro>\n" +
"		\n" +
"		<parametro nombre=\"PAGINA\">\n" +
"			[_MIPagina]\n" +
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
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ManejadorWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
