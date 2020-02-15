package poo;
import java.io.*;

public class Principal 
{
 static int n,r,resul;
 static Principal Principalito;
 public static void main(String Args[])throws IOException
 {
  Leer L=new Leer();///Instancia con la clase Leer
  Principalito=new Principal();
  System.out.println("Digite un número");
  n=Integer.parseInt(L.LeerDatos());
  resul=Principalito.Proceso();
  if(resul==0)
   System.out.println("El número es par");
  else
   System.out.println("El número es impar");   
 }
 public Principal()
 {
  n=0;
  r=0;
  resul=0;
 }       
public int Proceso()
 {
  r=n%2;
  return r;  
 }       
}
