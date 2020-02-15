import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Ventana 
{
 private JFrame main;
 private JButton btn1;
 private JButton btn2;
 private JButton btn3;


public void  mainLayout()
{
 main = new JFrame("Ventana Principal");
 main.setSize(500, 600);
 main.setLayout(new GridLayout(2,1));
 main.addWindowListener(new WindowAdapter() 
 {
  public void windowClosing(WindowEvent windowEvent) 
  {
   System.exit(0);
  }
 }
 );
  main.add(fristLayout());
  main.add(secondLayout());
  main.setVisible(true);
}

public JPanel fristLayout()
{
  btn1 = new JButton("Hola");
  btn2 = new JButton("Mundo");
  btn3 = new JButton("Java");
  
  JPanel containerBtn = new JPanel();
  containerBtn.setSize(400,300);
  BorderLayout layout = new BorderLayout();
  layout.setHgap(15);
  layout.setVgap(15);
  containerBtn.setLayout(layout);
  containerBtn.add(btn1,BorderLayout.WEST);
  containerBtn.add(btn2,BorderLayout.CENTER);
  containerBtn.add(btn3,BorderLayout.EAST);
  containerBtn.setVisible(true);
  return containerBtn;
 }
 
public JPanel secondLayout()
{
 btn1 = new JButton("Hola");
 btn2 = new JButton("Mundo");
 btn3 = new JButton("Java");
 
 JPanel containerBtn = new JPanel();
 containerBtn.setSize(400,300);
 BorderLayout layout = new BorderLayout();
 layout.setHgap(15);
 layout.setVgap(15);
 containerBtn.setLayout(layout);
 containerBtn.add(btn1,BorderLayout.WEST);
 containerBtn.add(btn2,BorderLayout.CENTER);
 containerBtn.add(btn3,BorderLayout.EAST);
 containerBtn.setVisible(true);
 return containerBtn;
}
    
 public static void main(String[] args) 
 {
  Ventana layout = new Ventana();
  layout.mainLayout();
 }
}
