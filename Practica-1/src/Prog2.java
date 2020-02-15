import java.io.*;
public class Prog2 
{
public static void main(String args[])    
 {
 int a,b,c;
 a=4;b=0;c=0;
 while(a<7)
  {
  do
   {      
   b++;
   c=a*b;
   System.out.println(""+a+"x"+b+"="+c);
   }while(b<10);
 a++;
 b=0;
 c=0;
  }    
 }
}
