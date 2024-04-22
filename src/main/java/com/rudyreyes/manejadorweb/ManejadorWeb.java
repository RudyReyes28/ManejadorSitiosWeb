/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rudyreyes.manejadorweb;

import com.rudyreyes.manejadorweb.modelo.consultas.ConsultaComponentes;
import com.rudyreyes.manejadorweb.modelo.consultas.PaginasPopulares;
import com.rudyreyes.manejadorweb.modelo.consultas.VisitasPagina;
import com.rudyreyes.manejadorweb.modelo.consultas.VisitasSitio;
import com.rudyreyes.manejadorweb.modelo.util.Consultas;
import com.rudyreyes.manejadorweb.modelo.util.LevantarServidor;
import static com.rudyreyes.manejadorweb.modelo.util.LevantarServidor.eliminarDiagonalYExtension;
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
         
        String entrada = "CONSULTAR VISITAS_SITIO \"_misitio\",\"_misitio3\",\"_misitio2\" ;"; 
        String entrada2 = "Consultar visitas_pagina \"_mipagina\";";
        String entrada3 = "CONSULTAR PAGINAS_POPULARES \"_misitio2\";";
        String entrada4 = "Consultar COMPONENTE PARRAFO \"_misitio2\";";
        lexerSQ lexer = new lexerSQ(new StringReader(entrada+entrada2+entrada4+entrada3));
        ParserSQ parser = new ParserSQ(lexer);
        
        try {
            parser.parse();
            
            List<Object> consultas = new ArrayList<>(parser.obtenerConsultas());
            
            for (Object objeto : consultas) {
                if (objeto instanceof ConsultaComponentes) {
                    ConsultaComponentes consulta = (ConsultaComponentes)objeto;
                    consulta.imprimirDatos();
                    
                
                }else if(objeto instanceof PaginasPopulares){
                    PaginasPopulares consulta = (PaginasPopulares)objeto;
                    consulta.imprimirDatos();
                
                }else if(objeto instanceof VisitasPagina){
                    VisitasPagina consulta = (VisitasPagina)objeto;
                    consulta.imprimirDatos();
                
                }else if(objeto instanceof VisitasSitio){
                    VisitasSitio consulta = (VisitasSitio)objeto;
                    consulta.imprimirDatos();
                }
                
            }
        } catch (Exception ex) {
            Logger.getLogger(ManejadorWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


}
