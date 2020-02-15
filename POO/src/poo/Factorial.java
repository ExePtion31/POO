package poo;
import java.io.*;

public class Factorial 
{
 static int n,f,r1,r2;
 static Factorial Fact;
 public static void main(String Args[])
 {
  Fact=new Factorial();
  while(n<10)
  {
   r1=Fact.Incremento();
   r2=Fact.resultado();
   System.out.println(r1+" "+r2);   
  }    
 }
 public Factorial()
 {
  n=0;
  f=1;
  r1=0;
  r2=0;
 }
 public int Incremento()
 {
  n++;
  f=f*n;
  return n;
 }
 public int resultado()
 {
  return f;   
 }        
}
