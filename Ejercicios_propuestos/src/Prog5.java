import java.io.*;
public class Prog5 
{
 public static void main(String args[])throws IOException
 {
  double preciok,ptotal,destotal,desc1;
  preciok=89.50;ptotal=0;destotal=0;desc1=0;
  int distancia,ndias;
  distancia=0;ndias=0;
  String valor;
  BufferedReader Entrada=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Distancia a recorrer(Km):");
  valor=Entrada.readLine();
  distancia=Integer.parseInt(valor);
  System.out.println("Número de días de estancia:");
  valor=Entrada.readLine();
  ndias=Integer.parseInt(valor);
  
  if((distancia>1000)&&(ndias>7))
  {
   ptotal=distancia*preciok;
   desc1=(30*ptotal)/100;
   destotal=ptotal-desc1;
   System.out.println("Total a pagar por"+" "+ndias+" "+"dias de estancia y"+" "+distancia+"km"+" "+"de distancia(Aplica el 30% de Desc):"+" "+"$"+destotal);   
  }
  else
  {
   ptotal=distancia*preciok;
   System.out.println("Total a pagar por"+" "+ndias+" "+"dias de estancia y"+" "+distancia+"km"+" "+"de distancia(No aplica el 30% de Desc):"+" "+"$"+ptotal);   
  }    
 }        
}
