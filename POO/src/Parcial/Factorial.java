package Parcial;
import java.io.*;

public class Factorial 
{
 static int a,b,c,entrada;
 
 public Factorial()
 {
  a=0;
  b=1;
  c=0;
 }        
 
 public int Factorial(int entrada)
 {
  while(a<entrada) 
  {
   a++;
   b=b*a;   
  }
  return b;
 }        
}
