package Eje69;
import java.io.*;

public class Principal 
{
 static int nestudiantes,a=1,b,codigoe;
 static double porcentaje,nota1,nota2,nota3,nota4,total1,total2,total3,total4,definitiva;
 public static void main(String Args[])throws IOException
 {
  Leer L=new Leer();
  Notas Not=new Notas();
  
  //////////////////////////////////////////////////////////////////
  System.out.println("¡OJO!La nota definitiva va de 1 a 5\n¿Cuantos estudiantes hay en el curso?: ");
  nestudiantes=Integer.parseInt(L.LeerDatos());
  
  while(a<=nestudiantes)
  {
   b++;   
   System.out.println("_____________________________________\nEstudiante #"+b+"\nDigite la primera nota(25%)(1.25Max):");
   nota1=Double.parseDouble(L.LeerDatos());
   System.out.println("Digite la segunda nota(20%)(1.0Max): ");
   nota2=Double.parseDouble(L.LeerDatos());
   System.out.println("Digite la tercera nota(25%)(1.25Max): ");
   nota3=Double.parseDouble(L.LeerDatos());
   System.out.println("Digite la cuarta nota(30%)(1.5Max): ");
   nota4=Double.parseDouble(L.LeerDatos());
   total1=Not.Total1(nota1);
   total2=Not.Total2(nota2);
   total3=Not.Total3(nota3);
   total4=Not.Total4(nota4);
   porcentaje=total1+total2+total3+total4;
   definitiva=nota1+nota2+nota3+nota4;
   System.out.println("___________\nCodigo: "+b+"\nNota 1: "+total1+"%"+"\nNota 2: "+total2+"%"+"\nNota 3: "+total3+"%"+"\nNota 4: "+total4+"%"+"\nDefinitiva: "+definitiva+"\nPorcentaje total: "+porcentaje+"%");
   
   nota1=0;
   nota2=0;
   nota3=0;
   nota4=0;
   total1=0;
   total2=0;
   total3=0;
   total4=0;
   definitiva=0;
   a++;
  }
 }
}
