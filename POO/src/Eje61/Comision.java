package Eje61;
import java.io.*;

public class Comision 
{
 static double valorp,b,c,d;  

 public double Comision(double valorp)
 {
  if(valorp<=1000)
   b=(10*valorp)/100; 
  else
  {
   if(valorp>1000)
    b=(7*valorp)/100;   
  }    
  return b;
 }        
}
