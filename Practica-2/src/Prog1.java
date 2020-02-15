import java.io.*;
public class Prog1 
{
 public static void main(String args[])throws IOException
 {
  String valor,suma,resta,mult,div,resp;
  suma="suma";resta="resta";mult="Multiplicacion";div="Division";
  double div1,valor1,valor2,res;
  BufferedReader Entrada=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("___________________________\nDigite el primer número");
  valor=Entrada.readLine();
  valor1=Double.parseDouble(valor); 
  System.out.println("___________________________\nDigite el segundo valor");
  valor=Entrada.readLine();
  valor2=Double.parseDouble(valor); 
  System.out.println("___________________________\n¿Que operacion desea realizar?");
  resp=Entrada.readLine();
  
  ////////////////////////////Procesos///////////////////////
  if(resp.equalsIgnoreCase(suma))
  {
   res=valor1+valor2;
   System.out.println("___________________________\n"+valor1+" "+"+"+" "+valor2+"\nResultado="+" "+res+"\n___________________________");
  }
  else
  {
   if(resp.equalsIgnoreCase(resta))
   {
    res=valor1-valor2;
    System.out.println("___________________________\n"+valor1+" "+"-"+" "+valor2+"\nResultado="+" "+res+"\n___________________________");
   }
   else
   {
    if(resp.equalsIgnoreCase(mult))
    {
     res=valor1*valor2;
     System.out.println("___________________________\n"+valor1+" "+"*"+" "+valor2+"\nResultado="+" "+res+"\n___________________________");   
    }
    else
    {
     if(resp.equalsIgnoreCase(div))   
     {  
      div1=valor1/valor2;
      System.out.println("___________________________\n"+valor1+" "+"/"+" "+valor2+"\nResultado="+" "+div1+"\n___________________________");   
     }    
    }    
   }    
  }    
 }        
}
