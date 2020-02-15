package Parcial;
import java.io.*;

public class Principal 
{
 static int valor1,valor2,valor3,valor4,mayor,menor,primo,factorial;
 static Principal Principalito;
 public static void main(String Args[])throws IOException
 {
  Leer L=new Leer();
  Principalito= new Principal();
  Mayor Mayorsito=new Mayor();
  Menor Menorsito=new Menor();
  Primo Primito=new Primo();
  Factorial Factorialsito=new Factorial();
  
          
  System.out.println("Dígite el primer valor: ");
  valor1=Integer.parseInt(L.LeerDatos());
  System.out.println("Dígite el segundo valor: ");
  valor2=Integer.parseInt(L.LeerDatos());
  System.out.println("Dígite el tercer valor: ");
  valor3=Integer.parseInt(L.LeerDatos());
  System.out.println("Dígite el cuarto valor: ");
  valor4=Integer.parseInt(L.LeerDatos());
  
  mayor=Mayorsito.Mayor(valor1,valor2);
  System.out.println("____________________________________________\nEl número mayor entre el primer y segundo valor es: "+mayor);
  primo=Primito.Primo(mayor);
  if(primo<=2)
   System.out.println("El número es primo");
  else
   System.out.println("El número no es primo");   
  
  
  
  menor=Menorsito.Menor(valor3, valor4);
  factorial=Factorialsito.Factorial(menor);
  System.out.println("____________________________________________\nEl número menor entre el tercer y cuarto valor es: "+menor);
  System.out.println("Factorial: "+factorial);
  
 }        
}
