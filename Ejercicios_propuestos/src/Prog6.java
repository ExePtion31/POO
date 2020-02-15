import java.io.*;
public class Prog6 
{
 public static void main (String args[])throws IOException 
 {
  int precioc,desc1,desctotal;
  precioc=0;desc1=0;desctotal=0;
  String valor,marca,marca2;
  marca="Si";
  BufferedReader Entrada=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Valor del computador:");
  valor=Entrada.readLine();
  precioc=Integer.parseInt(valor);
  System.out.println("¿El computador es de la marca ABACO?:");
  marca2=Entrada.readLine();
  System.out.println("__________________________________________");
  
  if((precioc>=1000000)&&(marca2.equalsIgnoreCase(marca)))
  {
   desc1=(15*precioc)/100;
   desctotal=precioc-desc1;
   System.out.println("Valor del computador:"+" "+precioc+"\nMarca ABACO:"+" "+marca2+"\nTotal a pagar con 15% de Desc:"+" "+desctotal);   
   System.out.println("__________________________________________");
  }
  else
  {
   if((precioc<1000000)&&(marca2.equalsIgnoreCase(marca)))
   {
    desc1=(5*precioc)/100;
    desctotal=precioc-desc1;
    System.out.println("Valor del computador:"+" "+precioc+"\nMarca ABACO:"+" "+marca2+"\nTotal a pagar con 5% de Desc:"+" "+desctotal);
    System.out.println("__________________________________________");
   }
   else
   {
    if(precioc>1000000)
    {
     desc1=(10*precioc)/100;
     desctotal=precioc-desc1;
     System.out.println("Valor del computador:"+" "+precioc+"\nMarca ABACO: No\nTotal a pagar con 10% de Desc:"+" "+desctotal);
     System.out.println("__________________________________________"); 
    }
    else
    {
     if(precioc<1000000)
     {    
      System.out.println("Valor del computador:"+" "+precioc+"\nMarca ABACO: No\nTotal a pagar con 0% de Desc:"+" "+desctotal);
      System.out.println("__________________________________________"); 
     } 
     else
      ;
    }    
   }    
  }    
 }        
}
