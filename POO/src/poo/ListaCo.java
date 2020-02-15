package poo;
import java.io.*;

public class ListaCo 
{                                                    
 static int nume,nums,numto;
 static ListaCo ListaCon;
 public static void main(String Args[])throws IOException
 {
  Leer L=new Leer();
  ListaCon=new ListaCo();
  System.out.println("Dígite el número:");
  nume=Integer.parseInt(L.LeerDatos());
  System.out.println("_____________________");
  if(nume>=3)
  {
   for(nums=3;nums<=nume;nums+=3)  
   {
    System.out.println(nums);
   }    
  }
  else
  System.out.println("ERROR: el número debe ser mayor a 3");    
 } 
 public ListaCo()
 {
  nume=0;
  nums=0;
  numto=0;
 }  
}
