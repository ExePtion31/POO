package poo;
import java.io.*;

public class ListaCo2 
{                                                    
 static int nume,nums,numto,n;
 static ListaCo2 ListaCon;
 public static void main(String Args[])throws IOException
 {
  Leer L=new Leer();
  ListaCon=new ListaCo2();
  System.out.println("Dígite el número:");
  nume=Integer.parseInt(L.LeerDatos());
  System.out.println("_____________________");
  
  if(nume>=3)
  {
   nums=ListaCon.proceso();   
   while(nums<=nume)
   {
    System.out.println(nums); 
   }    
  }
  else
  System.out.println("ERROR: el número debe ser mayor a 3");    
 } 
 public ListaCo2()
 {
  nume=0;
  nums=0;
  numto=0;
 }  
 public int proceso()
 {
  n++;   
  numto=n+3;
  return numto;
 }        
}
