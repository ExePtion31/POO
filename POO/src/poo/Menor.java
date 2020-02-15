package poo;
import java.io.*;

public class Menor 
{
 static int a,b,c,r,resul;
 static Menor Menorcito;
 public static void main(String Args[])throws IOException
 {
  Leer L=new Leer();
  Menorcito=new Menor();
  
  System.out.println("digite el primer valor");
        a=Integer.parseInt(L.LeerDatos());
        
        System.out.println("digite el seguundo valor");
        b=Integer.parseInt(L.LeerDatos());
        
        System.out.println("digite el tercer valor");
        c=Integer.parseInt(L.LeerDatos());
        
        if((a==b)||(a==c)||(b==c))
            System.out.println("los numeros son iguales");
        else
        {
            r=Menorcito.Proceso(a,b,c);
            System.out.println("el valor mayor es:"+ r);
        }
    }
    public Menor()
    {
        a=0;
        b=0;
        c=0;
        r=0;
        resul=0;
    }
    public int Proceso(int x,int y,int z)
    {
        if((x<y)&&(x<z))
            resul=x;
        else
        {
            if(y<z)
                resul=y;
            else
                resul=z;
        }
        return resul;
    }
 }

