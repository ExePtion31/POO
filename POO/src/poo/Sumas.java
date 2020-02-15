package poo;
import java.io.*;

public class Sumas 
{
 static int n,r,s;
 static Sumas Sumita;
 public static void main(String Args[])
 {
  Sumita=new Sumas();
  while(r<100)
  {
   r=Sumita.Incremento();
   System.out.println(r);
  } 
  System.out.println(Sumita.total());
 }
 public Sumas()
 {
  r=0;
  n=0;
  s=0;
 }
 public int Incremento()
 {
  n++;
  s=s+n;
  return n;
 }
 public int total()
 {
  return s;
 }        
}
