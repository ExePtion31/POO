package ProgMenus;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PrimerS 
{
 public static double definitiva; 
 public static String Nalumno;
 JButton btnvolver,btncalcular,btncontinuar;
 JFrame fr1;
 JTextField salon1,nprofesor,nota1,nota2,nota3,defi,defi2,alumno;
 Definitiva objetico=new Definitiva();

 public JFrame PrimerS()
 {
  Prog1menu objetox=new Prog1menu();   
  fr1 = new JFrame();  
  fr1.setTitle(objetox.materia);
  fr1.setSize(300,500);
  fr1.setVisible(true);
  fr1.setLocationRelativeTo(null);
  fr1.add(panelPrinc());
  fr1.setIconImage(new ImageIcon(getClass().getResource("../Icono/icono.png")).getImage());
  return fr1;
 }        
 
 public JPanel panelPrinc()
 {
  JPanel pn1=new JPanel();
  GridLayout layout=new GridLayout(8,1);
  
  layout.setVgap(10);
  layout.setHgap(10);
  pn1.setLayout(layout);
  
  
  pn1.add(panel1());
  pn1.add(panel2());
  pn1.add(panel3());
  pn1.add(panel4());
  pn1.add(panel5());
  pn1.add(panel6());
  pn1.add(panel7());
  pn1.add(botones());
  return pn1;
 }        

 public JPanel panel1()
 {
  Prog1menu objetox=new Prog1menu();   
  JPanel pn1=new JPanel();
  JLabel salon=new JLabel("Salon: ");
  salon1=new JTextField();
  FlowLayout layout=new FlowLayout();
  
  salon1.setText(objetox.nsalon);
  salon1.setPreferredSize(new Dimension(40,30));
  salon1.setEnabled(false);
  layout.setHgap(10);
  pn1.setLayout(layout);
  pn1.add(salon);
  pn1.add(salon1);
  return pn1;
 }     
 
 public JPanel panel2()
 {
  Prog1menu objetox=new Prog1menu();   
  JPanel pn1=new JPanel();
  JLabel salon=new JLabel("Profesor: ");
  nprofesor=new JTextField();
  FlowLayout layout=new FlowLayout();
 
  nprofesor.setText(objetox.profe);
  nprofesor.setEnabled(false);
  nprofesor.setPreferredSize(new Dimension(150,30));
  layout.setHgap(8);
  pn1.setLayout(layout);
  pn1.add(salon);
  pn1.add(nprofesor);
  return pn1;
 }     
 
 public JPanel panel3()
 {   
  JPanel pn1=new JPanel();
  JLabel Profesor=new JLabel("Alumno: ");
  alumno=new JTextField();
  FlowLayout layout=new FlowLayout();
  
  alumno.setPreferredSize(new Dimension(150,30));
  layout.setHgap(10);
  pn1.setLayout(layout);
  pn1.add(Profesor);
  pn1.add(alumno);
  return pn1;
 }     
 
 public JPanel panel4()
 {   
  JPanel pn1=new JPanel();
  JLabel Profesor=new JLabel("Nota 1: ");
  nota1=new JTextField();
  FlowLayout layout=new FlowLayout();
  
  nota1.setPreferredSize(new Dimension(150,30));
  layout.setHgap(11);
  pn1.setLayout(layout);
  pn1.add(Profesor);
  pn1.add(nota1);
  return pn1;
 }        
 
 public JPanel panel5()
 {   
  JPanel pn1=new JPanel();
  JLabel Profesor=new JLabel("Nota 2: ");
  nota2=new JTextField();
  FlowLayout layout=new FlowLayout();
  
  nota2.setPreferredSize(new Dimension(150,30));
  layout.setHgap(11);
  pn1.setLayout(layout);
  pn1.add(Profesor);
  pn1.add(nota2);
  return pn1;
 }        
 
 public JPanel panel6()
 {   
  JPanel pn1=new JPanel();
  JLabel Profesor=new JLabel("Nota 3: ");
  nota3=new JTextField();
  FlowLayout layout=new FlowLayout();
  
  nota3.setPreferredSize(new Dimension(150,30));
  layout.setHgap(11);
  pn1.setLayout(layout);
  pn1.add(Profesor);
  pn1.add(nota3);
  return pn1;
 }        
 
 public JPanel panel7()
 {   
  JPanel pn1=new JPanel();
  JLabel Profesor=new JLabel("Definitiva: ");
  defi=new JTextField();
  FlowLayout layout=new FlowLayout();
  
  defi.setEnabled(false);
  defi.setPreferredSize(new Dimension(150,30));
  layout.setHgap(7);
  pn1.setLayout(layout);
  pn1.add(Profesor);
  pn1.add(defi);
  return pn1;
 }        
 
 public JPanel botones()
 {
  JPanel pn1=new JPanel(); 
  FlowLayout layout=new FlowLayout();
  btnvolver=new JButton("Volver");
  btncalcular=new JButton("Calcular");
  btncontinuar=new JButton("Continuar");
  
  layout.setHgap(10);
  pn1.setLayout(layout);  
  pn1.add(btncalcular);
  pn1.add(btncontinuar);
  pn1.add(btnvolver);
  btnvolver.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
              fr1.setVisible(false);
              
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
  
  btncalcular.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                double v1 = Double.parseDouble(nota1.getText());
                double v2 = Double.parseDouble(nota2.getText());
                double v3 = Double.parseDouble(nota3.getText());
                definitiva=(v1+v2+v3)/3;
                Nalumno=alumno.getText();
                defi.setText(definitiva+"");
                

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
  
  btncontinuar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
             fr1.setVisible(false);   
             objetico.Definitiva();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
  return pn1;
 }    
         
}
