package Eje60;
import java.io.*;

public class Retencion 
{
 static double c;
 
 public double Retencion(double devengadop,double nhijos)
 {
  if(devengadop<300000&&nhijos<=6) 
   c=(6-nhijos)/2;
  else
  {
   if(devengadop>=300000&&nhijos<3) 
    c=3;
   else
   {
    if(devengadop>=300000&&nhijos>=3)
    {
     c=10/nhijos;   
    }    
   }    
  }
  return c;
 }        
}
