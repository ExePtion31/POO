package POO2;
import java.io.*;
public class Main 
{    
 static  int a,b,c,e,f,g,p,k,m,ñ;
 static Main mayorcito;
 public static void main(String[] args) throws IOException
 {
  Mayor Mayorcito= new Mayor();
  Menor Menorcito=new Menor();
  Mitad Mitadsita=new Mitad();
  Leer L= new Leer();
  mayorcito = new Main();
      
  System.out.println("Digite el primer valor:");
  a=Integer.parseInt(L.LeerDatos());
  System.out.println("Digite el segundo valor:");
  b=Integer.parseInt(L.LeerDatos());
  System.out.println("Digite el tercero valor:");
  c=Integer.parseInt(L.LeerDatos());
  if ((a==b) || (c==a) || (b==c))
  {
   System.out.println("Los numeros digitados son iguales");
  }
  else
  {
   p=Mayorcito.res(a,b, c);
   k=Menorcito.res2(a, b, c);
   m=Mitadsita.res3(a, b, c);
   System.out.println("El numero menor es: "+k);
   System.out.println("El numero de la mitad es: "+m);
   System.out.println("El numero mayor es: "+p);
  }                        
 }
}


