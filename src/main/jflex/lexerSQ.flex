package com.rudyreyes.manejadorweb;
import java.io.*;
import java_cup.runtime.*;

%%

%public
%class lexerSQ
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

whitespace = [ \t\r]
newline = [\n]

%eofval{
    return symbol(ParserSQSym.EOF);
%eofval}


%%

{whitespace} {/* ignore */}
{newline} {/* ignore */}


"consultar"         {return new Symbol(ParserSQSym.CONSULTAR);}
"VISITAS_SITIO"         {return new Symbol(ParserSQSym.VISITASITIO);}
"VISITAS_PAGINA"         {return new Symbol(ParserSQSym.VISITAPAGINA);}
"PAGINAS_POPULARES"         {return new Symbol(ParserSQSym.PAG_POPULAR);}
"COMPONENTE"         {return new Symbol(ParserSQSym.COMPONENTE);}
"\""              {return new Symbol(ParserSQSym.COMILLA);}
";"                 {return new Symbol(ParserSQSym.P_COMA);}
","                 {return new Symbol(ParserSQSym.COMA);}
"TITULO"          {return new Symbol(ParserSQSym.TITULO);}
"PARRAFO"         {return new Symbol(ParserSQSym.PARRAFO);}
"IMAGEN"          {return new Symbol(ParserSQSym.IMAGEN);}
"MENU"            {return new Symbol(ParserSQSym.MENU);}
"VIDEO"           {return new Symbol(ParserSQSym.VIDEO);}
"TODOS"           {return new Symbol(ParserSQSym.TODOS);}


{especiales}({letter}|{number}|{especiales})* { return symbol(ParserSQSym.ID_PAGINA, yytext()); }