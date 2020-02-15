package poo;
import java.io.*;

public class Numpri 
{
 static int entrada1,entrada2,incremento,n;
 static Numpri Numeroprim;
 public static void main(String Args[])throws IOException
 {
  Leer L=new Leer();
  Numeroprim=new Numpri();
  System.out.println("Dígite el primer válor:");
  entrada1=Integer.parseInt(L.LeerDatos());
  System.out.println("Dígite el segundo válor:");
  entrada2=Integer.parseInt(L.LeerDatos());
  System.out.println("__________________");
  if(entrada1>entrada2)
   System.out.println("ERROR:El segundo valor debe ser mayor que el primero.");
  else
  {
   for(incremento=entrada1;incremento<=entrada2;incremento++)
   {
    System.out.println(incremento);
   }   
  }    
 }
 public Numpri()
 {
  entrada1=0;
  entrada2=0;
  incremento=0;
  n=0;
 }    
}
