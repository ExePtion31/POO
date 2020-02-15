package POO2;
import java.io.*;

public class Mitad {
static int m;
public int res3(int x,int y,int z )
{
 if(x<y && x>z)
  m=x;
 else
 {
  if (y<z && y>x)
   m=y;   
  else
   m=z;
  }
  return m;
 }
}
