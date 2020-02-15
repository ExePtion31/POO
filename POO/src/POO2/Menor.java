package POO2;
import java.io.*;

public class Menor 
{
 static int k;
 public int res2(int u,int i,int o )
 {
  if(u<i && u<o)
   k=u;
  else
  {
   if (i<o && i<u)
    k=i;   
   else
    k=o;
   }
  return k;                
 }
}
