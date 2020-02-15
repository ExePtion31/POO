package ProgMenus;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Prog1menu extends JFrame 
{
 public static String profe,nsalon,materia;   
 public JMenuBar menubar;
 public JToolBar menuherra;
 public JMenu menu,herra,salir;
 public JButton matBar1,matBar2;
 
 public static void main(String Args[])
 {
  Prog1menu objetox=new Prog1menu();
  objetox.setSize(750,400);
  objetox.setVisible(true);
  objetox.setTitle("Universitaria Agustiniana");
  objetox.setLocationRelativeTo(null);
  objetox.setResizable(false);
  objetox.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }  
 
 public Prog1menu()
 {
     
  ///////////////Menubar///////////////   
  EPrimers primersem=new EPrimers(); 
  ESegundos segundosem=new ESegundos(); 
  ETerceros tercersem=new ETerceros(); 
  ECuartos cuartosem=new ECuartos(); 
  EQuintos quintosem=new EQuintos(); 
  ESextos sextosem=new ESextos();
  Herramientas herra=new Herramientas();
 
  
  menubar=new JMenuBar();
  menubar.add(primersem.Primers());
  menubar.add(segundosem.Segundos());
  menubar.add(tercersem.Tercers());
  menubar.add(cuartosem.Cuartos());
  menubar.add(quintosem.Quintos());
  menubar.add(sextosem.Sextos());
  menubar.add(herra.Herramientas());
  
  add(PanelPrinc());
  setJMenuBar(menubar);
  this.setIconImage(new ImageIcon(getClass().getResource("../Icono/icono.png")).getImage());
 }  
    
 
 
 public JPanel PanelPrinc()
 {
  JLabel lb1=new JLabel(new ImageIcon("uniagustiniana-cree-en-ti.jpg"));     
  JPanel pn1=new JPanel();
  pn1.setLayout(new BorderLayout());
  
  pn1.add(lb1,BorderLayout.CENTER);
  pn1.add(barraherra(),BorderLayout.NORTH);
  return pn1;
 }       

public JToolBar barraherra()
{
 JToolBar menuherra=new JToolBar();
 PrimerS objeto = new PrimerS(); 
 
 menuherra.setEnabled(false);
 
 ///////////////Boton 1///////////////////////////
 JButton btn1=new JButton();
 btn1.setSize(30,30);
 ImageIcon Imagen1=new ImageIcon("129980.png"); 
 btn1.setIcon(new ImageIcon(Imagen1.getImage().getScaledInstance(btn1.getWidth(),btn1.getHeight(),Image.SCALE_SMOOTH)));
 
 ///////////////Boton 2/////////////////////////
 JButton btn2=new JButton();
 btn2.setSize(30,30);
 ImageIcon Imagen2=new ImageIcon("ingles1.jpg"); 
 btn2.setIcon(new ImageIcon(Imagen2.getImage().getScaledInstance(btn2.getWidth(),btn2.getHeight(),Image.SCALE_SMOOTH))); 
 
 ///////////////Boton 3/////////////////////////
 JButton btn3=new JButton();
 btn3.setSize(30,30);
 ImageIcon Imagen3=new ImageIcon("509782.png"); 
 btn3.setIcon(new ImageIcon(Imagen3.getImage().getScaledInstance(btn3.getWidth(),btn3.getHeight(),Image.SCALE_SMOOTH)));
 
 ///////////////Boton 4/////////////////////////
 JButton btn4=new JButton();
 btn4.setSize(30,30);
 ImageIcon Imagen4=new ImageIcon("bdatos.png"); 
 btn4.setIcon(new ImageIcon(Imagen4.getImage().getScaledInstance(btn4.getWidth(),btn4.getHeight(),Image.SCALE_SMOOTH)));
 
 ///////////////Boton 5/////////////////////////
 JButton btn5=new JButton();
 btn5.setSize(30,30);
 ImageIcon Imagen5=new ImageIcon("iconoEtica1.png"); 
 btn5.setIcon(new ImageIcon(Imagen5.getImage().getScaledInstance(btn5.getWidth(),btn5.getHeight(),Image.SCALE_SMOOTH)));
 
 ///////////////Boton 6/////////////////////////
 JButton btn6=new JButton();
 btn6.setSize(30,30);
 ImageIcon Imagen6=new ImageIcon("gradoima.jpg"); 
 btn6.setIcon(new ImageIcon(Imagen6.getImage().getScaledInstance(btn6.getWidth(),btn6.getHeight(),Image.SCALE_SMOOTH)));
 
 //////////////Boton salir///////////////////////
 JButton btn7=new JButton();
 btn7.setSize(30,30);
 ImageIcon Imagen7=new ImageIcon("salir.png"); 
 btn7.setIcon(new ImageIcon(Imagen7.getImage().getScaledInstance(btn7.getWidth(),btn7.getHeight(),Image.SCALE_SMOOTH)));
 
 
 
 
 ///////////////////////Acciones///////////////////////////////
 btn1.addMouseListener(new MouseListener() {
     @Override
     public void mouseClicked(MouseEvent me) {
      profe="Mario Mendoza"; nsalon="B204"; materia="Cátedra Agustiniana";    
      objeto.PrimerS();  
     }

     @Override
     public void mousePressed(MouseEvent me) {
         
     }

     @Override
     public void mouseReleased(MouseEvent me) {
         
     }

     @Override
     public void mouseEntered(MouseEvent me) {
         
     }

     @Override
     public void mouseExited(MouseEvent me) {
         
     }
 });
 
 btn2.addMouseListener(new MouseListener() {
     @Override
     public void mouseClicked(MouseEvent me) {
      profe="Sara Guerrero"; nsalon="S309"; materia="Ingles I"; 
      objeto.PrimerS();
     }

     @Override
     public void mousePressed(MouseEvent me) {
         
     }

     @Override
     public void mouseReleased(MouseEvent me) {
         
     }

     @Override
     public void mouseEntered(MouseEvent me) {
         
     }

     @Override
     public void mouseExited(MouseEvent me) {
         
     }
 });
 
 btn3.addMouseListener(new MouseListener() {
     @Override
     public void mouseClicked(MouseEvent me) {
      profe="Daniel Mejia"; nsalon="B101"; materia="Estadística";    
      objeto.PrimerS();  
     }

     @Override
     public void mousePressed(MouseEvent me) {
         
     }

     @Override
     public void mouseReleased(MouseEvent me) {
         
     }

     @Override
     public void mouseEntered(MouseEvent me) {
         
     }

     @Override
     public void mouseExited(MouseEvent me) {
         
     }
 });
 
 btn4.addMouseListener(new MouseListener() {
     @Override
     public void mouseClicked(MouseEvent me) {
      profe="Pedro Gonzales"; nsalon="S301"; materia="Estructura de Datos Avanzada";    
      objeto.PrimerS();  
     }

     @Override
     public void mousePressed(MouseEvent me) {
         
     }

     @Override
     public void mouseReleased(MouseEvent me) {
         
     }

     @Override
     public void mouseEntered(MouseEvent me) {
         
     }

     @Override
     public void mouseExited(MouseEvent me) {
         
     }
 });
 
 btn5.addMouseListener(new MouseListener() {
     @Override
     public void mouseClicked(MouseEvent me) {
      profe="Armando Maradona"; nsalon="B302"; materia="Ética";    
      objeto.PrimerS();  
     }

     @Override
     public void mousePressed(MouseEvent me) {
         
     }

     @Override
     public void mouseReleased(MouseEvent me) {
         
     }

     @Override
     public void mouseEntered(MouseEvent me) {
         
     }

     @Override
     public void mouseExited(MouseEvent me) {
         
     }
 });
 
 btn6.addMouseListener(new MouseListener() {
     @Override
     public void mouseClicked(MouseEvent me) {
      profe="Liliana Mora"; nsalon="S404"; materia="Opcion de Grádo";    
      objeto.PrimerS();  
     }

     @Override
     public void mousePressed(MouseEvent me) {
         
     }

     @Override
     public void mouseReleased(MouseEvent me) {
         
     }

     @Override
     public void mouseEntered(MouseEvent me) {
         
     }

     @Override
     public void mouseExited(MouseEvent me) {
         
     }
 });
 
 btn7.addMouseListener(new MouseListener() {
     @Override
     public void mouseClicked(MouseEvent me) {
      System.exit(0); 
     }

     @Override
     public void mousePressed(MouseEvent me) {
         
     }

     @Override
     public void mouseReleased(MouseEvent me) {
         
     }

     @Override
     public void mouseEntered(MouseEvent me) {
         
     }

     @Override
     public void mouseExited(MouseEvent me) {
         
     }
 });
 
 
 menuherra.add(btn1);
 menuherra.add(btn2);
 menuherra.add(btn3);
 menuherra.add(btn4);
 menuherra.add(btn5);
 menuherra.add(btn6);
 menuherra.add(btn7);
 return menuherra;
}        
 
 ////////////////////////PRIMER SEMESTER////////////////////////
 public class EPrimers implements ActionListener
 {
  JMenuItem mat1,mat2,mat3,mat4,mat5,mat6;
  PrimerS objeto = new PrimerS();   
  public JMenu Primers() 
  { 
    menu = new JMenu("Primer Semestre");
    menu.setFont(new Font("Comic Sans MS",Font.PLAIN, 12));
    mat1=new JMenuItem("Calculo Diferencial"); 
    mat2=new JMenuItem("Algebra Lineal");
    mat3=new JMenuItem("Algoritmia y Programacion Básica");
    mat4=new JMenuItem("Introducción al Desarrollo de Software");
    mat5=new JMenuItem("Metodos TIC");
    mat6=new JMenuItem("Catedra Agustiniana");  
    
    mat1.addActionListener(this);
    mat2.addActionListener(this);
    mat3.addActionListener(this);
    mat4.addActionListener(this);
    mat5.addActionListener(this);
    mat6.addActionListener(this);

    menu.add(mat1);
    menu.add(mat2);
    menu.add(mat3);
    menu.add(mat4);
    menu.add(mat5);
    menu.add(mat6);
    return menu;
  }
  
  public void actionPerformed(ActionEvent e)
  {
      
   if(e.getSource() == mat1)
   {
    profe="Daniel Mejia"; nsalon="B110"; materia="Cálculo Diferencial";    
    objeto.PrimerS();
   }
   
   if(e.getSource() == mat2)
   {
    profe="Edgar Pinto"; nsalon="B105"; materia="Algebra Lineal"; 
    objeto.PrimerS();
   }
   
   if(e.getSource() == mat3)
   {
    profe="Malonso Terminator"; nsalon="B215"; materia="Algoritmia y Programación Basica";  
    objeto.PrimerS();
   }   
  
   if(e.getSource() == mat4)
   {
    profe="Felix Gomez"; nsalon="S209"; materia="Introducción al Desarrollo del Software"; 
    objeto.PrimerS();
   }   
 
   if(e.getSource() == mat5)
   {
    profe="Yuber Rojas"; nsalon="S122"; materia="Métodos TIC"; 
    objeto.PrimerS();
   }   

   if(e.getSource() == mat6)
   {
    profe="Mario Mendoza"; nsalon="B204"; materia="Cátedra Agustiniana"; 
    objeto.PrimerS();
   }      
  }            
 } 
 
 
 
 
 ////////////////////////SEGUNDO SEMESTER////////////////////////
 public class ESegundos implements ActionListener
 {
  JMenuItem mat1,mat2,mat3,mat4,mat5,mat6;
  PrimerS objeto = new PrimerS();   
  public JMenu Segundos() 
  { 
   menu = new JMenu("Segundo Semestre"); 
   menu.setFont(new Font("Comic Sans MS",Font.PLAIN, 12));
   mat1=new JMenuItem("Calculo Integral"); 
   mat2=new JMenuItem("Programación Orientada a Objetos");
   mat3=new JMenuItem("Estructura de Datos");
   mat4=new JMenuItem("Introducción al Emprendimiento");
   mat5=new JMenuItem("Humanidades I");
   mat6=new JMenuItem("Inglés I");    
    
   mat1.addActionListener(this);
   mat2.addActionListener(this);
   mat3.addActionListener(this);
   mat4.addActionListener(this);
   mat5.addActionListener(this);
   mat6.addActionListener(this);

   menu.add(mat1);
   menu.add(mat2);
   menu.add(mat3);
   menu.add(mat4);
   menu.add(mat5);
   menu.add(mat6);
   return menu;
  }
  
  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource() == mat1)
   {
    profe="John Oviedo"; nsalon="S103"; materia="Cálculo Integral";    
    objeto.PrimerS();
   }
   
   if(e.getSource() == mat2)
   {
    profe="Malonso Terminator"; nsalon="B215"; materia="Programación Orientada a Objetos"; 
    objeto.PrimerS();
   }
   
   if(e.getSource() == mat3)
   {
    profe="Martha Segura"; nsalon="B215"; materia="Estructura de Dátos";  
    objeto.PrimerS();
   }   
  
   if(e.getSource() == mat4)
   {
    profe="Jouseph Rodriguez"; nsalon="B103"; materia="Introducción al Emprendimiento"; 
    objeto.PrimerS();
   }   
 
   if(e.getSource() == mat5)
   {
    profe="Luis Sepulveda"; nsalon="S301"; materia="Humanidades I"; 
    objeto.PrimerS();
   }   

   if(e.getSource() == mat6)
   {
    profe="Sara Guerrero"; nsalon="S309"; materia="Ingles I"; 
    objeto.PrimerS();
   }                     
  }        
 }
 
 
 
 ////////////////////////TERCER SEMESTER////////////////////////
 public class ETerceros implements ActionListener
 {
  JMenuItem mat1,mat2,mat3,mat4,mat5,mat6;
  PrimerS objeto = new PrimerS();    
  public JMenu Tercers() 
  { 
   menu = new JMenu("Tercer Semestre");
   menu.setFont(new Font("Comic Sans MS",Font.PLAIN, 12));   
   mat1=new JMenuItem("Estadistíca"); 
   mat2=new JMenuItem("Análisis y Diseño del Software");
   mat3=new JMenuItem("Modelado de Bases de Datos");
   mat4=new JMenuItem("Fundamentos de Desarrollo Web");
   mat5=new JMenuItem("Contabilidad");
   mat6=new JMenuItem("Inglés II");    
    
   mat1.addActionListener(this);
   mat2.addActionListener(this);
   mat3.addActionListener(this);
   mat4.addActionListener(this);
   mat5.addActionListener(this);
   mat6.addActionListener(this);

   menu.add(mat1);
   menu.add(mat2);
   menu.add(mat3);
   menu.add(mat4);
   menu.add(mat5);
   menu.add(mat6);
   return menu;
  }
  
  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource() == mat1)
   {
    profe="Daniel Mejia"; nsalon="B110"; materia="Estadistica";    
    objeto.PrimerS();
   }
   
   if(e.getSource() == mat2)
   {
    profe="Edgar Pinto"; nsalon="B105"; materia="Análisis y Diseño del Software"; 
    objeto.PrimerS();
   }
   
   if(e.getSource() == mat3)
   {
    profe="Malonso Terminator"; nsalon="B215"; materia="Modelado de Bases de Datos";  
    objeto.PrimerS();
   }   
  
   if(e.getSource() == mat4)
   {
    profe="Felix Gomez"; nsalon="S209"; materia="Fundamentos de Desarrollo Web"; 
    objeto.PrimerS();
   }   
 
   if(e.getSource() == mat5)
   {
    profe="Yuber Rojas"; nsalon="S122"; materia="Contabilidad"; 
    objeto.PrimerS();
   }   

   if(e.getSource() == mat6)
   {
    profe="Mario Mendoza"; nsalon="B204"; materia="Inglés II"; 
    objeto.PrimerS();
   }         
  }        
 }
 
 
 ////////////////////////CUARTO SEMESTER////////////////////////
 public class ECuartos implements ActionListener
 {
  JMenuItem mat1,mat2,mat3,mat4,mat5,mat6;
  PrimerS objeto = new PrimerS();
  
  public JMenu Cuartos() 
  { 
   menu = new JMenu("Cuarto Semestre");
   menu.setFont(new Font("Comic Sans MS",Font.PLAIN, 12));   
   mat1=new JMenuItem("Estructura de Datos Avanzada"); 
   mat2=new JMenuItem("Gestión de Bases de Datos");
   mat3=new JMenuItem("Construcción de Aplicaciones Web");
   mat4=new JMenuItem("Tecnología para Aplicaciones Móviles");
   mat5=new JMenuItem("Enprendimiento I");
   mat6=new JMenuItem("Inglés III");    
    
   mat1.addActionListener(this);
   mat2.addActionListener(this);
   mat3.addActionListener(this);
   mat4.addActionListener(this);
   mat5.addActionListener(this);
   mat6.addActionListener(this);

   menu.add(mat1);
   menu.add(mat2);
   menu.add(mat3);
   menu.add(mat4);
   menu.add(mat5);
   menu.add(mat6);
   
   return menu;
  }
  
  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource() == mat1)
   {
    profe="Pedro Gonzales"; nsalon="S301"; materia="Estructura de Datos Avanzada";    
    objeto.PrimerS();
   }
   
   if(e.getSource() == mat2)
   {
    profe="Edgar Pinto"; nsalon="B105"; materia="Gestión de Bases de Datos"; 
    objeto.PrimerS();
   }
   
   if(e.getSource() == mat3)
   {
    profe="Malonso Terminator"; nsalon="B215"; materia="Construcción de Aplicaciones Web";  
    objeto.PrimerS();
   }   
  
   if(e.getSource() == mat4)
   {
    profe="Felix Gomez"; nsalon="S209"; materia="Tecnología para Aplicaciones Móviles"; 
    objeto.PrimerS();
   }   
 
   if(e.getSource() == mat5)
   {
    profe="Yuber Rojas"; nsalon="S122"; materia="Enprendimiento I"; 
    objeto.PrimerS();
   }   

   if(e.getSource() == mat6)
   {
    profe="Mario Mendoza"; nsalon="B204"; materia="Inglés III"; 
    objeto.PrimerS();
   }           
  }        
 }
 
 
 ////////////////////////QUINTO SEMESTER////////////////////////
 public class EQuintos implements ActionListener
 {
  JMenuItem mat1,mat2,mat3,mat4,mat5,mat6;
  PrimerS objeto = new PrimerS();
  
  public JMenu Quintos() 
  { 
   menu = new JMenu("Quinto Semestre");  
   menu.setFont(new Font("Comic Sans MS",Font.PLAIN, 12));
   mat1=new JMenuItem("Arquitectura de Software"); 
   mat2=new JMenuItem("Sistemas Operativos y Arquitectura de Hardware");
   mat3=new JMenuItem("Técnicas Avanzadas de Programación para Móviles");
   mat4=new JMenuItem("Investigación Formativa");
   mat5=new JMenuItem("Ética");
   mat6=new JMenuItem("Inglés IV");    
    
   mat1.addActionListener(this);
   mat2.addActionListener(this);
   mat3.addActionListener(this);
   mat4.addActionListener(this);
   mat5.addActionListener(this);
   mat6.addActionListener(this);

   menu.add(mat1);
   menu.add(mat2);
   menu.add(mat3);
   menu.add(mat4);
   menu.add(mat5);
   menu.add(mat6);
   return menu;
  }
  
  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource() == mat1)
   {
    profe="Daniel Mejia"; nsalon="B110"; materia="Arquitectura de Software";    
    objeto.PrimerS();
   }
   
   if(e.getSource() == mat2)
   {
    profe="Edgar Pinto"; nsalon="B105"; materia="Sistemas Operativos y Arquitectura de Hardware"; 
    objeto.PrimerS();
   }
   
   if(e.getSource() == mat3)
   {
    profe="Malonso Terminator"; nsalon="B215"; materia="Técnicas Avanzadas de Programación para Móviles";  
    objeto.PrimerS();
   }   
  
   if(e.getSource() == mat4)
   {
    profe="Felix Gomez"; nsalon="S209"; materia="Investigación Formativa"; 
    objeto.PrimerS();
   }   
 
   if(e.getSource() == mat5)
   {
    profe="Armando Maradona"; nsalon="B302"; materia="Ética"; 
    objeto.PrimerS();
   }   

   if(e.getSource() == mat6)
   {
    profe="Mario Mendoza"; nsalon="B204"; materia="Inglés IV"; 
    objeto.PrimerS();
   }              
  }        
 }
 
 
 ////////////////////////SEXTO SEMESTER////////////////////////
 public class ESextos implements ActionListener
 {
  JMenuItem mat1,mat2,mat3,mat4,mat5,mat6;
  PrimerS objeto = new PrimerS(); 
  
  public JMenu Sextos() 
  { 
   menu = new JMenu("Sexto Semestre"); 
   menu.setFont(new Font("Comic Sans MS",Font.PLAIN, 12));
   mat1=new JMenuItem("Legislación Tecnológica"); 
   mat2=new JMenuItem("Desarrollo y Refinamiento de Software");
   mat3=new JMenuItem("Electiva Profesional I");
   mat4=new JMenuItem("Electiva Profesional II");
   mat5=new JMenuItem("Electiva Profesional III");
   mat6=new JMenuItem("Opción de Grado");    
    
   mat1.addActionListener(this);
   mat2.addActionListener(this);
   mat3.addActionListener(this);
   mat4.addActionListener(this);
   mat5.addActionListener(this);
   mat6.addActionListener(this);

   menu.add(mat1);
   menu.add(mat2);
   menu.add(mat3);
   menu.add(mat4);
   menu.add(mat5);
   menu.add(mat6);
   return menu;
  }
  
  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource() == mat1)
   {
    profe="Daniel Mejia"; nsalon="B110"; materia="Legislación Tecnológica";    
    objeto.PrimerS();
   }
   
   if(e.getSource() == mat2)
   {
    profe="Edgar Pinto"; nsalon="B105"; materia="Desarrollo y Refinamiento de Software"; 
    objeto.PrimerS();
   }
   
   if(e.getSource() == mat3)
   {
    profe="Malonso Terminator"; nsalon="B215"; materia="Electiva Profesional I";  
    objeto.PrimerS();
   }   
  
   if(e.getSource() == mat4)
   {
    profe="Felix Gomez"; nsalon="S209"; materia="Electiva Profesional II"; 
    objeto.PrimerS();
   }   
 
   if(e.getSource() == mat5)
   {
    profe="Yuber Rojas"; nsalon="S122"; materia="Electiva Profesional III"; 
    objeto.PrimerS();
   }   

   if(e.getSource() == mat6)
   {
    profe="Liliana Mora"; nsalon="S404"; materia="Opción de Grado"; 
    objeto.PrimerS();
   }                        
  }        
 }
 
 
 ////////////////////////HERRAMIENTAS////////////////////////
 public class Herramientas implements ActionListener
 {
  JMenuItem si,no;
     
  public JMenu Herramientas()
  {
   herra=new JMenu("Herramientas");
   herra.setFont(new Font("Comic Sans MS",Font.PLAIN, 12));
   salir=new JMenu("Salir");
   si=new JMenuItem("Si");
   no=new JMenuItem("No");
   si.addActionListener(this);
  
   salir.add(si);
   salir.add(no);
   herra.add(salir);
   return herra;
  }   
 
  public void actionPerformed(ActionEvent e)
  {   
   if(e.getSource() == si)
   System.exit(0);    
  }
 }        
} 
