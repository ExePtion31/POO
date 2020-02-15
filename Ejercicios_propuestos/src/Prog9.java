import java.io.*;
public class Prog9 
{
 public static void main(String args[])throws IOException
 {
  int nume,a,b,c,d,ncre,desc,descto;
  nume=0;a=0;b=0;c=0;d=0;
  double notae;
  notae=0;
  String pre,pos,valor,gradoe,carrerae,tele,soft,meca,nombree;
  pre="Pregrado";pos="Posgrado";tele="Telecomunicaciones";soft="Software";meca="Mecatronica";
  BufferedReader Entrada=new BufferedReader(new InputStreamReader(System.in));
  
  //////////////////////Codigo/////////////////////////
  System.out.println("________________________\nDígite el número de estudiantes:");
  valor=Entrada.readLine();
  nume=Integer.parseInt(valor);
  System.out.println("________________________");
  
  ///////////////////Promedios////////////////////////
  while((a<nume)&&(b<nume)&&(c<nume))
  {
   d++;
   System.out.println("¿Nombre del estudiante"+" "+d+"?");
   nombree=Entrada.readLine();   
   a++;
   System.out.println("Dígite el promedio del estudiante"+" "+nombree+":");
   valor=Entrada.readLine();
   notae=Double.parseDouble(valor);
   System.out.println("________________________");
   b++;
   System.out.println("¿El estudiante"+" "+nombree+" "+"es de Pregrado o Posgrado?:");
   gradoe=Entrada.readLine();
   System.out.println("________________________");
   c++;
   System.out.println("¿De que carrera es el estudiante"+" "+nombree+"?");
   carrerae=Entrada.readLine();
   System.out.println("________________________");
   if((notae>=4.5)&&(gradoe.equalsIgnoreCase(pre))&&((carrerae.equalsIgnoreCase(soft))||(carrerae.equalsIgnoreCase(tele))))
   {
    ncre=28*50000;
    desc=(25*ncre)/100;
    descto=ncre-desc;
    System.out.println("Nombre del estudiante:"+" "+nombree+"\nPromedio:"+" "+notae+"\n¿Pregrado o Posgrado?:"+" "+gradoe+"\nCarrera:"+" "+carrerae+"\nNúmero de credito obtenidos: 28"+"\nTotal a pagar con el 25% de descuento:"+" "+descto+"\n________________________");
   } 
   else
   {
    if((notae>=4.0)&&(notae<4.5)&&(gradoe.equalsIgnoreCase(pre))&&(carrerae.equalsIgnoreCase(meca))) 
    {
     ncre=25*50000;
     desc=(10*ncre)/100;
     descto=ncre-desc;
     System.out.println("Nombre del estudiante:"+" "+nombree+"\nPromedio:"+" "+notae+"\n¿Pregrado o Posgrado?:"+" "+gradoe+"\nCarrera:"+" "+carrerae+"\nNúmero de credito obtenidos: 25"+"\nTotal a pagar con el 10% de descuento:"+" "+descto+"\n________________________");
    }
    else
    {
     if((notae>3.5)&&(notae<4.0)&&(gradoe.equalsIgnoreCase(pre))&&((carrerae.equalsIgnoreCase(tele))||(carrerae.equalsIgnoreCase(meca))))
     {
      ncre=20*50000;
      System.out.println("Nombre del estudiante:"+" "+nombree+"\nPromedio:"+" "+notae+"\n¿Pregrado o Posgrado?:"+" "+gradoe+"\nCarrera:"+" "+carrerae+"\nNúmero de credito obtenidos: 20"+"\nTotal a pagar con el 0% de descuento:"+" "+ncre+"\n________________________");
     }
     else
     {
      if((notae>=2.5)&&(notae>3.0)&&(gradoe.equalsIgnoreCase(pre))&&(carrerae.equalsIgnoreCase(soft)))
      {
       ncre=15*500000;
       System.out.println("Nombre del estudiante:"+" "+nombree+"\nPromedio:"+" "+notae+"\n¿Pregrado o Posgrado?:"+" "+gradoe+"\nCarrera:"+" "+carrerae+"\nNúmero de credito obtenidos: 15"+"\nTotal a pagar con el 0% de descuento:"+" "+ncre+"\n________________________");
      }
      else
      {
       if((notae<2.5)&&(gradoe.equalsIgnoreCase(pre)))
        System.out.println("Lo sentimos, pero no podrá matricularse\n________________________");
       else
       {
        if((notae>=4.5)&&(gradoe.equalsIgnoreCase(pos))&&((carrerae.equalsIgnoreCase(soft))||(carrerae.equalsIgnoreCase(tele))))  
        {
         ncre=20*300000;
         desc=(20*ncre)/100;
         descto=ncre-desc;
         System.out.println("Nombre del estudiante:"+" "+nombree+"\nPromedio:"+" "+notae+"\n¿Pregrado o Posgrado?:"+" "+gradoe+"\nCarrera:"+" "+carrerae+"\nNúmero de credito obtenidos: 20"+"\nTotal a pagar con el 20% de descuento:"+" "+descto+"\n________________________");
        }
        else
        {
         if((notae<4.5)&&(gradoe.equalsIgnoreCase(pos)))
         {
          ncre=10*300000;
          System.out.println("Nombre del estudiante:"+" "+nombree+"\nPromedio:"+" "+notae+"\n¿Pregrado o Posgrado?:"+" "+gradoe+"\nCarrera:"+" "+carrerae+"\nNúmero de credito obtenidos: 10"+"\nTotal a pagar con el 0% de descuento:"+" "+ncre+"\n________________________");
         } 
         else
          System.out.println("Lo sentimos, pero no podrá matricularse\n________________________");
        }    
       }   
      }    
     }    
    }    
   }
  }   
 }        
}
