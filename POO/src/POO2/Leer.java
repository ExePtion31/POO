package POO2;
import java.io.*;

public class Leer 
{
    public String LeerDatos()throws IOException
    {
        BufferedReader a;
        InputStreamReader b;
        String c;
        b=new InputStreamReader(System.in);
        a=new BufferedReader(b);
        c=a.readLine();
        return c;
    }      
}