import java.io.*;
public class Prog3 
{
 public static void main(String args[])throws IOException
 {
  int Nman,Desc,Pmanzanas,Pmanzana,Ptotal;
  Nman=0;Desc=0;Pmanzanas=0;Pmanzana=500;Ptotal=0;
  String valor;
  BufferedReader Entrada=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("|---------------------------------------------|\nNúmero de manzanas que comprará:");
  valor=Entrada.readLine();
  Nman=Integer.parseInt(valor);
  if(Nman<3)
  {
   Ptotal=Nman*Pmanzana;
   System.out.println("|---------------------------------------------|\nValor de las manzanas con descuento del 0%:"+" "+Ptotal+"\n|---------------------------------------------|");
  }   
  else
  {
   if((Nman>2)&&(Nman<6))
   {
    Pmanzanas=Pmanzana*Nman;   
    Desc=(10*Pmanzanas)/100;
    Ptotal=Pmanzanas-Desc;
    System.out.println("|---------------------------------------------|\nValor de las manzanas con descuento del 10%:"+" "+Ptotal+"\n|---------------------------------------------|");
   }   
   else
   {
    if((Nman>5)&&(Nman<11))
    {
     Pmanzanas=Pmanzana*Nman;   
     Desc=(15*Pmanzanas)/100;
     Ptotal=Pmanzanas-Desc;
     System.out.println("|---------------------------------------------|\nValor de las manzanas con descuento del 15%:"+" "+Ptotal+"\n|---------------------------------------------|");   
    }
    else
    {
     if(Nman>10)
     {
      Pmanzanas=Pmanzana*Nman;   
      Desc=(20*Pmanzanas)/100;
      Ptotal=Pmanzanas-Desc;
      System.out.println("|---------------------------------------------|\nValor de las manzanas con descuento del 20%:"+" "+Ptotal+"\n|---------------------------------------------|");   
     } 
     else
      System.exit(0);
    }   
   }           
  }   
 }        
}
