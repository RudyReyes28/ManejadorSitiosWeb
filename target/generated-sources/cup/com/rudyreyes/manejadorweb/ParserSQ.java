
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.rudyreyes.manejadorweb;

import com.rudyreyes.manejadorweb.modelo.consultas.*;
import java.util.ArrayList;
import java.util.List;
import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ParserSQ extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return ParserSQSym.class;
}

  /** Default constructor. */
  @Deprecated
  public ParserSQ() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ParserSQ(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserSQ(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\004\000\002\003\004\000\002\003\004" +
    "\000\002\003\004\000\002\004\005\000\002\005\005\000" +
    "\002\007\007\000\002\010\010\000\002\006\007\000\002" +
    "\006\005\000\002\011\003\000\002\011\003\000\002\011" +
    "\003\000\002\011\003\000\002\011\003\000\002\011\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\004\004\004\001\002\000\012\005\013\006" +
    "\014\011\017\013\012\001\002\000\004\002\010\001\002" +
    "\000\006\002\uffff\004\004\001\002\000\004\002\000\001" +
    "\002\000\004\002\001\001\002\000\006\002\ufffb\004\ufffb" +
    "\001\002\000\016\014\036\015\044\016\042\017\043\020" +
    "\037\021\040\001\002\000\004\012\026\001\002\000\004" +
    "\012\026\001\002\000\006\002\ufffe\004\ufffe\001\002\000" +
    "\006\002\ufffd\004\ufffd\001\002\000\004\012\021\001\002" +
    "\000\006\002\ufffc\004\ufffc\001\002\000\004\022\022\001" +
    "\002\000\004\012\023\001\002\000\004\010\024\001\002" +
    "\000\006\002\ufff8\004\ufff8\001\002\000\004\010\033\001" +
    "\002\000\004\022\027\001\002\000\004\012\030\001\002" +
    "\000\006\007\031\010\ufff5\001\002\000\004\012\026\001" +
    "\002\000\004\010\ufff6\001\002\000\006\002\ufff9\004\ufff9" +
    "\001\002\000\004\010\035\001\002\000\006\002\ufffa\004" +
    "\ufffa\001\002\000\004\012\ufff4\001\002\000\004\012\ufff0" +
    "\001\002\000\004\012\uffef\001\002\000\004\012\045\001" +
    "\002\000\004\012\ufff2\001\002\000\004\012\ufff1\001\002" +
    "\000\004\012\ufff3\001\002\000\004\022\046\001\002\000" +
    "\004\012\047\001\002\000\004\010\050\001\002\000\006" +
    "\002\ufff7\004\ufff7\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\006\002\004\003\005\001\001\000\012\004" +
    "\014\005\015\007\017\010\010\001\001\000\002\001\001" +
    "\000\006\002\006\003\005\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\011\040\001\001" +
    "\000\004\006\033\001\001\000\004\006\024\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\031\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserSQ$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserSQ$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserSQ$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    List<String> idPaginas = new ArrayList<>();
    List<Object> consultas = new ArrayList<>();
    
    

    public List<Object> obtenerConsultas(){
        return consultas;
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ParserSQ$actions {
  private final ParserSQ parser;

  /** Constructor */
  CUP$ParserSQ$actions(ParserSQ parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ParserSQ$do_action_part00000000(
    int                        CUP$ParserSQ$act_num,
    java_cup.runtime.lr_parser CUP$ParserSQ$parser,
    java.util.Stack            CUP$ParserSQ$stack,
    int                        CUP$ParserSQ$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserSQ$result;

      /* select the action based on the action number */
      switch (CUP$ParserSQ$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= listas_instrucciones EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)).value;
		RESULT = start_val;
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserSQ$parser.done_parsing();
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // listas_instrucciones ::= instruccion listas_instrucciones 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)).value;
		 
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("listas_instrucciones",0, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // listas_instrucciones ::= instruccion 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$ParserSQ$stack.peek()).value;
		  
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("listas_instrucciones",0, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instruccion ::= CONSULTAR visitas_sitio 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$ParserSQ$stack.peek()).value;
		 
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("instruccion",1, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruccion ::= CONSULTAR visitas_pagina 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$ParserSQ$stack.peek()).value;
		 
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("instruccion",1, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruccion ::= CONSULTAR paginas_populares 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$ParserSQ$stack.peek()).value;
		
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("instruccion",1, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instruccion ::= CONSULTAR componentes 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$ParserSQ$stack.peek()).value;
		  
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("instruccion",1, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // visitas_sitio ::= VISITASITIO listado_sitios P_COMA 
            {
              Object RESULT =null;
		consultas.add(new VisitasSitio(idPaginas));
				idPaginas.clear();
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("visitas_sitio",2, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // visitas_pagina ::= VISITAPAGINA listado_sitios P_COMA 
            {
              Object RESULT =null;
		consultas.add(new VisitasPagina(idPaginas));
				idPaginas.clear();
				
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("visitas_pagina",3, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // paginas_populares ::= PAG_POPULAR COMILLA ID_PAGINA COMILLA P_COMA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-2)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-2)).value;
		consultas.add(new PaginasPopulares(id));
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("paginas_populares",5, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-4)), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // componentes ::= COMPONENTE tipo_componente COMILLA ID_PAGINA COMILLA P_COMA 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-4)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-4)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-4)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-2)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-2)).value;
		consultas.add(new ConsultaComponentes(id, c));
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("componentes",6, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-5)), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // listado_sitios ::= COMILLA ID_PAGINA COMILLA COMA listado_sitios 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-3)).value;
		idPaginas.add(id);
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("listado_sitios",4, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-4)), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // listado_sitios ::= COMILLA ID_PAGINA COMILLA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-1)).value;
		idPaginas.add(id);
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("listado_sitios",4, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.elementAt(CUP$ParserSQ$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // tipo_componente ::= TITULO 
            {
              String RESULT =null;
		RESULT = "TITULO"; 
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("tipo_componente",7, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // tipo_componente ::= PARRAFO 
            {
              String RESULT =null;
		RESULT = "PARRAFO"; 
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("tipo_componente",7, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // tipo_componente ::= IMAGEN 
            {
              String RESULT =null;
		RESULT = "IMAGEN"; 
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("tipo_componente",7, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // tipo_componente ::= VIDEO 
            {
              String RESULT =null;
		RESULT = "VIDEO"; 
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("tipo_componente",7, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // tipo_componente ::= MENU 
            {
              String RESULT =null;
		RESULT = "MENU"; 
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("tipo_componente",7, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // tipo_componente ::= TODOS 
            {
              String RESULT =null;
		RESULT = "TODOS"; 
              CUP$ParserSQ$result = parser.getSymbolFactory().newSymbol("tipo_componente",7, ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQ$stack.peek()), RESULT);
            }
          return CUP$ParserSQ$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ParserSQ$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ParserSQ$do_action(
    int                        CUP$ParserSQ$act_num,
    java_cup.runtime.lr_parser CUP$ParserSQ$parser,
    java.util.Stack            CUP$ParserSQ$stack,
    int                        CUP$ParserSQ$top)
    throws java.lang.Exception
    {
              return CUP$ParserSQ$do_action_part00000000(
                               CUP$ParserSQ$act_num,
                               CUP$ParserSQ$parser,
                               CUP$ParserSQ$stack,
                               CUP$ParserSQ$top);
    }
}

}
