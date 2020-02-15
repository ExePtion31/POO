package Actividad1;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculadoraCientifica 
{ 
 static CalculadoraCientifica cal;   
 public double a,b,factorial;   
 public Label tablero;
 String numero1,signo,numero2;
 public static void main(String Args[])
 {
  CalculadoraCientifica cal=new CalculadoraCientifica();
  cal.Frameprin();
  
 }
 
 public Frame Frameprin()
 {
  Frame fr1=new Frame("Calculadora");
  
  fr1.setLayout(new BorderLayout());
  fr1.setSize(400,610);
  fr1.setVisible(true);
  fr1.addWindowListener(new WindowAdapter() 
  {
   public void windowClosing(WindowEvent windowEvent) 
   {
    System.exit(0);
   }
  }
  );
  fr1.setLocationRelativeTo(null);
  fr1.add(Botones());
  fr1.add(Panel1(),"North");
  fr1.add(resultados(),"South");
  
  
  return fr1;
 }
 
 
 public Panel Panel1()
 {
  Panel pn1=new Panel();
  tablero=new Label("");
  
  pn1.setPreferredSize(new Dimension(400,100));
  tablero.setFont(new Font("Arial",Font.CENTER_BASELINE,50));
  tablero.setBackground(Color.GRAY);
  tablero.setPreferredSize(new Dimension(380,100));
  pn1.add(tablero);
  
  return pn1;   
 }        
 
 
 public Panel Botones()
 {
  Panel pn1=new Panel();
  Button btnsen=new Button("Sin");
  Button btncos=new Button("Cos");
  Button btntan=new Button("Tan");
  Button raiz=new Button("√");
  Button elevado=new Button("x²");
  Button log=new Button("Log");
  Button btnpi=new Button("π");
  Button btn0=new Button("0");
  Button btn1=new Button("1");
  Button btn2=new Button("2");
  Button btn3=new Button("3");
  Button btn4=new Button("4");
  Button btn5=new Button("5");
  Button btn6=new Button("6");
  Button btn7=new Button("7");
  Button btn8=new Button("8");
  Button btn9=new Button("9");
  Button suma=new Button("+");
  Button resta=new Button("-");
  Button multi=new Button("*");
  Button div=new Button("/");
  Button dec=new Button(".");
  FlowLayout layout1=new FlowLayout();
  
  layout1.setHgap(5);
  layout1.setVgap(5);
  pn1.setLayout(layout1);
  
  btnsen.setPreferredSize(new Dimension(122,50));
  btnsen.setFont(new Font("Tahoma",Font.PLAIN,30));
  btncos.setPreferredSize(new Dimension(122,50));
  btncos.setFont(new Font("Tahoma",Font.PLAIN,30));
  btntan.setPreferredSize(new Dimension(122,50));
  btntan.setFont(new Font("Tahoma",Font.PLAIN,30));
  raiz.setPreferredSize(new Dimension(90,50));
  raiz.setFont(new Font("Tahoma",Font.PLAIN,30));
  elevado.setPreferredSize(new Dimension(90,50));
  elevado.setFont(new Font("Tahoma",Font.PLAIN,30));
  log.setPreferredSize(new Dimension(90,50));
  log.setFont(new Font("Tahoma",Font.PLAIN,30));
  btnpi.setPreferredSize(new Dimension(90,50));
  btnpi.setFont(new Font("Tahoma",Font.PLAIN,30));
  btn7.setPreferredSize(new Dimension(90,50));
  btn7.setFont(new Font("Tahoma",Font.PLAIN,30));
  btn8.setPreferredSize(new Dimension(90,50));
  btn8.setFont(new Font("Tahoma",Font.PLAIN,30));
  btn9.setPreferredSize(new Dimension(90,50));
  btn9.setFont(new Font("Tahoma",Font.PLAIN,30));
  suma.setPreferredSize(new Dimension(90,50));
  suma.setFont(new Font("Tahoma",Font.PLAIN,30));
  btn4.setPreferredSize(new Dimension(90,50));
  btn4.setFont(new Font("Tahoma",Font.PLAIN,30));
  btn5.setPreferredSize(new Dimension(90,50));
  btn5.setFont(new Font("Tahoma",Font.PLAIN,30));
  btn6.setPreferredSize(new Dimension(90,50));
  btn6.setFont(new Font("Tahoma",Font.PLAIN,30));
  resta.setPreferredSize(new Dimension(90,50));
  resta.setFont(new Font("Tahoma",Font.PLAIN,30));
  btn1.setPreferredSize(new Dimension(90,50));
  btn1.setFont(new Font("Tahoma",Font.PLAIN,30));
  btn2.setPreferredSize(new Dimension(90,50));
  btn2.setFont(new Font("Tahoma",Font.PLAIN,30));
  btn3.setPreferredSize(new Dimension(90,50));
  btn3.setFont(new Font("Tahoma",Font.PLAIN,30));
  multi.setPreferredSize(new Dimension(90,50));
  multi.setFont(new Font("Tahoma",Font.PLAIN,30));
  dec.setPreferredSize(new Dimension(90,50));
  dec.setFont(new Font("Tahoma",Font.PLAIN,30));
  btn0.setPreferredSize(new Dimension(185,50));
  btn0.setFont(new Font("Tahoma",Font.PLAIN,30));
  div.setPreferredSize(new Dimension(90,50));
  div.setFont(new Font("Tahoma",Font.PLAIN,30));
  
  /////////////////////EVENTOS///////////////////////////////////
  
  
  btn0.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tablero.setText(tablero.getText()+"0");
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
  
  btn1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tablero.setText(tablero.getText()+"1");
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
                tablero.setText(tablero.getText()+"2");
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
  
  btn3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tablero.setText(tablero.getText()+"3");
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
   
  btn4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tablero.setText(tablero.getText()+"4");
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
   
  btn5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tablero.setText(tablero.getText()+"5");
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
    
  btn6.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tablero.setText(tablero.getText()+"6");
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
      
  btn7.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tablero.setText(tablero.getText()+"7");
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
       
  btn8.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tablero.setText(tablero.getText()+"8");
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
  
  btn9.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tablero.setText(tablero.getText()+"9");
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
  
  dec.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                String cadena;
                cadena=tablero.getText();
                
                if(cadena.length()<=0)
                {
                    tablero.setText("0.");
                }
                else
                {
                    if(!existepunto(tablero.getText()))
                    {
                        tablero.setText(tablero.getText()+".");
                    }
                }
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
  
  resta.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) 
            {
                if(!tablero.getText().equals(""))
                {
                    numero1=tablero.getText();
                    signo="-";
                    tablero.setText("");
                }
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
  
  suma.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) 
            {
                if(!tablero.getText().equals(""))
                {
                    numero1=tablero.getText();
                    signo="+";
                    tablero.setText("");
                }
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
  
  multi.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) 
            {
                if(!tablero.getText().equals(""))
                {
                    numero1=tablero.getText();
                    signo="*";
                    tablero.setText("");
                }
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
  
  div.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) 
            {
                if(!tablero.getText().equals(""))
                {
                    numero1=tablero.getText();
                    signo="/";
                    tablero.setText("");
                }
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
  
  elevado.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) 
            {
                String resultado;
                if(!tablero.getText().equals(""))
                {
                    numero1=tablero.getText();
                    signo="^";
                    tablero.setText("");
                }
               
                resultado=calcula2(numero1,signo);
                tablero.setText(resultado);
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
  
  raiz.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) 
            {
                String resultado;
                if(!tablero.getText().equals(""))
                {
                    numero1=tablero.getText();
                    signo="√";
                    tablero.setText("");
                }
               
                resultado=calcula2(numero1,signo);
                tablero.setText(resultado);
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
  
  btnsen.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) 
            {
                String resultado;
                if(!tablero.getText().equals(""))
                {
                    numero1=tablero.getText();
                    signo="seno";
                    tablero.setText("");
                }
               
                resultado=calcula2(numero1,signo);
                tablero.setText(resultado);
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
  
  btncos.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) 
            {
                String resultado;
                if(!tablero.getText().equals(""))
                {
                    numero1=tablero.getText();
                    signo="coseno";
                    tablero.setText("");
                }
               
                resultado=calcula2(numero1,signo);
                tablero.setText(resultado);
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
  
  btntan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) 
            {
                String resultado;
                if(!tablero.getText().equals(""))
                {
                    numero1=tablero.getText();
                    signo="tan";
                    tablero.setText("");
                }
               
                resultado=calcula2(numero1,signo);
                tablero.setText(resultado);
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
  
  btnpi.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tablero.setText(tablero.getText()+"3.141592653589");
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
  
  log.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) 
            {
                if(!tablero.getText().equals(""))
                {
                    numero1=tablero.getText();
                    signo="log";
                    tablero.setText("");
                }
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
  //////////////////////////////////////////////////////////////////
  
  pn1.add(btnsen);
  pn1.add(btncos);
  pn1.add(btntan);
  pn1.add(raiz);
  pn1.add(elevado);
  pn1.add(log);
  pn1.add(btnpi);
  pn1.add(btn7);
  pn1.add(btn8);
  pn1.add(btn9);
  pn1.add(suma);
  pn1.add(btn4);
  pn1.add(btn5);
  pn1.add(btn6);
  pn1.add(resta);
  pn1.add(btn1);
  pn1.add(btn2);
  pn1.add(btn3);
  pn1.add(multi);
  pn1.add(dec);
  pn1.add(btn0);
  pn1.add(div);
  
  return pn1;   
 } 
 
 
 public Panel resultados()
 {
  Panel pn1=new Panel();
  Panel pn2=new Panel();
  Button igual=new Button("=");
  Button borrar=new Button("CE");
  Button C=new Button("C");
  BorderLayout layout1=new BorderLayout();
  FlowLayout layout2=new FlowLayout();
  
  pn1.setLayout(layout1);
  layout2.setHgap(5);
  layout2.setVgap(5);
  pn2.setLayout(layout2);
  igual.setPreferredSize(new Dimension(400,60));
  igual.setFont(new Font("Tahoma",Font.CENTER_BASELINE,30));
  igual.setBackground(Color.cyan);
  borrar.setPreferredSize(new Dimension(180,65));
  borrar.setFont(new Font("Tahoma",Font.CENTER_BASELINE,17));
  borrar.setBackground(Color.RED);
  borrar.setForeground(Color.WHITE);
  C.setPreferredSize(new Dimension(180,65));
  C.setFont(new Font("Tahoma",Font.CENTER_BASELINE,17));
  C.setBackground(Color.RED);
  C.setForeground(Color.WHITE);
  
  borrar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                tablero.setText("");
                
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
  
  igual.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) 
            {
                String resultado;
                numero2=tablero.getText();
                
                if(!numero2.equals(""))
                {
                 resultado=calcula(numero1,numero2,signo);
                 tablero.setText(resultado);
                }      
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
  
  C.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                String cadena;                                                  
                cadena=tablero.getText();                                      
                
                if(cadena.length()>0)                                           
                {
                    cadena=cadena.substring(0,cadena.length()-1);               
                    tablero.setText(cadena);                                  
                                                    
                }
                
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
  
  pn1.add(igual,"North");
  pn1.add(pn2,"South");
  pn2.add(borrar);
  pn2.add(C);
  return pn1;
 }  

public static boolean existepunto (String cadena)
{
 boolean resultado;
 resultado= false;
 for(int i =0; i<cadena.length();i++)
 {
  if(cadena.substring(i,i+1).equals(","))
  {
   resultado=true;
   break;
  }
 }
 return resultado;
}


public static String calcula(String numero1,String numero2,String signo)
{
 Double resultado=0.0;
 String respuesta;
 if(signo.equals("-"))
 {
  resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2);
 }
  if(signo.equals("+"))
 {
  resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
 }
  if(signo.equals("*"))
 {
  resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2);
 }
  if(signo.equals("/"))
 {
  resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2);
 }
  if(signo.equals("^"))
  {
   resultado = Double.parseDouble(numero1) * Double.parseDouble(numero1);
  }    
  
  if(signo.equals("log"))
  {
   resultado = Math.log(Double.parseDouble(numero1)) / Math.log(Double.parseDouble(numero2));
  }    
  respuesta = resultado.toString(); 
  return respuesta;
 }

public static String calcula2(String numero1,String signo)
{   
 Double resultado=0.0;
 String respuesta;
 
 if(signo.equals("^"))
  {
   resultado = Double.parseDouble(numero1) * Double.parseDouble(numero1);
  }    
 
 if(signo.equals("√"))
  {
   resultado = Math.sqrt(Double.parseDouble(numero1));
  }   

if(signo.equals("seno"))
  {
   resultado = Math.sin(Double.parseDouble(numero1));
  }    

if(signo.equals("coseno"))
  {
   resultado = Math.cos(Double.parseDouble(numero1));
  }    

if(signo.equals("tan"))
  {
   resultado = Math.tan(Double.parseDouble(numero1));
  }    
 
  respuesta = resultado.toString(); 
  return respuesta;
 }
}
