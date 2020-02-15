package poo;
import java.io.*;

public class cuadrados
{
 static int a,b,c,n;
 static cuadrados cuadradito;
 public static void main(String Args[])
 {
  cuadradito=new cuadrados();
  while(n<100)
  {
   System.out.println(cuadradito.lista()+" "+cuadradito.cuadrado());   
  }    
 } 
 public cuadrados()
 {
  a=0;
  b=0;
  c=0;
  n=0;
 } 
 public int lista()
 {
  n++;
  return n;
 }
 public int cuadrado()
 {
  a++;
  b=a*a;
  return b;
 }        
}