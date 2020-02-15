package Actividad1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener
{
 private JMenuBar menubar;
 private JMenu menu1;
 private JMenuItem menuitem1, menuitem2;
 public static void main(String args[])
 {
  Menu formulario1 = new Menu();
  formulario1.setBounds(0,0,400,300);
  formulario1.setVisible(true);
  formulario1.setLocationRelativeTo(null);
 }
 public Menu()
 {
  setLayout(null);
  menubar = new JMenuBar();
  setJMenuBar(menubar);
  setDefaultCloseOperation(EXIT_ON_CLOSE);

  menu1 = new JMenu("Opciones");
  menubar.add(menu1);

  menuitem1 = new JMenuItem("Calculadora Basica");
  menuitem1.addActionListener(this);
  menu1.add(menuitem1);

  menuitem2 = new JMenuItem("Calculadora Cientifica");
  menuitem2.addActionListener(this);
  menu1.add(menuitem2);
 }

 public void actionPerformed(ActionEvent e)
 {
  if(e.getSource() == menuitem1)
  {
   Calculadora cal=new Calculadora();
   cal.Frameprin();
  }
  if(e.getSource() == menuitem2)
  {
   CalculadoraCientifica calcient=new CalculadoraCientifica();
   calcient.Frameprin();
  }
 } 
}
