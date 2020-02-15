package Eje63;
import java.io.*;

public class Principal 
{
 static int a=1,b,c,fueramedellin,registroc,totalfmedellin; 
 static double porcmasentre,porctotalmasc,conmas,numcondmas,pormeno25,naccidentes,añona,conmeno25,Conmenor25,sexoc,Confem,confem,porconfem;
 public static void main(String Args[])throws IOException
 {
  Leer L=new Leer();
  SexoMasc CMas=new SexoMasc();
  PorcMasc PMasc=new PorcMasc();
  PorcConFem PConFem=new PorcConFem();
  SexoFemen SFem=new SexoFemen();
  FueraMedellin FMe=new FueraMedellin();
  PorcMenor25 PMen25=new PorcMenor25();
  Menores25 Men25=new Menores25();
  //////////////////////////////////////////////////
  
  System.out.println("¿Cuantos accidentes se reportaron en el ultimo año?: ");
  naccidentes=Double.parseDouble(L.LeerDatos());
  
  while(a<=naccidentes)
  {
   b++;
   System.out.println("_________________\nConductor #"+b+"\nAño de nacimiento: ");
   añona=Double.parseDouble(L.LeerDatos());
   System.out.println("Sexo del conductor:\n1-Femenino\n2-Masculino ");
   sexoc=Double.parseDouble(L.LeerDatos());
   System.out.println("Registro del vehiculo:\n1-Medellin\n2-Otras Ciudades ");
   registroc=Integer.parseInt(L.LeerDatos());
   conmeno25=Men25.Menores25(añona);
   confem=SFem.SexoFem(sexoc);
   conmas=CMas.ConMasc(sexoc);
   if(añona>=1988&&añona<=2006&&sexoc==2)
    c++;
   fueramedellin=FMe.FueraMedellin(registroc);
   
   a++;
  }
  
  //////Porcentaje conductores menores a 25//////////////////////
  Conmenor25=conmeno25+0;
  pormeno25=PMen25.PorMenor25(Conmenor25,naccidentes);
  
  
  
  ////////////////Porcentaje conductoras del sexo femenino//////////////////
  Confem=confem+0;
  porconfem=PConFem.PorConFem(Confem,naccidentes);
  
  
  
  /////////////////Porcentaje conductores masculinos entre 12 y 30 años//////////////////
  numcondmas=conmas+0;
  porcmasentre=c+0; 
  porctotalmasc=PMasc.PorcMasc(porcmasentre,naccidentes);
  
  
  
  ////////////////Vehiculos registrados fuera de Medellin/////////////////////////////
  totalfmedellin=fueramedellin+0;
  
  
  System.out.println("_____________________________________\nPorcentaje de conductores menores de 25 años: "+pormeno25+"%"+"\nPorcentaje de conductores del sexo femenino: "+porconfem+"%"+"\nPorcentaje de conductores masculinos entre los 12 y 30 años: "+porctotalmasc+"%"+"\nVehiculos registrados fuera de Medellin: "+totalfmedellin);
 }        
}
