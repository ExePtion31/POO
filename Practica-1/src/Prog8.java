import java.io.*;
public class Prog8 
{
 public static void main(String args[])throws IOException
 {       
  int a,n,x;
  a=0;n=0;x=0;
  String valor;
  BufferedReader Entrada=new BufferedReader(new InputStreamReader(System.in));
  
  System.out.println("Digite un número mayor que 0");
  valor=Entrada.readLine();
  n=Integer.parseInt(valor);
  if(n>=0)
      
  System.out.println("Digite un número mayor al que acaba de digitar");
  valor=Entrada.readLine();
  x=Integer.parseInt(valor);
  if(x>=0)    
  for(a=n;a<=x;a++)
  {   
   System.out.println(""+a+"");
  }
  else        
  {
   System.out.println("Hagalo bien pendejo >;v");
  } 
 }
} 