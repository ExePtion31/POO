package poo;
import java.io.*;

public class Tabla 
{
 static int num1,num2,num3,n,num4;
 static Tabla Tablita;
 public static void main(String Args[])
 {
  Tablita=new Tabla();
  while(n<10)
  {
   System.out.println(num1+"*"+Tablita.proceso()+"="+Tablita.total());   
  }    
 }
 public Tabla()
 {        
  num1=4;
  num2=0;
  num3=0;
  num4=0;
  n=0;
 }
 public int proceso()
 {
  n++;
  num2=num2+n;
  return n;
 }
 public int total()
 {
  num3++;
  num4=num3*num1;
  return num4;
 }   
}
 
