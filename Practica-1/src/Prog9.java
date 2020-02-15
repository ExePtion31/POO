import java.io.*;
public class Prog9 
{
 public static void main(String args[])throws IOException
 {
  int a,b,c;
  a=0;b=0;c=0;
  String valor;
  BufferedReader Entrada=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Digite primer valor:");
  valor=Entrada.readLine();
  a=Integer.parseInt(valor);
  System.out.println("Digite segundo valor:");
  valor=Entrada.readLine();
  b=Integer.parseInt(valor);
  System.out.println("Digite tercer valor:");
  valor=Entrada.readLine();
  c=Integer.parseInt(valor);
  System.out.println("---------------------------\nRespuestas:");
  
   
  ///////////////////Nùmero Mayor//////////////////
  if(a>b)
  {
   if(a>c)
     System.out.println("Número mayor:"+" "+a);
   else
     System.out.println("Número mayor:"+" "+c);
  }
  else
  {
   if(b>c)
    System.out.println("Número mayor:"+" "+b);  
   else
    System.out.println("Número mayor:"+" "+c);
  }
  
  ///////////////////Nùmero medio////////////////
 if((a>b)&&(a<c)||(a<b)&&(a>c)) 
  System.out.println("Número medio:"+" "+a);
 else
  {   
   if((b>a)&&(b<c)||(b<a)&&(b>c))
    System.out.println("Número medio:"+" "+b); 
   else
    {
     if((c>a)&&(c<b)||(c<a)&&(c>b))
      System.out.println("Número medio:"+" "+c);
     else
      ;
    }
  }
 
  //////////////////////Nùmero menor///////////////////
  if(a<b)
  {
   if(a<c)
     System.out.println("Número menor:"+" "+a);
   else
     System.out.println("Número menor:"+" "+c);
  }
  else
  {
   if(b<c)
    System.out.println("Nùmero menor:"+" "+b);  
   else
    System.out.println("Nùmero menor:"+" "+c);
  }
  
     
  //////////////////Suma//////////////////
  a=a+b;
  b=a+c;
  System.out.println("Suma:"+" "+b);
  
 }
}

     
       
      
     
  

 
           
     
      
 

   
  
  

