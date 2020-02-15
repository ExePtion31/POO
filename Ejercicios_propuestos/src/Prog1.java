import java.io.*;
public class Prog1 
{
 public static void main(String args[])throws IOException
 {
  int cantidade,valore,totale,descuentoe,cantidade2;
  cantidade=0;valore=800000;totale=0;descuentoe=0;cantidade2=0;
  String valor;
  BufferedReader Entrada=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Cantidad de escritorios que comprará:");
  valor=Entrada.readLine();
  cantidade=Integer.parseInt(valor);
  if(cantidade<5)
  {
   cantidade2=cantidade*valore;
   descuentoe=(10*cantidade2)/100;
   totale=cantidade2-descuentoe;
   System.out.println("Valor a pagar con el 10%:"+" "+totale);
  } 
  else
  {
   if((cantidade>=5)&&(cantidade<10))
   {
    cantidade2=cantidade*valore;
    descuentoe=(20*cantidade2)/100;
    totale=cantidade2-descuentoe;
    System.out.println("Valor a pagar con el 20%:"+" "+totale);   
   } 
   else
   {
    if(cantidade>10)
    {
     cantidade2=cantidade*valore;
     descuentoe=(40*cantidade2)/100;
     totale=cantidade2-descuentoe;
     System.out.println("Valor a pagar con el 40%:"+" "+totale);   
    } 
    else
     ;  
   }    
  }   
 }       
}
