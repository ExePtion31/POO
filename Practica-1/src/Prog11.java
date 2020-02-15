import java.io.*;
public class Prog11 
{
 public static void main(String args[])throws IOException
 {
  int a,b,c,r,n;
  a=0;b=0;c=0;r=0;n=0;
  String valor;
  BufferedReader Entrada = new BufferedReader (new InputStreamReader(System.in));
  System.out.println("Digite primer valor:");
  valor=Entrada.readLine();
  a=Integer.parseInt(valor);
  System.out.println("Digite segundo valor:");
  valor=Entrada.readLine();
  b=Integer.parseInt(valor);
  System.out.println("Digite tercer valor:");
  valor=Entrada.readLine();
  c=Integer.parseInt(valor);
  
  ///////////////Número mayor////////////////////
  if((a==b)||(a==c)||(b==c))
   System.out.println("¡¡ERROR!!"); 
  else
   {   
    if((a>b)&&(a>c)) /////////Primer valor//////////
    {
     System.out.println("|------------------------|");   
     System.out.println("El número mayor es:"+" "+a);
     while(n<a)
     {
      n++;
      r=n%2;
      if(r==0)
       System.out.println(n+" "+"El número es par");
      else
       System.out.println(n+" "+"El número es impar");
     }
     System.out.println("|------------------------|");
    } 
    else
    {
     if((b>a)&&(b>c)) /////Segundo valor/////
     {
      System.out.println("|------------------------|");   
      System.out.println("El número mayor es:"+" "+b);
      while(n<b)
      {
       n++;
       r=n%2;
       if(r==0)
        System.out.println(n+" "+"El número es par");
       else
        System.out.println(n+" "+"El número es impar");        
      }
      System.out.println("|------------------------|");
     } 
     else
     {
      if((c>a)&&(c>b)) /////Tercer valor///////
      {
       System.out.println("|------------------------|");   
       System.out.println("El número mayor es:"+" "+c);
       while(n<c)
       {
        n++;
        r=n%2;
        if(r==0)
         System.out.println(n+" "+"El número es par");
        else
         System.out.println(n+" "+"El número es impar");   
       }
       System.out.println("|------------------------|");
      }
      else
       ;   
     }   
    }
   }
  
  n=0;
  r=0;
 ///////////////////////Número mitad////////////////////
 
  if((a>b)&&(a<c)||(a<b)&&(a>c)) /////////Primer valor//////////
    {
     System.out.println("El número del medio es:"+" "+a);
     while(n<a)
     {
      n++;
      r=n%2;
      if(r==0)
       System.out.println(n+" "+"El número es par");
      else
       System.out.println(n+" "+"El número es impar");
     } 
     System.out.println("|------------------------|");
    } 
    else
    {
     if((b>a)&&(b<c)||(b<a)&&(b>c)) /////Segundo valor/////
     {
      System.out.println("El número del medio es:"+" "+b);
      while(n<b)
      {
       n++;
       r=n%2;
       if(r==0)
        System.out.println(n+" "+"El número es par");
       else
        System.out.println(n+" "+"El número es impar");        
      }
      System.out.println("|------------------------|");
     } 
     else
     {
      if((c>a)&&(c<b)||(c<a)&&(c>b)) /////Tercer valor///////
      {
       System.out.println("El número del medio es:"+" "+c);
       while(n<c)
       {
        n++;
        r=n%2;
        if(r==0)
         System.out.println(n+" "+"El número es par");
        else
         System.out.println(n+" "+"El número es impar");   
       }
       System.out.println("|------------------------|");
      }
      else
       ;   
     }
    }
  
  n=0;
  r=0;
  ///////////////////////Número menor////////////////////
 
  if((a<b)&&(a<c)) /////////Primer valor//////////
    {
     System.out.println("El número menor es:"+" "+a);
     while(n<a)
     {
      n++;
      r=n%2;
      if(r==0)
       System.out.println(n+" "+"El número es par");
      else
       System.out.println(n+" "+"El número es impar");
     }
     System.out.println("|------------------------|");
    } 
    else
    {
     if((b<a)&&(b<c)) /////Segundo valor/////
     {
      System.out.println("El número menor es:"+" "+b);
      while(n<b)
      {
       n++;
       r=n%2;
       if(r==0)
        System.out.println(n+" "+"El número es par");
       else
        System.out.println(n+" "+"El número es impar");        
       }  
       System.out.println("|------------------------|");
      } 
     else
     {
      if((c<a)&&(c<b)) /////Tercer valor///////
      {
       System.out.println("El número menor es:"+" "+c);
       while(n<c)
       {
        n++;
        r=n%2;
        if(r==0)
         System.out.println(n+" "+"El número es par");
        else
         System.out.println(n+" "+"El número es impar");   
       } 
       System.out.println("|------------------------|");
      }
      else
       ;   
     }
    }
   }        
  }
 

