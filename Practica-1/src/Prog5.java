import java.io.*;
public class Prog5 
{
public static void main(String args[])  
 {
  int a,b,c,d;
  a=0;b=0;c=-5;d=0;
  while(a<10)
  {
   for(b=1;b<10;b++)
   {
    a++;
    a=a*a*a;
    b=b*b;
    d=a+b+c;
    System.out.println("f"+"(x)"+"="+a+"+"+b+c+"+"+"="+d);
   }
  }
 }
}