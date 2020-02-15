import java.io.*;
public class Prog7 
{
 public static void main(String args[])throws IOException
 {
  double rfinal,r1,r2,r3,r4;
  rfinal=0;r1=0;r2=0;r3=0;r4=0;
  int numa,numb,numc;
  numa=0;numb=0;numc=0;
  String valor;
  BufferedReader Entrada=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Dígite el valor A");
  valor=Entrada.readLine();
  numa=Integer.parseInt(valor);
  System.out.println("Dígite el valor B");
  valor=Entrada.readLine();
  numb=Integer.parseInt(valor);
  System.out.println("Dígite el valor C");
  valor=Entrada.readLine();
  numc=Integer.parseInt(valor);
  System.out.println("_____________________________");
  
  //////////////////Procedimiento Positivo/////////////////////////
  
  r1=(numb*numb)-(4*numa*numc);
  double raiz=Math.sqrt(r1);
  r3=(-numb)+raiz;
  r4=2*numa;
  rfinal=r3/r4;
  System.out.println("Formula:"+" "+"-"+numb+"+"+"√"+numb+"^2"+"-"+"4"+"*"+numa+"*"+numc+"/"+"2"+"*"+numa+"\nRespuesta:"+rfinal);
 
  r1=0;
  raiz=0;
  r3=0;
  r4=0;
  rfinal=0;
  System.out.println("___________________________");
  
  //////////////////Procedimiento negativo/////////////////////////
  
  r1=(numb*numb)-(4*numa*numc);
  double raiz1=Math.sqrt(r1);
  r3=(-numb)-raiz1;
  r4=2*numa;
  rfinal=r3/r4;
  System.out.println("Formula:"+" "+"-"+numb+"-"+"√"+numb+"^2"+"-"+"4"+"*"+numa+"*"+numc+"/"+"2"+"*"+numa+"\nRespuesta:"+rfinal); 
 }        
}
