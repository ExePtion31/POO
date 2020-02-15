package poo;
import java.io.*;

public class Mayor 
{
 static int a,b,c,mayor,resulM,menor,resulMe,mitad,resulMi;
 static Mayor Mayorcito;
 public static void main(String[] args) throws IOException
 {
  Leer L =new Leer();
  Mayorcito= new Mayor();
        
  System.out.println("Digite el primer valor:");
  a=Integer.parseInt(L.LeerDatos());
        
  System.out.println("Digite el seguundo valor:");
  b=Integer.parseInt(L.LeerDatos());
        
  System.out.println("Digite el tercer valor:");
  c=Integer.parseInt(L.LeerDatos());
        
  if((a==b)||(a==c)||(b==c))
   System.out.println("Los numeros son iguales.");
  else
  {
   mayor=Mayorcito.NumMayor(a,b,c);
   menor=Mayorcito.NumMenor(a,b,c);
   mitad=Mayorcito.NumMitad(a,b,c);
   System.out.println("El valor mayor es: "+ mayor+"\nEl valor de la mitad es: "+mitad+"\nEl valor menor es: "+menor);
  }
 }
 public Mayor()
 {
  a=0;
  b=0;
  c=0;
  mayor=0;
  resulM=0;
  menor=0;
  resulMe=0;
  mitad=0;
  resulMi=0;
 }
 
 public int NumMayor(int x,int y,int z)
 {
  if((x>y)&&(x>z))
   resulM=x;
  else
  {
   if(y>z)
    resulM=y;
   else
    resulM=z;
  }
  return resulM;
 }
 
 public int NumMenor(int f,int g, int h)
 {
  if((f<g)&&(f<h))
   resulMe=f;
  else
  {
   if(g<h)
    resulMe=g;
   else
    resulMe=h;
  }
  return resulMe;   
 }
 
 public int NumMitad(int q,int w,int e)
 {
  if(((q<w)&&(q>e))||((q>w)&&(q<e)))
   resulMi=q;
  else
  {
   if(((w<q)&&(w>e))||((w>q)&&(w<e))) 
    resulMi=w;
   else
   {
    if(((e<q)&&(e>w))||((e>q)&&(e<w)))   
     resulMi=e;   
   }    
  }    
  return resulMi;   
 }
}
