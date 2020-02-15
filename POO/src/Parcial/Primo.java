package Parcial;
import java.io.*;

public class Primo
{
 static int i,contador,numero;  
 
 public int Primo(int numero)
 {
  for(i = 1; i <= numero; i++)
  {
   if((numero % i) == 0) 
    contador++;     
  }
  return contador;
 }        
}