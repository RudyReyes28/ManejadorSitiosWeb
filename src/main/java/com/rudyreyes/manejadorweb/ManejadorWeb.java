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
        String prueba = "<accion nombre=\"MODIFICAR_COMPONENTE\">\n" +
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
"			[Este es el texto que aparece en el titulo :) ]\n" +
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
        } catch (Exception ex) {
            Logger.getLogger(ManejadorWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
