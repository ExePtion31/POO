import java.io.*;
public class Prog2 
{
 public static void main(String args[])throws IOException
 {
  int puntos,r1;
  puntos=0;
  String valor,Ra,Rb,Rc,Rd,Verd,Fals;
  Ra="A";Rb="B";Rc="C";Rd="D";Verd="Verdadero";Fals="Falso";
  BufferedReader Entrada=new BufferedReader(new InputStreamReader(System.in));
  
  //////////////////////Pregunta 1//////////////////
  System.out.println("___________________\nPrimera pregunta: ¿Cuanto es 2+2?\nA)5\nB)11\nC)22\nD)4\n___________________\nRespuesta:");
  valor=Entrada.readLine();
  if(valor.equalsIgnoreCase(Rd))
  {
   puntos++;
   System.out.println("___________________\n¡Correcto!\nCantidad de puntos:"+" "+puntos+"\n___________________");
  }
  else
   System.out.println("___________________\n¡Incorrecto!\nCantidad de puntos:"+" "+puntos+"\n___________________");   
   
  ////////////////////Pregunta 2////////////////////////
  System.out.println("___________________\nSegunda pregunta: ¿Quien era Pablo Emilio Escobar Gabiria?\nA)Un Cantante\nB)Un Narcotraficante\nC)Un Pastor\nD)Un Bailarin\n___________________\nRespuesta:");
  valor=Entrada.readLine();
  if(valor.equalsIgnoreCase(Rb))
  {
   puntos++;
   System.out.println("___________________\n¡Correcto!\nCantidad de puntos:"+" "+puntos+"\n___________________");  
  }
  else
  System.out.println("___________________\n¡Incorrecto!\nCantidad de puntos:"+" "+puntos+"\n___________________");   
 }        
}
