package Ventana1;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Ventana2 
{  
 public static void main (String Args[])
 {
  Ventana2 v2=new Ventana2(); 
  v2.FramePrinc();
 } 
 
 public void FramePrinc()
 {
  JFrame fr1=new JFrame("Ventana Principal");
  fr1.setSize(400,350);
  fr1.setLayout(new GridLayout(2,1,10,30));
  fr1.setLocationRelativeTo(null);
  fr1.addWindowListener(new WindowAdapter() 
  {
   public void windowClosing(WindowEvent windowEvent) 
   {
    System.exit(0);
   }
  }
  );
  
  fr1.add(Panel1());
  fr1.add(Panel2());
  fr1.setVisible(true);
 } 
 
 
 
 public JPanel Panel1()
 {
  JPanel pn1=new JPanel();
  JTextField tx1=new JTextField();
  JButton btn1=new JButton("Boton 1");
  JButton btn2=new JButton("Boton 2");
  
  FlowLayout layout1=new FlowLayout();
  layout1.setHgap(20);
  layout1.setVgap(10);
  pn1.setLayout(layout1);
  pn1.add(tx1);
  tx1.setPreferredSize(new Dimension(150,100));
  btn1.setPreferredSize(new Dimension(80,40));
  btn2.setPreferredSize(new Dimension(80,40));
  pn1.add(btn1);
  pn1.add(btn2);
  return pn1;
 }
 
 
 public JPanel Panel2()
 {
  JPanel pn1=new JPanel();
  JTextField tx1=new JTextField("Hola a todos");
  JButton btn1=new JButton("Boton 1");
  JButton btn2=new JButton("Boton 2");
  
  FlowLayout layout1=new FlowLayout();
  layout1.setHgap(20);
  layout1.setVgap(10);
  pn1.setLayout(layout1);
  pn1.add(tx1);
  tx1.setPreferredSize(new Dimension(100,20));
  pn1.add(btn1);
  pn1.add(btn2);
  return pn1;
 }        
}
