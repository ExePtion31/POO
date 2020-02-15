package Eje60;
import java.io.*;

public class Principal 
{
 static int codigop,nhijos;
 static double totalpag,retencionp,devengadop,salarioh,horast,subsidiop;
 static String nombrep,apellidop;
 static Principal Principalito;
 public static void main(String Args[])throws IOException
 {
  Leer L=new Leer();
  Subsidio Sub=new Subsidio();
  Devengado Dev=new Devengado();
  TotalPa Tot=new TotalPa();
  Retencion Ret=new Retencion();
  Principalito=new Principal();
     
  /////////////////////////////////////////////////////////////////////////   
  System.out.println("____________________________________\nPor favor, digite su código: ");
  codigop=Integer.parseInt(L.LeerDatos());
  System.out.println("Por favor, digite su nombre: ");
  nombrep=(L.LeerDatos());
  System.out.println("Por favor, digite su apellido: ");
  apellidop=(L.LeerDatos());   
  System.out.println("Por favor, digite el numero de hijos: ");
  nhijos=Integer.parseInt(L.LeerDatos());
  System.out.println("Por favor, digite su salario por hora: ");
  salarioh=Integer.parseInt(L.LeerDatos());
  System.out.println("Por favor, digite el número de horas trabajadas al mes: ");
  horast=Integer.parseInt(L.LeerDatos());
  
  ///////////////////////////////////////////////////////////////////////////
  devengadop=Dev.Devengado(salarioh,horast);
  retencionp=Ret.Retencion(devengadop,nhijos);
  subsidiop=Sub.Subsidio(nhijos);
  totalpag=Tot.TotalPa(retencionp,devengadop);
  
  System.out.println("____________________________________\nCódigo: "+codigop+"\nNombre completo: "+nombrep+" "+apellidop+"\nDevengado: "+devengadop+"\nRetencion: "+retencionp+"%"+"\nSubsidio: "+subsidiop+"\nTotal a pagar: "+totalpag+"\n____________________________________");
 }        
}
