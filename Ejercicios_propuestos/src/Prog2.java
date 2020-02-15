import java.io.*;
public class Prog2 
{
 public static void main(String args[])throws IOException
 {
  String Rsi,Rno,valor;
  Rsi="si";Rno="no";
  BufferedReader Entrada=new BufferedReader(new InputStreamReader(System.in));
  
  ///////////Primera pregunta////////////
  System.out.println("Primera pregunta:\n¿Simon Bolivar libertó a Colombia?");
  valor=Entrada.readLine();
  if(valor.equalsIgnoreCase(Rsi))
   System.out.println("|-----------|\n¡Correcto!\n|-----------|");
  else
  {
   System.out.println("|-----------|\n¡Incorrecto!\n|-----------|");   
   System.exit(0);    
  }
  
  ///////////Segunda pregunta////////////
  System.out.println("Segunda pregunta:\n¿Camilo Torres fue un guerrillero?");
  valor=Entrada.readLine();
  if(valor.equalsIgnoreCase(Rsi))
   System.out.println("|-----------|\n¡Correcto!\n|-----------|");
  else
   {
   System.out.println("|-----------|\n¡Incorrecto!\n|-----------|");   
   System.exit(0);    
   } 
  
  ///////////Tercera pregunta////////////
  System.out.println("Tercera pregunta:\n¿El Binomio de Oro es un grupo de música vallenata?");
  valor=Entrada.readLine();
  if(valor.equalsIgnoreCase(Rsi))
   System.out.println("|-----------|\n¡Correcto!\n|-----------|");
  else
   {
   System.out.println("|-----------|\n¡Incorrecto!\n|-----------|");   
   System.exit(0);    
   } 
 }        
}
