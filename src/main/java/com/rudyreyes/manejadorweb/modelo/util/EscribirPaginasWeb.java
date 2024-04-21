/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudyreyes.manejadorweb.modelo.util;

import com.rudyreyes.manejadorweb.modelo.componente.Atributo;
import com.rudyreyes.manejadorweb.modelo.componente.Componente;
import com.rudyreyes.manejadorweb.modelo.paginaweb.PaginaWeb;
import java.util.List;

/**
 *
 * @author rudyo
 */
public class EscribirPaginasWeb {
    
    public static void generarTodasLasPaginasHTML(List<PaginaWeb> paginas){
        
        if(!paginas.isEmpty()){
            for(PaginaWeb pagina: paginas){
                String contenido = generarContenidoHTMLPagina(pagina, paginas);
                GenerarArchivos.escribirArchivo(contenido, pagina.getIdPagina());

            }
        
        }
    }
    
    public static void generarUnaPaginaWebID(List<PaginaWeb> paginas, String idPagina){
        if(!paginas.isEmpty()){
            for(PaginaWeb pagina: paginas){
                if(pagina.getIdPagina().equals(idPagina)){
                    String contenido = generarContenidoHTMLPagina(pagina, paginas);
                    GenerarArchivos.escribirArchivo(contenido, pagina.getIdPagina());
                    break;
                }

            }
        
        }
    }
    
    public static String generarContenidoHTMLPagina(PaginaWeb pagina, List<PaginaWeb> paginas) {
        String estructura =  "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>" + pagina.getTitulo() + "</title>\n" +
                "</head>\n" +
                "<body>\n" ;
        
        //AGREGAR COMPONENTES
        for(Componente comp: pagina.getComponentes()){
             estructura += estructura+=agregarComponenteHTML(comp);
        }
        //AGREGAR HIJOS
        
        //AGREGAR ETIQUETAS
        String eti = "";
        for(String et: pagina.getEtiquetas()){
            eti+=et+"|";
        }
        if(eti != null){
            estructura+="<p>"+eti+"</p>";
        }
                
        estructura += "</body>\n" + "</html>";
        
        
        return estructura;
    }
    
    public static String agregarComponenteHTML(Componente componente){
        String etiqueta = "";
        //------TITULO---------
        if(componente.getClaseComponente().equalsIgnoreCase("TITULO")){
            //<h1 style="text-align: center; color: #5A5A5A;">Texto del Título</h1>
            String etiquetaH1 = "<h1 style=\"";
            String texto="";
            String alineacion="";
            String color="";
            
            for(Atributo atrib: componente.getListaAtributos()){
                if(atrib.getAtributo()!= null && atrib.getAtributo().equalsIgnoreCase("TEXTO")){
                    texto = atrib.getValor();
                
                }else if(atrib.getAtributo()!= null && atrib.getAtributo().equalsIgnoreCase("ALINEACION")){
                    alineacion = atrib.getValor();
                
                }else if(atrib.getAtributo()!= null && atrib.getAtributo().equalsIgnoreCase("COLOR")){
                    color = atrib.getValor();
                }
            }
            
            if(alineacion!= null){
                etiquetaH1 += " text-align: "+ alineacionEtiqueta(alineacion)+" ;";
            }
            if(color!=null){
                etiquetaH1 +=" color: " + color +";";
            }
            
            etiquetaH1+= "\">"+texto +"</h1>\n";
            
            return etiquetaH1;
        //------PARRAFO---------
        }else if(componente.getClaseComponente().equalsIgnoreCase("PARRAFO")){
            String etiquetaP = "<p style=\"";
            String texto="";
            String alineacion="";
            String color="";
            
            for(Atributo atrib: componente.getListaAtributos()){
                if(atrib.getAtributo()!= null && atrib.getAtributo().equalsIgnoreCase("TEXTO")){
                    texto = atrib.getValor();
                
                }else if(atrib.getAtributo()!= null && atrib.getAtributo().equalsIgnoreCase("ALINEACION")){
                    alineacion = atrib.getValor();
                
                }else if(atrib.getAtributo()!= null && atrib.getAtributo().equalsIgnoreCase("COLOR")){
                    color = atrib.getValor();
                }
            }
            
            if(alineacion!= null){
                etiquetaP += " text-align: "+ alineacionEtiqueta(alineacion)+" ;";
            }
            if(color!=null){
                etiquetaP +=" color: " + color +";";
            }
            
            etiquetaP+= "\">"+texto +"</p>\n";
            
            return etiquetaP;
        //----IMAGENES--------
        }else if(componente.getClaseComponente().equalsIgnoreCase("IMAGEN")){
           
            String etiquetaImg = "<img src=\"";
            String origen="";
            String alineacion="";
            String altura="";
            String ancho = "";
            
            for(Atributo atrib: componente.getListaAtributos()){
                if(atrib.getAtributo()!= null && atrib.getAtributo().equalsIgnoreCase("ORIGEN")){
                    origen = atrib.getValor();
                
                }else if(atrib.getAtributo()!= null && atrib.getAtributo().equalsIgnoreCase("ALINEACION")){
                    alineacion = atrib.getValor();
                
                }else if(atrib.getAtributo()!= null && atrib.getAtributo().equalsIgnoreCase("ALTURA")){
                    altura = atrib.getValor();
                
                }else if(atrib.getAtributo()!= null && atrib.getAtributo().equalsIgnoreCase("ANCHO")){
                    ancho = atrib.getValor();
                }
            }
            
            if(origen != null){
                etiquetaImg += origen;
            }
            etiquetaImg +="\" alt=\"Error al cargar la imagen\" width=\" ";
            if(ancho != null){
                etiquetaImg += ancho;
            }
            
            etiquetaImg += " \" height=\" ";
            if(altura!= null){
                etiquetaImg += altura;
            }
            etiquetaImg += " \"";
            if(alineacion != null){
                etiquetaImg += "style=\"text-align: "+ alineacionEtiqueta(alineacion)+";\"";
            }
            
            etiquetaImg += ">\n";
            
            return etiquetaImg;
            
        //VIDEOS    
        }else if(componente.getClaseComponente().equalsIgnoreCase("VIDEO")){
            String etiquetaVideo = "<iframe ";
            String origen="";
            String altura="";
            String ancho = "";
            
            for(Atributo atrib: componente.getListaAtributos()){
                if(atrib.getAtributo()!= null && atrib.getAtributo().equalsIgnoreCase("ORIGEN")){
                    origen = atrib.getValor();
                
                }else if(atrib.getAtributo()!= null && atrib.getAtributo().equalsIgnoreCase("ALTURA")){
                    altura = atrib.getValor();
                
                }else if(atrib.getAtributo()!= null && atrib.getAtributo().equalsIgnoreCase("ANCHO")){
                    ancho = atrib.getValor();
                }
            }
            
            if(ancho != null){
                etiquetaVideo += "width=\""+ ancho + "\"";
            }
            
            if(altura!= null){
                etiquetaVideo += " height=\""+ altura + "\"";
            }
            
            if(origen != null){
                etiquetaVideo += " src=\""+origen+"\"";
            }
            
            etiquetaVideo += "frameborder=\"0\" allowfullscreen></iframe>\n";
            
            
            return etiquetaVideo;
        }else if(componente.getClaseComponente().equalsIgnoreCase("MENU")){
            return etiqueta;
        }
        
        
        
        return etiqueta;
    }
    
    public static String alineacionEtiqueta(String alineacion){
        if(alineacion.equalsIgnoreCase("CENTRAR")){
            return "center";
        }else if(alineacion.equalsIgnoreCase("DERECHA")){
            return "right";
        }else if(alineacion.equalsIgnoreCase("JUSTIFICAR")){
            return "justify";
        }else{
            return "left";
        }
    }
}