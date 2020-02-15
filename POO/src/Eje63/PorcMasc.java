package Eje63;
import static Eje63.Principal.porcmasentre;
import java.io.*;

public class PorcMasc 
{
 static double a;
 
 public double PorcMasc(double porcmasentre,double naccidentes)
 {
  a=(porcmasentre*100)/naccidentes;
     
  return a;
 }        
}
