import java.io.*;
public class Prog7 
{
 public static void main(String args[])  
 {
  int a,b,c;
  a=4;b=0;c=0;
  do
  {
   b++;
   c=a*b;
   System.out.println(a+"x"+b+"="+c);
  }while(b<10);    
 }
}