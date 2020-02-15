package Ventana;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Ventana extends JFrame 
{
 public JPanel Panel1; 
 public JLabel label1;
 public JLabel label2;
 public JButton boton1;
 public JButton boton2;
 
 
 
 public Ventana() 
 {
  setDefaultCloseOperation(EXIT_ON_CLOSE); //////Cierra la ventana y finalizar la ejecucion
  this.setSize(500,500); /////////Tamaño de la ventana 
  //setLocation(400,200); ////Establecer posicion inicial de la ventana
  //setBounds(400,200,500,500); ////Establecer posicion inicial y tamaño de la ventana
  setTitle("Ventana de Prueba"); ////Establecer titulo de la ventana
  setLocationRelativeTo(null); ////Establece la ventana en el centro de la pantalla
  //this.getContentPane().setBackground(Color.CYAN); ////Agrega colora la ventana
  Paneles();
 }
 
 
 
    
 public void Paneles()
 {
  Panel1=new JPanel(); //////Creacion del panel
  this.getContentPane().add(Panel1); /////Agrega el panel a la ventana
  Panel1.setLayout(null); ///Desactiva el Layout por defecto para poder mover los objetos
  ///Panel1.setBackground(Color.GREEN); ////Agregar color al panel
  Labels();
 }  
 
 
 
 
 
 public void Labels()
 {
  ///////////////////LABEL1//////////////////////////
  label1=new JLabel("Hola!",SwingConstants.CENTER); /////Crea una etiqueta y la posiciona el texto dentro del label
  Panel1.add(label1); /////Agrega el label al panel
  label1.setOpaque(true); /////Desactiva el diseño por defecto que trae el label para poder pintar el fondo, etc.
  label1.setBounds(210,1,70,30); ///Establece posicion y tamaño del label
  /////label1.setForeground(Color.ORANGE); /////Cambiar el color a la letra
  /////label1.setBackground(Color.yellow); ////Cambiar el color de fondo dela etiqueta
  label1.setFont(new Font("Tahoma",Font.ITALIC,20)); ///Establece la fuete del texto (Nombre de letra, tipo de letra, tamaño)
 
  
  
  
  //////////////////LABEL CON IMAGEN/////////////////////////// 
  label2=new JLabel(new ImageIcon("ImagenPrueba.jpg")); ////////Agrego un label y le agrego la imagen
  Panel1.add(label2); /////Agrego el label al panel
  label2.setBounds(40,30,400,350); //////Posicion y tamaño del label 
  Botones();  
 } 
 
 
 
 
 public void Botones()
 {
  //////////////////BOTON 1///////////////////
  boton1=new JButton("Boton #1"); /////Crea el boton
  boton1.setBounds(20,400,100,30); //////Posiciona el boton en el panel
  Panel1.add(boton1); //////Agrega el boton al panel
  boton1.setForeground(Color.BLUE); /////Color de la letra del boton
  boton1.setBackground(Color.ORANGE); //////Color del fondo del boton
  boton1.setFont(new Font("Constantia",Font.LAYOUT_LEFT_TO_RIGHT,14));
  //////boton1.setMnemonic('a'); ////Presiona Alt + 'letra' para hacer funcionar el boton
  /////boton1.setEnabled(true); //////habilita o deshabilita el boton
  
  
  /////////////////BOTON2///////////////////////
  boton2=new JButton();
  Panel1.add(boton2);
  boton2.setBounds(150,400,100,30);
  ImageIcon Descargar=new ImageIcon("Imagen2.png"); //////Crear imagen
  boton2.setIcon(new ImageIcon(Descargar.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH))); /////Ajustar la imagen de acuerdo al tamaño del boton
 }        
}
