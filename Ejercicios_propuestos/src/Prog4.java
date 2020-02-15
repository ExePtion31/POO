import java.io.*;
public class Prog4 
{
 public static void main(String args[])throws IOException
 {
  double prome,prom1,prom2,prom3,prom4,prom5;
  prome=0;prom1=2.5;prom2=3.0;prom3=3.5;prom4=4.0;prom5=4.5;
  int ncre,desc,Pcre,Pocre,Vtotal;
  ncre=0;desc=0;Pcre=50000;Pocre=300000;Vtotal=0;
  String valor,Pre,Pos;
  Pre="Pregrado";Pos="Posgrado";
  BufferedReader Entrada=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("¿Cual es su promedio?");
  valor=Entrada.readLine();
  prome=Double.parseDouble(valor);
  System.out.println("¿Está en pregrado o posgrado?");
  valor=Entrada.readLine();
  
  
  if((prome>=prom5)&&(Pre.equalsIgnoreCase(valor)))
  {
   ncre=28*Pcre;
   desc=(ncre*25)/100;
   Vtotal=ncre-desc;
   System.out.println("Su número de creditos es: 28\nValor a pagar con descuento del 25%;"+" "+Vtotal);
  }
  else
  {
   if((prome>=prom4)&&(prome<prom5)&&(Pre.equalsIgnoreCase(valor)))
   {
    ncre=25*Pcre;
    desc=(ncre*10)/100;
    Vtotal=ncre-desc;
    System.out.println("Su número de creditos es: 25\nValor a pagar con descuento del 10%;"+" "+Vtotal);
   } 
   else
    {
     if((prome>prom3)&&(prome<prom4)&&(Pre.equalsIgnoreCase(valor)))
     {
      ncre=20*Pcre;
      Vtotal=ncre;
      System.out.println("Su número de creditos es: 20\nValor a pagar con descuento del 0%;"+" "+Vtotal);
     } 
     else
     {
      if((prome>=prom1)&&(prome<prom2)&&(Pre.equalsIgnoreCase(valor)))
       {
        ncre=15*Pcre;
        Vtotal=ncre;
        System.out.println("Su número de creditos es: 15\nValor a pagar con descuento del 0%;"+" "+Vtotal);
       } 
      else
      {
       if((prome<prom1)&&(Pre.equalsIgnoreCase(valor)))
        System.out.println("Lo sentimos, pero no podra matricularse con su promedio de:"+" "+prome);
       else
       {   
        if((prome>=prom5)&&(Pos.equalsIgnoreCase(valor)))
         {
          ncre=20*Pocre;
          desc=(ncre*20)/100;
          Vtotal=ncre-desc;
          System.out.println("Su número de creditos es: 20\nValor a pagar con descuento del 20%;"+" "+Vtotal);   
         }
        else
        {
         if((prome<prom5)&&(Pos.equalsIgnoreCase(valor)))  
          {
           ncre=10*Pocre;
           Vtotal=ncre;
           System.out.println("Su número de creditos es: 10\nValor a pagar con descuento del 0%;"+" "+Vtotal);
          }
        else
         System.exit(0);
        }   
       }
      }  
     }
    }        
   }
 }
} 
  
  

