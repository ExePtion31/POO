import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana2 
{
 public JLabel NoA;   
 public static void main(String Args[])
 {
  Ventana2 v2=new Ventana2();
  v2.FramePrincipal();
 }
 
 public void FramePrincipal()
 {   
  Frame fr1=new Frame("Ventana Principal");
  Button btn1=new Button("Nombre");
  Button btn2=new Button("Apellido");
  JLabel label1=new JLabel("SELECCIONE UN BOTON");
  NoA=new JLabel();
  
  fr1.setLayout(new BorderLayout(3,3));
  fr1.setSize(500,500);
  fr1.addWindowListener(new WindowAdapter() 
  {
   public void windowClosing(WindowEvent windowEvent) 
   {
    System.exit(0);
   }
  }
  );
  
  label1.setPreferredSize(new Dimension(500,30));
  btn1.setPreferredSize(new Dimension(100,40));
  btn2.setPreferredSize(new Dimension(100,40));
  label1.setHorizontalAlignment(SwingConstants.CENTER);
  NoA.setHorizontalAlignment(SwingConstants.CENTER);
  fr1.setLocationRelativeTo(null);
  
  fr1.add(btn1,"West");
  fr1.add(btn2,"East");
  fr1.add(label1,"North");
  fr1.add(NoA,"Center");
  fr1.setVisible(true);
  
  btn1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
             NoA.setText("Giovanni");

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
  
  btn2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
             NoA.setText("Baquero");

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
 }
}
