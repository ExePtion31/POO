package Eje61;
import java.io.*;

public class Principal 
{
 static int pvendidos,valorp,a=1,c;
 static double comisionp,b;
 public static void main(String Args[])throws IOException
 {
  Leer L=new Leer(); 
  Comision Comi=new Comision();
  
  ////////////////////////////////////////////////////////////////
  System.out.println("_______________________________\n¿Cuantos productos vendio hoy?: ");
  pvendidos=Integer.parseInt(L.LeerDatos());
  System.out.println("_______________________________");
  
  
  while(a<=pvendidos)
  {
   System.out.println("De cuanto fue el valor del "+a+" producto?: ");
   valorp=Integer.parseInt(L.LeerDatos());
   comisionp=Comi.Comision(valorp);
   b=comisionp+b;
   a++;
  }
  System.out.println("________________________\nLa comision total es: "+b+"\n________________________");
 }
}
