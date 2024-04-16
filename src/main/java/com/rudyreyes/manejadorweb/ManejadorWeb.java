/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rudyreyes.manejadorweb;

import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rudyo
 */
public class ManejadorWeb {

    public static void main(String[] args) {
        String prueba = "<accion nombre=\"NUEVA_PAGINA\">\n" +
"	<parametros>\n" +
"		<parametro nombre=\"ID\">\n" +
"			[_MIPagina]\n" +
"		</parametro>\n" +
"		\n" +
"		<parametro nombre=\"TITULO\">\n" +
"			[Mi titulo]\n" +
"		</parametro>\n" +
"		\n" +
"		<parametro nombre=\"SITIO\">\n" +
"			[_sitioWebMercado]\n" +
"		</parametro>\n" +
"		\n" +
"		<parametro nombre=\"PADRE\">\n" +
"			[_MIPaginaPadre]\n" +
"		</parametro>\n" +
"		\n" +
"		<parametro nombre=\"USUARIO_CREACION\">\n" +
"			[_Juan]\n" +
"		</parametro>\n" +
"		\n" +
"		<parametro nombre=\"FECHA_CREACION\"> \n" +
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
"	\n" +
"	<etiquetas>  \n" +
"		<etiqueta valor=\"etiqueta1\"/>\n" +
"		<etiqueta valor=\"etiqueta2\"/>\n" +
"	</etiquetas>\n" +
"\n" +
"</accion>";
        LexerXML lexer = new LexerXML(new StringReader(prueba));
        ParserXML parser = new ParserXML(lexer);
        
        try {
            parser.parse();
        } catch (Exception ex) {
            Logger.getLogger(ManejadorWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
