import java.io.*;
public class Prog8 
{
 public static void main(String args[])throws IOException
 {
  int valor1,valor2,valor3,valor4,suma,mayor,menor;
  valor1=0;valor2=0;valor3=0;valor4=0;suma=0;mayor=0;menor=0;
  String valor;
  BufferedReader Entrada=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Digite primer valor");
  valor=Entrada.readLine();
  valor1=Integer.parseInt(valor);
  System.out.println("Digite segundo valor");
  valor=Entrada.readLine();
  valor2=Integer.parseInt(valor);
  System.out.println("Digite tercer valor");
  valor=Entrada.readLine();
  valor3=Integer.parseInt(valor);
  System.out.println("Digite cuarto valor");
  valor=Entrada.readLine();
  valor4=Integer.parseInt(valor);
  
  
  /////////////////validación///////////////
  if((valor1==valor2)||(valor1==valor3)||(valor1==valor4)||(valor2==valor1)||(valor2==valor3)||(valor2==valor4)||(valor3==valor1)||(valor3==valor2)||(valor3==valor4)||(valor4==valor1)&&(valor4==valor2)||(valor4==valor3))
  {
   System.out.println("¡ERROR!, dígite valores diferentes en cada casilla");
   System.exit(0);
  }    
  
  
  ////////////////////////Mayor////////////////
  if((valor1>valor2)&&(valor1>valor3)&&(valor1>valor4))
  {   
   System.out.println("Número mayor:"+" "+valor1);
   mayor=valor1;
  } 
  else
  {
   if((valor2>valor1)&&(valor2>valor3)&&(valor2>valor4))
   {   
    System.out.println("Número mayor:"+" "+valor2);
    mayor=valor2;
   }
   else
   {
    if((valor3>valor1)&&(valor3>valor2)&&(valor3>valor4))
    {  
     System.out.println("Número mayor:"+" "+valor3); 
     mayor=valor3; 
    }
    else
    {
     if((valor4>valor1)&&(valor4>valor2)&&(valor4>valor3)) 
     {  
      System.out.println("Número mayor:"+" "+valor4); 
      mayor=valor4;
     }    
    }
   }    
  }
  
  
  /////////////////////Menor//////////////////////
  if((valor1<valor2)&&(valor1<valor3)&&(valor1<valor4))
  {     
   System.out.println("Número menor:"+" "+valor1);
   menor=valor1; 
  } 
  else
  {
   if((valor2<valor1)&&(valor2<valor3)&&(valor2<valor4))
   {    
    System.out.println("Número menor:"+" "+valor2);
    menor=valor2; 
   }
   else
   {
    if((valor3<valor1)&&(valor3<valor2)&&(valor3<valor4))
    {  
     System.out.println("Número menor:"+" "+valor3);
     menor=valor3;
    }
    else
    {
     if((valor4<valor1)&&(valor4<valor2)&&(valor4<valor3)) 
     {    
      System.out.println("Número menor:"+" "+valor4);
      menor=valor4;
     }    
    }
   }    
  }
  
  //////////////////////Suma////////////////////////
  suma=mayor+menor;
  System.out.println("Suma:"+" "+suma);
 }
} 
  
