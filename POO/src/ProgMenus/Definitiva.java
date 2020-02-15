package ProgMenus;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Definitiva extends JFrame
{
 double definitiva;
 JTextField defi,nalumno,observaciones,descuento;   
 JFrame fr1;
 public JFrame Definitiva()
 {
  Prog1menu objetox=new Prog1menu();   
  fr1 = new JFrame();  
  fr1.setTitle(objetox.materia);
  fr1.setSize(300,500);
  fr1.setVisible(true);
  fr1.setLocationRelativeTo(null);
  fr1.add(Panel1());
  fr1.setIconImage(new ImageIcon(getClass().getResource("../Icono/icono.png")).getImage());
  return fr1;   
 }   
 
 public JPanel Panel1()
 {
     
  JPanel pn1=new JPanel();
  
  pn1.setLayout(new GridLayout(6,1));
  pn1.add(Panel2());
  pn1.add(PanelMateria());
  pn1.add(Panel3());
  pn1.add(Panel4());
  pn1.add(Panel5());
  pn1.add(botones());
  return pn1;
 } 
 
 public JPanel PanelMateria()
 {
  Prog1menu ObjectPrimerS=new Prog1menu();   
  JPanel pn1=new JPanel();
  JLabel nombree=new JLabel("Asignatura: ");
  nalumno=new JTextField();
  FlowLayout layout=new FlowLayout();
  
  nalumno.setEnabled(false);
  nalumno.setText(ObjectPrimerS.materia);
  nalumno.setPreferredSize(new Dimension(150,30));
  layout.setHgap(10);
  pn1.setLayout(layout);
  pn1.add(nombree);
  pn1.add(nalumno);
  return pn1;    
 }   
 
 
 public JPanel Panel2()
 { 
  PrimerS ObjectPrimerS=new PrimerS();   
  JPanel pn1=new JPanel();
  JLabel nombree=new JLabel("Nombre: ");
  nalumno=new JTextField();
  FlowLayout layout=new FlowLayout();
  
  nalumno.setEnabled(false);
  nalumno.setText(ObjectPrimerS.Nalumno);
  nalumno.setPreferredSize(new Dimension(150,30));
  layout.setHgap(10);
  pn1.setLayout(layout);
  pn1.add(nombree);
  pn1.add(nalumno);
  return pn1;
 }        
 
 public JPanel Panel3()
 {
  PrimerS ObjectPrimerS=new PrimerS();   
  JPanel pn1=new JPanel();
  JLabel nota=new JLabel("Definitiva: ");
  defi=new JTextField();
  FlowLayout layout=new FlowLayout();
  
  defi.setEnabled(false);
  defi.setText(ObjectPrimerS.definitiva+"");
  defi.setPreferredSize(new Dimension(150,30));
  layout.setHgap(10);
  pn1.setLayout(layout);
  pn1.add(nota);
  pn1.add(defi);
  return pn1;
 }        
 
 public JPanel Panel4()
 {   
  JPanel pn1=new JPanel();
  JLabel observa=new JLabel("Observacion: ");
  observaciones=new JTextField();
  FlowLayout layout=new FlowLayout();
  
  observaciones.setEnabled(false);
  observaciones.setPreferredSize(new Dimension(150,30));
  layout.setHgap(7);
  pn1.setLayout(layout);
  pn1.add(observa);
  pn1.add(observaciones);
  return pn1;
 }        
 
 public JPanel Panel5()
 {
  JPanel pn1=new JPanel();
  JLabel observa=new JLabel("Descuento: ");
  descuento=new JTextField();
  FlowLayout layout=new FlowLayout();
  
  descuento.setEnabled(false);
  descuento.setPreferredSize(new Dimension(150,30));
  layout.setHgap(7);
  pn1.setLayout(layout);
  pn1.add(observa);
  pn1.add(descuento);
  return pn1;    
 } 
 
 
 public JPanel botones()
 {
  PrimerS objetox=new PrimerS();
  definitiva=objetox.definitiva;
  
  JPanel pn1=new JPanel();
  FlowLayout layout=new FlowLayout();
  JButton volver=new JButton("Volver");
  JButton validar=new JButton("Validar");
  JButton descuentob=new JButton("Descuento");
  
  layout.setHgap(10);
  pn1.setLayout(layout);
  pn1.add(validar);
  pn1.add(descuentob);
  pn1.add(volver);
  
  
  volver.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
             fr1.setVisible(false);
             definitiva=0;
             
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
  
  
  descuentob.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
             if(definitiva>=3)
             {
              descuento.setText("$800.000");
             }
             else
              descuento.setText("$1.000.000");   
             
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
  
  validar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
             if(definitiva>=3)
             {
              observaciones.setText("APROBADO");
             }
             else
              observaciones.setText("REPROBADO");   
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
