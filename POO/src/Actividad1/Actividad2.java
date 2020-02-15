package Actividad1;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Actividad2 
{
 public Button btn1,btn2,btn3,btn4,btn5;
 public TextField tx1,tx2,resul;
 public static void main(String Args[])
 {
  Actividad2 ac=new Actividad2();
  ac.FramePr();
 }
 
 public void FramePr()
 {
  Frame fr1=new Frame("Ventana Principal");
  fr1.setLayout(new GridLayout(2,1,10,10));
  fr1.setSize(500,500);
  fr1.setLocationRelativeTo(null);
  fr1.setVisible(true);
  fr1.addWindowListener(new WindowAdapter() 
  {
   public void windowClosing(WindowEvent windowEvent) 
   {
    System.exit(0);
   }
  }
  );
  
  fr1.add(PanelPrinc1());
  fr1.add(PanelPrinc2());
 } 
 
 
 public Panel PanelPrinc1()
 {
  Panel pn1=new Panel();
  
  
  GridLayout layout1=new GridLayout(3,1,5,5);
  layout1.setHgap(10);
  pn1.setLayout(layout1);
  pn1.setPreferredSize(new Dimension(500,300));
  
  pn1.add(PanelSec1());
  pn1.add(PanelSec2());
  pn1.add(PanelSec3());
  return pn1;
 }
 
 public Panel PanelSec1()
 {
  Panel pns1=new Panel();
  Label lb1=new Label("Digite Primer Valor");
  tx1=new TextField();
  FlowLayout layout1=new FlowLayout();
  
  layout1.setHgap(10);
  pns1.setLayout(layout1);
  lb1.setPreferredSize(new Dimension(120,40));
  tx1.setPreferredSize(new Dimension(70,30));
  
  pns1.add(lb1);
  pns1.add(tx1);
 
  return pns1;
 }    
 
 public Panel PanelSec2()
 {
  Panel pns1=new Panel();
  Label lb1=new Label("Digite Segundo Valor");
  tx2=new TextField();
  FlowLayout layout1=new FlowLayout();
  
  layout1.setHgap(10);
  pns1.setLayout(layout1);
  lb1.setPreferredSize(new Dimension(120,40));
  tx2.setPreferredSize(new Dimension(70,30));
  
  pns1.add(lb1);
  pns1.add(tx2);
 
  return pns1;
 }
 
 public Panel PanelSec3()
 {
  Panel pns1=new Panel();
  Label lb1=new Label("Resultado");
  resul=new TextField();
  FlowLayout layout1=new FlowLayout();
  
  layout1.setHgap(10);
  pns1.setLayout(layout1);
  lb1.setPreferredSize(new Dimension(120,40));
  resul.setPreferredSize(new Dimension(70,30));
  
  pns1.add(lb1);
  pns1.add(resul);
 
  return pns1;
 }
 
 public Panel PanelPrinc2()
 {
  Panel pn1=new Panel();
  GridLayout layout1=new GridLayout(2,1);
  
  layout1.setHgap(10);
  pn1.setLayout(layout1);
  pn1.add(PanelSec4());
  pn1.add(PanelSec5());
  return pn1;
 } 
 
 public Panel PanelSec4()
 {
  btn1=new Button("Sumar");
  btn2=new Button("Restar");
  btn3=new Button("Multiplicar");
  btn4=new Button("Dividir");
  Panel pn1=new Panel();
  FlowLayout layout1=new FlowLayout();
  
  layout1.setHgap(10);
  layout1.setVgap(10);
  pn1.setLayout(layout1);
  pn1.add(btn1);
  pn1.add(btn2);
  pn1.add(btn3);
  pn1.add(btn4);
  btn1.setPreferredSize(new Dimension(85,40));
  btn2.setPreferredSize(new Dimension(85,40));
  btn3.setPreferredSize(new Dimension(85,40));
  btn4.setPreferredSize(new Dimension(85,40));
  
  /////////////////////////////EVENTOS/////////////////////////////////////
  
  ///////////////SUMA/////////////////
  btn1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                int v1 = Integer.parseInt(tx1.getText());
                int v2 = Integer.parseInt(tx2.getText());

                resul.setText(v1+v2+"");

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
  
  //////////RESTA ///////////////////
  btn2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                int v1 = Integer.parseInt(tx1.getText());
                int v2 = Integer.parseInt(tx2.getText());

                resul.setText(v1-v2+"");

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
  
  ////////////MULTIPLICACION//////////
  btn3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                int v1 = Integer.parseInt(tx1.getText());
                int v2 = Integer.parseInt(tx2.getText());

                resul.setText(v1*v2+"");

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
  
  //////////////DIVISION/////////////
  btn4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                Double v1 = Double.parseDouble(tx1.getText());
                Double v2 = Double.parseDouble(tx2.getText());

                resul.setText(v1/v2+"");

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
  
  ///////////////////////////////////////////////////////////////////////////
  
  
  
  
  return pn1;
 }
 
 public Panel PanelSec5()
 {
  Panel pn1=new Panel();
  pn1.setLayout(new FlowLayout());
  btn5=new Button("Borrar");
  
  pn1.add(btn5);
  btn5.setPreferredSize(new Dimension(85,40));
  btn5.setBackground(Color.RED);
  btn5.setForeground(Color.WHITE);
  
  /////////////BORRAR//////////////////////
  btn5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tx1.setText("");
                tx2.setText("");
                resul.setText("");
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

