package com.rudyreyes.manejadorweb;
import java.io.*;
import java_cup.runtime.*;

%%

%public
%class LexerXML
%cup
%line
%column
%caseless
%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline+1, yycolumn+1);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline+1, yycolumn+1, value);
  }

%}


number = [0-9]
letter = [a-zA-Z]
especiales = "-"|"_"|"$"
fecha = [0-9]{4}-([0][1-9]|1[0-2])-([0-2][1-9]|[3][0-1])
valorAtributo = "TEXTO" | "ALINEACION"| "COLOR" | "ORIGEN" |
                "ALTURA" | "ANCHO" | "PADRE" | "ETIQUETAS"

tipoClase = "TITULO" | "PARRAFO" | "IMAGEN" | "VIDEO" | MENU


whitespace = [ \t\r]
newline = [\n]

%eofval{
    return symbol(ParserXMLSym.EOF);
%eofval}


%%
{whitespace} {/* ignore */}
{newline} {/* ignore */}

"<" "etiquetas" ">"     {return new Symbol(ParserXMLSym.CONTENIDOETIQUETA);}
"<"                     {return new Symbol(ParserXMLSym.MENOR);}
"acciones"              {return new Symbol(ParserXMLSym.ACCIONES);}
">"                     {return new Symbol(ParserXMLSym.MAYOR);}
"/"                     {return new Symbol(ParserXMLSym.DIAGONAL);}
"accion"                {return new Symbol(ParserXMLSym.ACCION);}
"nombre"                {return new Symbol(ParserXMLSym.NOMBRE);}
"="                     {return new Symbol(ParserXMLSym.IGUAL);}
"\""                    {return new Symbol(ParserXMLSym.COMILLA);}
"NUEVO_SITIO_WEB"       {return new Symbol(ParserXMLSym.CREARSITIO);}
"BORRAR_SITIO_WEB"      {return new Symbol(ParserXMLSym.BORRARSITIO);}
"NUEVA_PAGINA"          {return new Symbol(ParserXMLSym.NUEVAPAGINA);}
"BORRAR_PAGINA"         {return new Symbol(ParserXMLSym.BORRARPAGINA);}
"MODIFICAR_PAGINA"      {return new Symbol(ParserXMLSym.MODIFICARPAGINA);}
"AGREGAR_COMPONENTE"    {return new Symbol(ParserXMLSym.AGREGARCOMPONENTE);}
"BORRAR_COMPONENTE"     {return new Symbol(ParserXMLSym.ELIMINARCOMPONENTE);}
"MODIFICAR_COMPONENTE"  {return new Symbol(ParserXMLSym.MODIFICARCOMPONENTE);}
"parametros"            {return new Symbol(ParserXMLSym.PARAMETROS);}
"parametro"             {return new Symbol(ParserXMLSym.PARAMETRO);}
"TITULO"                {return new Symbol(ParserXMLSym.TITULO);}
"SITIO"                 {return new Symbol(ParserXMLSym.SITIO);}
"PADRE"                 {return new Symbol(ParserXMLSym.PADRE);}
"PAGINA"                {return new Symbol(ParserXMLSym.PAGINA);}
"CLASE"                 {return new Symbol(ParserXMLSym.CLASE);}
"[""TITULO""]"          {return new Symbol(ParserXMLSym.TITULOC);}
"[""PARRAFO""]"         {return new Symbol(ParserXMLSym.PARRAFO);}
"[""IMAGEN""]"          {return new Symbol(ParserXMLSym.IMAGEN);}
"[""MENU""]"            {return new Symbol(ParserXMLSym.MENU);}
"[""VIDEO""]"           {return new Symbol(ParserXMLSym.VIDEO);}
"ID"                    {return new Symbol(ParserXMLSym.IDPARAM);}
"USUARIO_CREACION"      {return new Symbol(ParserXMLSym.USUARIOCREACION);}
"FECHA_CREACION"        {return new Symbol(ParserXMLSym.FECHACREACION);}
"FECHA_MODIFICACION"    {return new Symbol(ParserXMLSym.FECHAMODIFICACION);}
"USUARIO_MODIFICACION"  {return new Symbol(ParserXMLSym.USUARIOMODIFICACION);}
"etiquetas"             {return new Symbol(ParserXMLSym.ETIQUETAS);}
"etiqueta"              {return new Symbol(ParserXMLSym.ETIQUETA);}
"atributos"             {return new Symbol(ParserXMLSym.ATRIBUTOS);}
"atributo"              {return new Symbol(ParserXMLSym.ATRIBUTO);}
"valor"                 {return new Symbol(ParserXMLSym.VALORETIQUETA);}
"TEXTO"                 {return new Symbol(ParserXMLSym.TEXTO);}
"ALINEACION"            {return new Symbol(ParserXMLSym.ALINEACION);}
"COLOR"                 {return new Symbol(ParserXMLSym.COLOR);}
"ORIGEN"                {return new Symbol(ParserXMLSym.ORIGEN);}
"ALTURA"                {return new Symbol(ParserXMLSym.ALTURA);}
"ANCHO"                 {return new Symbol(ParserXMLSym.ANCHO);}


"["{especiales}({letter}|{number}|{especiales})* "]" { return symbol(ParserXMLSym.VALORID, yytext()); }
"[" {fecha} "]"  { return symbol(ParserXMLSym.VALORFECHA, yytext()); }
"[" [^\]\[]* "]" { return symbol(ParserXMLSym.LITERAL, yytext()); }
({especiales}|{letter})({letter}|{number}|{especiales})* { return symbol(ParserXMLSym.DATOETIQUETA, yytext()); }

