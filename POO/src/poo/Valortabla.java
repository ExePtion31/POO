package poo;
import java.io.*;

public class Valortabla 
{
 static int num1,increm,numt,n,m;
 static Valortabla Tablon;
 public static void main(String Args[])throws IOException
 {
  Leer L=new Leer();
  Tablon=new Valortabla();
  System.out.println("Dígite un número:");
  num1=Integer.parseInt(L.LeerDatos());
  while(increm<10)
  {
   System.out.println(num1+"*"+Tablon.proceso()+"="+Tablon.total());   
  }    
 }
 public Valortabla()
 {
  num1=0;
  increm=0;
  numt=0;
  n=0;
  m=0;
 }
 public int proceso()
 {
  increm++;
  return increm;
 }
 public int total()
 {
  n++;
  m=n*num1;
  return m;
 }        
}
