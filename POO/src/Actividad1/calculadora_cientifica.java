import java.awt.*;
import java.awt.event.*;

public class calculadora_cientifica extends Frame
{
    //Botones del 0 al 9
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    //Botones de .,, + , -  , * , / , = y borrar
    private Button bdec,bmas,bmenos,bpor,bdiv,bigual,bCE,bC;
    //Botones de coseno,seno,tangente,coseno-1,seno-1,tan-1
    private Button cos,sen,tan,cosn,senn,tann;
    //Botones ± , √ , % , 1⁄x , pi , e , n!
    private Button ms,ra,porc,ux,pi,e,n;
    //Botones x^-1, x^y, y√x, x^3, 3√x, x^2, 10^x, EXP, log
    private Button n1,n2,n3,n4,n5,n6,n7,n8,n9;
    //Botones D a B , B a D
    private Button deci,bina;
    //Pantalla
    private TextField pantalla,pantalla2;
    //Variables String
    String numero1,signo,numero2;
    
    public static void main(String[] args) 
    {
        calculadora_cientifica cal = new calculadora_cientifica();
        cal.primerpanel();
    }
    public void primerpanel()
    {
        Frame frame = new Frame ("Calculadora");                                //Nombre del Frame 
        frame.setSize(505,600);                                                 //Tamaño del Frame
        frame.setLocationRelativeTo(null);                                      //Se ubica el Frame en la mitad de la pantalla
        frame.setResizable(false);                                              //No se permite expandir la ventana
        
        frame.setLayout(new BorderLayout());
        
        
        frame.add(pantallas(),BorderLayout.NORTH);
        frame.add(teclado());                                                   //Se muestra todo lo que devuelbe el panel de teclado
        frame.setVisible(true);                                                 //Se hace visible la ventana
                
        frame.addWindowListener(new WindowAdapter()                             //Metodo para cerrar la ventana
        {
            public void windowClosing(WindowEvent windowEvent) 
            {
                System.exit(0);
            }
        });
    }
    public Panel pantallas()
    {
        Panel pa = new Panel();
        pa.setBackground(new Color(149,165,166));                               //Color del panel
        GridLayout layout = new GridLayout(1,1);
        layout.setHgap(0);                                                      //Se asigna un espacio horizontal entre botones
        layout.setVgap(0);
        
        pantalla2 = new TextField();                                            //Se crea el TextField de la pantalla
        pantalla2.setPreferredSize(new Dimension(480,25));                      //Dimenciones del TextField pantalla2
        pantalla2.setBackground(Color.WHITE);                                   //Color de la pantalla2
        //pantalla2.setFont(new Font("Arial", Font.BOLD, 40));                  //El tamaño de la letra y en negrilla
        pa.add(pantalla2);                                                      //Se ubica la pantalla en el norte
        
        pantalla = new TextField();                                             //Se crea el TextField de la pantalla
        pantalla.setPreferredSize(new Dimension(480,75));                       //Dimenciones del TextField pantalla
        pantalla.setBackground(Color.WHITE);                                    //Color de la pantalla
        pantalla.setFont(new Font("Arial", Font.BOLD, 40));                     //El tamaño de la letra y en negrilla
        pa.add(pantalla);                                                       //Se ubica la pantalla en el norte
        
        
        return pa;
    }
    public Panel teclado()
    {       
        b0 = new Button("0");                                   //boton 0
        b0.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        b0.setBackground((new Color(230,126,34)));              //Color del boton
        b1 = new Button("1");                                   //boton 1
        b1.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        b1.setBackground((new Color(230,126,34)));              //Color del boton
        b2 = new Button("2");                                   //boton 2
        b2.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        b2.setBackground((new Color(230,126,34)));              //Color del boton
        b3 = new Button("3");                                   //boton 3
        b3.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        b3.setBackground((new Color(230,126,34)));              //Color del boton
        b4 = new Button("4");                                   //boton 4
        b4.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        b4.setBackground((new Color(230,126,34)));              //Color del boton
        b5 = new Button("5");                                   //boton 5
        b5.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        b5.setBackground((new Color(230,126,34)));              //Color del boton
        b6 = new Button("6");                                   //boton 6
        b6.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        b6.setBackground((new Color(230,126,34)));              //Color del boton
        b7 = new Button("7");                                   //boton 7
        b7.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        b7.setBackground((new Color(230,126,34)));              //Color del boton
        b8 = new Button("8");                                   //boton 8
        b8.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        b8.setBackground((new Color(230,126,34)));              //Color del boton
        b9 = new Button("9");                                   //boton 9
        b9.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        b9.setBackground((new Color(230,126,34)));              //Color del boton
        bCE = new Button("CE");                                 //boton borrar
        bCE.setFont(new Font("Arial", Font.BOLD, 15));          //Tipo de letra Arial en negrilla y tamaño 15
        bCE.setBackground((new Color(22,160,133)));             //Color del boton
        bC = new Button("C");                                   //boton borrar uno
        bC.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        bC.setBackground((new Color(22,160,133)));              //Color del boton
        cos = new Button("Cos");                                //boton borrar uno
        cos.setFont(new Font("Arial", Font.BOLD, 15));          //Tipo de letra Arial en negrilla y tamaño 15
        cos.setBackground((new Color(22,160,133)));             //Color del boton
        sen = new Button("Sen");                                //boton borrar uno
        sen.setFont(new Font("Arial", Font.BOLD, 15));          //Tipo de letra Arial en negrilla y tamaño 15
        sen.setBackground((new Color(22,160,133)));             //Color del boton
        tan = new Button("Tan");                                //boton borrar uno
        tan.setFont(new Font("Arial", Font.BOLD, 15));          //Tipo de letra Arial en negrilla y tamaño 15
        tan.setBackground((new Color(22,160,133)));             //Color del boton
        cosn = new Button("Cos-1");                             //boton borrar uno
        cosn.setFont(new Font("Arial", Font.BOLD, 15));         //Tipo de letra Arial en negrilla y tamaño 15
        cosn.setBackground((new Color(22,160,133)));            //Color del boton
        senn = new Button("sen-1");                             //boton borrar uno
        senn.setFont(new Font("Arial", Font.BOLD, 15));         //Tipo de letra Arial en negrilla y tamaño 15
        senn.setBackground((new Color(22,160,133)));            //Color del boton
        tann = new Button("Tan-1");                             //boton borrar uno
        tann.setFont(new Font("Arial", Font.BOLD, 15));         //Tipo de letra Arial en negrilla y tamaño 15
        tann.setBackground((new Color(22,160,133)));            //Color del boton
        ms = new Button("±");                                   //boton borrar uno
        ms.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        ms.setBackground((new Color(22,160,133)));              //Color del boton
        ra = new Button("√");                                   //boton borrar uno
        ra.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        ra.setBackground((new Color(22,160,133)));              //Color del boton
        porc = new Button("%");                                 //boton borrar uno
        porc.setFont(new Font("Arial", Font.BOLD, 15));         //Tipo de letra Arial en negrilla y tamaño 15
        porc.setBackground((new Color(22,160,133)));            //Color del boton
        ux = new Button("1/x");                                 //boton borrar uno
        ux.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        ux.setBackground((new Color(22,160,133)));              //Color del boton
        pi = new Button("Pi");                                  //boton borrar uno
        pi.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        pi.setBackground((new Color(22,160,133)));              //Color del boton
        pi.setForeground(Color.BLUE);                           //se pone en color azul
        e = new Button("e");                                    //boton borrar uno
        e.setFont(new Font("Arial", Font.BOLD, 15));            //Tipo de letra Arial en negrilla y tamaño 15
        e.setBackground((new Color(22,160,133)));               //Color del boton
        e.setForeground(Color.BLUE);                            //se pone en color azul
        n = new Button("n!");                                   //boton borrar uno
        n.setFont(new Font("Arial", Font.BOLD, 15));            //Tipo de letra Arial en negrilla y tamaño 15
        n.setBackground((new Color(22,160,133)));               //Color del boton
        n.setForeground(Color.BLUE);                            //se pone en color azul
        n1 = new Button("x^-1");                                //boton borrar uno
        n1.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        n1.setBackground((new Color(22,160,133)));              //Color del boton
        n2 = new Button("x^y");                                 //boton borrar uno
        n2.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        n2.setBackground((new Color(22,160,133)));              //Color del boton
        n3 = new Button("x√y");                                 //boton borrar uno
        n3.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        n3.setBackground((new Color(22,160,133)));              //Color del boton
        n4 = new Button("x^3");                                 //boton borrar uno
        n4.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        n4.setBackground((new Color(22,160,133)));              //Color del boton
        n5 = new Button("3√x");                                 //boton borrar uno
        n5.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        n5.setBackground((new Color(22,160,133)));              //Color del boton
        n6 = new Button("x^2");                                 //boton borrar uno
        n6.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        n6.setBackground((new Color(22,160,133)));              //Color del boton
        n7 = new Button("x^10");                                //boton borrar uno
        n7.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        n7.setBackground((new Color(22,160,133)));              //Color del boton
        n8 = new Button("log");                                 //boton borrar uno
        n8.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        n8.setBackground((new Color(22,160,133)));              //Color del boton
        n9 = new Button("ln");                                  //boton borrar uno
        n9.setFont(new Font("Arial", Font.BOLD, 15));           //Tipo de letra Arial en negrilla y tamaño 15
        n9.setBackground((new Color(22,160,133)));              //Color del boton
        deci = new Button("D a B");                                //boton borrar uno
        deci.setFont(new Font("Arial", Font.BOLD, 15));        //Tipo de letra Arial en negrilla y tamaño 15
        deci.setForeground(Color.red);                         //se pone en color rojo
        bina = new Button("B a D");                                //boton borrar uno
        bina.setFont(new Font("Arial", Font.BOLD, 15));        //Tipo de letra Arial en negrilla y tamaño 15
        bina.setForeground(Color.red);                         //se pone en color rojo
        bdec = new Button(".");                                 //boton .
        bdec.setFont(new Font("Arial", Font.BOLD, 20));         //Tipo de letra Arial en negrilla y tamaño 15
        bdec.setForeground(Color.blue);                         //se pone en color azul
        bdec.setBackground((new Color(230,126,34)));            //Color del boton
        bmas = new Button("+");                                 //boton +
        bmas.setFont(new Font("Arial", Font.BOLD, 20));         //Tipo de letra Arial en negrilla y tamaño 15 
        bmas.setBackground((new Color(22,160,133)));            //Color del boton
        bmas.setForeground(Color.blue);                         //se pone en color azul
        bmenos = new Button("-");                               //boton -
        bmenos.setFont(new Font("Arial", Font.BOLD, 20));       //Tipo de letra Arial en negrilla y tamaño 15
        bmenos.setForeground(Color.blue);                       //se pone en color azul
        bmenos.setBackground((new Color(22,160,133)));          //Color del boton
        bpor = new Button("*");                                 //boton *
        bpor.setFont(new Font("Arial", Font.BOLD, 20));         //Tipo de letra Arial en negrilla y tamaño 15
        bpor.setForeground(Color.blue);                         //se pone en color azul
        bpor.setBackground((new Color(22,160,133)));            //Color del boton
        bdiv = new Button("/");                                 //boton /
        bdiv.setFont(new Font("Arial", Font.BOLD, 20));         //Tipo de letra Arial en negrilla y tamaño 15
        bdiv.setForeground(Color.blue);                         //se pone en color azul
        bdiv.setBackground((new Color(22,160,133)));            //Color del boton
        bigual = new Button("=");                               //boton =
        bigual.setFont(new Font("Arial", Font.BOLD, 20));       //Tipo de letra Arial en negrilla y tamaño 15
        bigual.setForeground(Color.blue);                       //se pone en color azul
        bigual.setBackground((new Color(22,160,133)));          //Color del boton
        
        Panel p = new Panel();
        p.setBackground(new Color(149,165,166));                                //Color del panel
        GridLayout layout = new GridLayout(6,7);
        layout.setHgap(5);                                                      //Se asigna un espacio horizontal entre botones
        layout.setVgap(7);                                                      //Se asigna un espacio vertical entre botones

        p.setLayout(layout);
        b0.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                pantalla.setText(pantalla.getText()+"0");                       //A la pantalla se le muestra el mumero 0
                pantalla2.setText(pantalla2.getText()+"0");                     //A la pantalla2 se le muestra el mumero 0
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        b1.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                pantalla.setText(pantalla.getText()+"1");                       //A la pantalla se le muestra el mumero 1
                pantalla2.setText(pantalla2.getText()+"1");                     //A la pantalla2 se le muestra el mumero 1
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        b2.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                pantalla.setText(pantalla.getText()+"2");                       //A la pantalla se le muestra el mumero 2
                pantalla2.setText(pantalla2.getText()+"2");                     //A la pantalla2 se le muestra el mumero 2
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        b3.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                pantalla.setText(pantalla.getText()+"3");                       //A la pantalla se le muestra el mumero 3
                pantalla2.setText(pantalla2.getText()+"3");                     //A la pantalla2 se le muestra el mumero 3
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        b4.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                pantalla.setText(pantalla.getText()+"4");                       //A la pantalla se le muestra el mumero 4
                pantalla2.setText(pantalla2.getText()+"4");                     //A la pantalla2 se le muestra el mumero 4
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        b5.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                pantalla.setText(pantalla.getText()+"5");                       //A la pantalla se le muestra el mumero 5
                pantalla2.setText(pantalla2.getText()+"5");                     //A la pantalla2 se le muestra el mumero 5
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        b6.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                pantalla.setText(pantalla.getText()+"6");                       //A la pantalla se le muestra el mumero 6
                pantalla2.setText(pantalla2.getText()+"6");                     //A la pantalla2 se le muestra el mumero 6
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        b7.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                pantalla.setText(pantalla.getText()+"7");                       //A la pantalla se le muestra el mumero 7
                pantalla2.setText(pantalla2.getText()+"7");                     //A la pantalla2 se le muestra el mumero 7
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        b8.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                pantalla.setText(pantalla.getText()+"8");                       //A la pantalla se le muestra el mumero 8
                pantalla2.setText(pantalla2.getText()+"8");                     //A la pantalla2 se le muestra el mumero 8
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        b9.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                pantalla.setText(pantalla.getText()+"9");                       //A la pantalla se le muestra el mumero 9
                pantalla2.setText(pantalla2.getText()+"9");                     //A la pantalla2 se le muestra el mumero 9
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        bdec.addMouseListener(new MouseListener()                               //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                String cadena;                                                  //Se crea una variable de tipo String
                cadena=pantalla.getText();                                      //Se inicializa la varible con todo lo que tenga la pantalla
                
                if(cadena.length()<=0)                                          //Condicion de que la pantalla no este vacia
                {
                    pantalla.setText("0.");                                     //En caso de que la pantalla este vacia se le agrega un 0.
                    pantalla2.setText("0.");                                    //En caso de que la pantalla este vacia se le agrega un 0.
                }
                else
                {
                    if(!existepunto(pantalla.getText()))                        //Se envia lo que tenga la pantalla al metodo de existepunto
                    {
                        pantalla.setText(pantalla.getText()+".");               //A la pantalla se le muestra el .
                        pantalla2.setText(pantalla2.getText()+".");             //A la pantalla se le muestra el .
                    }
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        bCE.addMouseListener(new MouseListener()                                //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                pantalla.setText("");                                           //A la pantalla se le muestra un vacio
                pantalla2.setText("");                                          //A la pantalla se le muestra un vacio
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        bC.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                String cadena;                                                  //Se crea una variable de tipo String
                cadena=pantalla.getText();                                      //La cadena es igual a lo que tiene la pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacia
                {
                    cadena=cadena.substring(0,cadena.length()-1);               //La cadena va ha ser igual a lo que tiene la pantalla -1
                    pantalla.setText(cadena);                                   //Se muestra en pantalla el resultado de la cadena
                    pantalla2.setText(cadena);                                  //Se muestra en pantalla el resultado de la cadena
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        ux.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                String cadena;                                                  //Se crea una variable de tipo String
                cadena=pantalla.getText();                                      //La cadena es igual a lo que tiene la pantalla
                Double num;                                                     //Se crea una variable Double
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacia
                {
                    num=1/Double.parseDouble(cadena);                           //La variable num es igual a 1/ El valor de la cadena en Double
                    pantalla.setText(num.toString());                           //En la pantalla se muestra la cadena
                    pantalla2.setText(num.toString());                          //En la pantalla se muestra la cadena
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        ms.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                String cadena;                                                  //Se crea una variable de tipo String
                cadena=pantalla.getText();                                      //La cadena es igual a lo que tiene la pantalla
                Double num;                                                     //Se crea una variable Double
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacia
                {
                    num=(-1)*Double.parseDouble(cadena);                        //Se multiplica el valor de la cadena por -1
                    pantalla.setText(num.toString());                           //En la pantalla se muestra la cadena
                    pantalla2.setText(num.toString());                          //En la pantalla se muestra la cadena
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });        
        bmenos.addMouseListener(new MouseListener()                             //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if(!pantalla.getText().equals(""))                              //Condicion de que la pantalla no este vacia
                {
                    numero1=pantalla.getText();                                 //Se lee lo que esta en la pantalla y se lo asigna a la varible numero1
                    signo="-";                                                  //Se le asigna el signo - a la variable signo
                    pantalla2.setText(numero1+" - ");                           //Se le asigna a la pantalla2 el numero1 mas el signo
                    pantalla.setText("");                                       //Se le asigna un nuevo espacio vacio a la pantalla
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        bmas.addMouseListener(new MouseListener()                               //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if(!pantalla.getText().equals(""))                              //Condicion de que la pantalla no este vacia
                {
                    numero1=pantalla.getText();                                 //Se lee lo que esta en la pantalla y se lo asigna a la varible numero2
                    signo="+";                                                  //Se le asigna el signo + a la variable signo
                    pantalla2.setText(numero1+" + ");                           //Se le asigna a la pantalla2 el numero1 mas el signo
                    pantalla.setText("");                                       //Se le asigna un nuevo espacio vacio a la pantalla
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        bpor.addMouseListener(new MouseListener()                               //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if(!pantalla.getText().equals(""))                              //Condicion de que la pantalla no este vacia
                {
                    numero1=pantalla.getText();                                 //Se lee lo que esta en la pantalla y se lo asigna a la varible numero2
                    signo="*";                                                  //Se le asigna el signo * a la variable signo
                    pantalla2.setText(numero1+" * ");                           //Se le asigna a la pantalla2 el numero1 mas el signo
                    pantalla.setText("");                                       //Se le asigna un nuevo espacio vacio a la pantalla
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        bdiv.addMouseListener(new MouseListener()                               //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if(!pantalla.getText().equals(""))                              //Condicion de que la pantalla no este vacia
                {
                    numero1=pantalla.getText();                                 //Se lee lo que esta en la pantalla y se lo asigna a la varible numero2
                    signo="/";                                                  //Se le asigna el signo / a la variable signo
                    pantalla2.setText(numero1+" / ");                           //Se le asigna a la pantalla2 el numero1 mas el signo
                    pantalla.setText("");                                       //Se le asigna un nuevo espacio vacio a la pantalla
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        porc.addMouseListener(new MouseListener()                               //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if(!pantalla.getText().equals(""))                              //Condicion de que la pantalla no este vacia
                {
                    numero1=pantalla.getText();                                 //Se lee lo que esta en la pantalla y se lo asigna a la varible numero2
                    signo="%";                                                  //Se le asigna el signo % a la variable signo
                    pantalla2.setText(numero1+" * % ");                         //Se le asigna a la pantalla2 el numero1 mas el signo
                    pantalla.setText("");                                       //Se le asigna un nuevo espacio vacio a la pantalla
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        n.addMouseListener(new MouseListener()                                  //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=Double.parseDouble(pantalla.getText());        //Se crea una variable y se le asigna lo que tiene la pantalla
                pantalla2.setText("Factorial: "+resultado);                     //Pantalla2 se le asigna el resultado
                
                double factorial=1;                                             //Se crea una variable de tipo double
                while(resultado!=0)                                             //Se crea un ciclo donde el (resultado debe ser distinto de 0)
                {
                    factorial=factorial*resultado;                              //La variable factorial por el resultado
                    resultado--;                                                //resultado--
                }
                pantalla.setText(String.valueOf(factorial));                    //A la pantalla se le devuelve la representación de cadena del doble argumento.
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        n1.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //La variable cadena va ha ser igual a lo que tiene la pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacia
                {
                    resultado=Math.pow(Double.parseDouble(cadena),(-1));        //La variable resultado va ha ser igual a la cadena elevada a la (-1)
                    pantalla2.setText(cadena+" ^(-1)");                         //A la pantalla se le asigna el valor de la cadena elevada a la (-1)
                    pantalla.setText(resultado.toString());                     //A la pantalla se le asigna el resultado y se combierte a tipo String
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        n2.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if(!pantalla.getText().equals(""))                              //Condicion de que la pantalla no este vacia
                {
                    numero1=pantalla.getText();                                 //Se lee lo que esta en la pantalla y se lo asigna a la varible numero2
                    signo="x^y";                                                //Se le asigna el signo * a la variable signo
                    pantalla2.setText(numero1+" ^ ");                           //Se le asigna a la pantalla2 el numero1 mas el signo
                    pantalla.setText("");                                       //Se le asigna un nuevo espacio vacio a la pantalla
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        n3.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                if(!pantalla.getText().equals(""))                              //Condicion de que la pantalla no este vacia
                {
                    numero1=pantalla.getText();                                 //Se lee lo que esta en la pantalla y se lo asigna a la varible numero2
                    signo="x√y";                                                //Se le asigna el signo * a la variable signo
                    pantalla2.setText(numero1+" √ ");                           //Se le asigna a la pantalla2 el numero1 mas el signo √
                    pantalla.setText("");                                       //Se le asigna un nuevo espacio vacio a la pantalla
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        n4.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //A la cadena se le asigna lo que tiene la pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacia
                {
                    resultado=Math.pow(Double.parseDouble(cadena),3);           //Resultado es igual al mumero el pa pantalla elevado a la 3
                    pantalla2.setText(cadena+" ^3");                            //A la pantalla2 se le asigna la cadena mas el elevado a la 3
                    pantalla.setText(resultado.toString());                     //A la pantalla se le asigna el resultado
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        n5.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //A la variable cadena se le asigna lo que tiene pa pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacia
                {
                    resultado=Math.pow(Double.parseDouble(cadena),1.0/3.0);     //resultado es igual a la cadena elevada a la 1/3
                    pantalla2.setText(" 3√ "+cadena);                           //A la pantalla2 se le asigna el 3√ mas la cadena
                    pantalla.setText(resultado.toString());                     //A la pantalla se le asigna el resultado
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        n6.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //A la cadena se le asigna lo que tiene la pantalla
                
                if(cadena.length()>0)                                           //condicion de que la cadena no este vacia
                {
                    resultado=Math.pow(Double.parseDouble(cadena),2);           //resultado es igual a la cadena elevada s la 2
                    pantalla2.setText(cadena+" ^2");                            //A la pantalla2 se le asigna la cadema mas el elevado a la 2
                    pantalla.setText(resultado.toString());                     //A la pantalla se le muestra el resultado
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        n7.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //A la cadena se le asigna lo que tiene la pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacia
                {
                    resultado=Math.pow(Double.parseDouble(cadena),10);          //Resultado es igual a la cadena elevado al exponente 10
                    pantalla2.setText(cadena+" ^10");                           //A la pantalla2 se le asigna la cadena mas el elevado al exponete 10
                    pantalla.setText(resultado.toString());                     //A la pantalla se le asigna el resultado
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        n8.addMouseListener(new MouseListener()                                //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //A la variable cadena de le asigma lo que esta en la pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacio
                {
                    resultado=Math.log10(Double.parseDouble(cadena));             //El resultado en igual a Math.sin(numero ingresado en la pantalla)
                    pantalla2.setText("Log "+"("+cadena+")");                   //En la pantalla2 se muestra (Log + numero ingresado)
                    pantalla.setText(resultado.toString());                     //En la pantalla se muesta el resulatado en radianes
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        n9.addMouseListener(new MouseListener()                                //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //A la variable cadena de le asigma lo que esta en la pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacio
                {
                    resultado=Math.log(Double.parseDouble(cadena));             //El resultado en igual a Math.sin(numero ingresado en la pantalla)
                    pantalla2.setText("Ln "+"("+cadena+")");                    //En la pantalla2 se muestra (Ln + numero ingresado)
                    pantalla.setText(resultado.toString());                     //En la pantalla se muesta el resulatado en radianes
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        sen.addMouseListener(new MouseListener()                                //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //A la variable cadena de le asigma lo que esta en la pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacio
                {
                    resultado=Math.sin(Double.parseDouble(cadena));             //El resultado en igual a Math.sin(numero ingresado en la pantalla)
                    pantalla2.setText("Sen "+"("+cadena+")");                   //En la pantalla2 se muestra (Sen + numero ingresado)
                    pantalla.setText(resultado.toString());                     //En la pantalla se muesta el resulatado en radianes
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        cos.addMouseListener(new MouseListener()                                //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //A la variable cadena de le asigma lo que esta en la pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacio
                {
                    resultado=Math.cos(Double.parseDouble(cadena));             //El resultado en igual a Math.cos(numero ingresado en la pantalla)
                    pantalla2.setText("Cos "+"("+cadena+")");                   //En la pantalla2 se muestra (Cos + numero ingresado)
                    pantalla.setText(resultado.toString());                     //En la pantalla se muesta el resulatado en radianes
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        tan.addMouseListener(new MouseListener()                                //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //A la variable cadena de le asigma lo que esta en la pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacio
                {
                    resultado=Math.tan(Double.parseDouble(cadena));             //El resultado en igual a Math.tan(numero ingresado en la pantalla)
                    pantalla2.setText("Tan "+"("+cadena+")");                   //En la pantalla2 se muestra (Tan + numero ingresado)
                    pantalla.setText(resultado.toString());                     //En la pantalla se muesta el resulatado en radianes
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        senn.addMouseListener(new MouseListener()                                //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //A la variable cadena de le asigma lo que esta en la pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacio
                {
                    resultado=Math.asin(Double.parseDouble(cadena));            //El resultado en igual a Math.asin(numero ingresado en la pantalla)
                    pantalla2.setText("Sen^-1 "+"("+cadena+")");                //En la pantalla2 se muestra (Sen^-1 + numero ingresado)
                    pantalla.setText(resultado.toString());                     //En la pantalla se muesta el resulatado en radianes
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        cosn.addMouseListener(new MouseListener()                                //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //A la variable cadena de le asigma lo que esta en la pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacio
                {
                    resultado=Math.acos(Double.parseDouble(cadena));            //El resultado en igual a Math.acos(numero ingresado en la pantalla)
                    pantalla2.setText("Cos^-1 "+"("+cadena+")");                //En la pantalla2 se muestra (Cos^-1 + numero ingresado)
                    pantalla.setText(resultado.toString());                     //En la pantalla se muesta el resulatado en radianes
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        tann.addMouseListener(new MouseListener()                                //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //A la variable cadena de le asigma lo que esta en la pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacio
                {
                    resultado=Math.atan(Double.parseDouble(cadena));            //El resultado en igual a Math.atan(numero ingresado en la pantalla)
                    pantalla2.setText("Tan^-1 "+"("+cadena+")");                //En la pantalla2 se muestra (Tan^-1 + numero ingresado)
                    pantalla.setText(resultado.toString());                     //En la pantalla se muesta el resulatado en radianes
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        ra.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Double resultado=0.0;                                           //Se crea una variable de tipo Double
                String cadena;                                                  //Se crea una variable de tipo String
                cadena = pantalla.getText();                                    //A la variable cadena se le asigna lo que esta es la pantalla
                
                if(cadena.length()>0)                                           //Condicion de que la cadena no este vacia
                {
                    resultado=Math.sqrt(Double.parseDouble(cadena));            //resultado es igual a la raiz cuadrada de la cadena
                    pantalla2.setText("√"+cadena);                              //A la pantalla2 se le asigna el √ mas la cadena
                    pantalla.setText(resultado.toString());                     //A la pantalla se le asigna el resultado
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        e.addMouseListener(new MouseListener()                                  //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                pantalla2.setText("e");                                         //A la pantalla2 se le asigna la e
                pantalla.setText(Math.E+"");                                    //A la pantalla se le asigna la operacion Math.E mas una cadena vacia
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        pi.addMouseListener(new MouseListener()                                 //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                pantalla2.setText("pi");                                        //A la pantalla2 Se le asigna el pi
                pantalla.setText(Math.PI+"");                                   //A la pantalla se le asigna la operacion Math.PI mas una cadena vacia
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });        
        bigual.addMouseListener(new MouseListener()                             //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                String resultado;                                               //Se crea una variable de tipo String
                numero2=pantalla.getText();                                     //El valor de la variable numero2 es lo que se escribe despues de haber oprimido el signo
                
                if(!numero2.equals(""))                                         //Condicion de que la pantalla no este vacia
                {
                    resultado=calcula(numero1,numero2,signo);                   //Se envia el (numero1,numero2 y el signo) al metodo de calcula
                    pantalla.setText(resultado);                                //Se muestra en la pantalla el resultado del metodo calcula
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        deci.addMouseListener(new MouseListener()                             //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                int decimal,ho,modulo;
                String binario="";
                decimal=Integer.parseInt(pantalla.getText());
                ho=decimal;
                
                while(decimal>0)
                {
                    modulo=(decimal%2);
                    binario=modulo+binario;
                    decimal=decimal/2;
                }
                pantalla.setText("Decinal ("+ho+") = "+binario+" ");
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        bina.addMouseListener(new MouseListener()                             //Se crea el metodo para escuchar el mouse 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                String bin = pantalla.getText();
                int num = Integer.parseInt(bin,2);
                
                if(bin.length()>0)
                {
                    pantalla.setText("Binario ("+bin+") = "+num+" ");
                }
            }
            @Override public void mousePressed(MouseEvent e) {} @Override public void mouseReleased(MouseEvent e) {}@Override public void mouseEntered(MouseEvent e) {}@Override public void mouseExited(MouseEvent e) {}
        });
        
        
        p.add(sen);                                                             //Se muestra el boton sen
        p.add(cos);                                                             //Se muestra el boton cos
        p.add(tan);                                                             //Se muestra el boton tan
        p.add(ms);                                                              //Se muestra el boton ±
        p.add(ra);                                                              //Se muestra el boton √
        p.add(porc);                                                            //Se muestra el boton %
        p.add(ux);                                                              //Se muestra el boton 1/x
        
        p.add(senn);                                                            //Se muestra el boton sen-1
        p.add(cosn);                                                            //Se muestra el boton cos-1
        p.add(tann);                                                            //Se muestra el boton tan-1
        p.add(b7);                                                              //Se muestra el boton 7
        p.add(b8);                                                              //Se muestra el boton 8
        p.add(b9);                                                              //Se muestra el boton 9
        p.add(bdiv);                                                            //Se muestra el boton /
        
        
        p.add(pi);                                                              //Se muestra el boton Pi
        p.add(n1);                                                              //Se muestra el boton x^-1
        p.add(n2);                                                              //Se muestra el boton x^y
        p.add(b4);                                                              //Se muestra el boton 4
        p.add(b5);                                                              //Se muestra el boton 5
        p.add(b6);                                                              //Se muestra el boton 6
        p.add(bpor);                                                            //Se muestra el boton *
        
        p.add(e);                                                               //Se muestra el boton e
        p.add(n3);                                                              //Se muestra el boton y√x
        p.add(n4);                                                              //Se muestra el boton x^3
        p.add(b1);                                                              //Se muestra el boton 1
        p.add(b2);                                                              //Se muestra el boton 2
        p.add(b3);                                                              //Se muestra el boton 3
        p.add(bmenos);                                                          //Se muestra el boton -
        
        p.add(n);                                                               //Se muestra el boton n!
        p.add(n5);                                                              //Se muestra el boton 3√x
        p.add(n6);                                                              //Se muestra el boton x^2
        p.add(bdec);                                                            //Se muestra el boton .
        p.add(b0);                                                              //Se muestra el boton 0
        p.add(bigual);                                                          //Se muestra el boton =
        p.add(bmas);                                                            //Se muestra el boton +
        
        p.add(n7);                                                              //Se muestra el boton 10^x
        p.add(n8);                                                              //Se muestra el boton EXP
        p.add(n9);                                                              //Se muestra el boton log
        p.add(deci);                                                           //Se muestra el boton (
        p.add(bina);                                                           //Se muestra el boton )
        p.add(bCE);                                                             //Se muestra el boton borrar todo
        p.add(bC);                                                              //Se muestra el boton borrar uno
                
        return p;                                                               //Se retorna todo al Frame
    }
    public static boolean existepunto (String cadena)                           //Metodo de existepunto de tipo boolean
    {
        boolean resultado;                                                      //Se crea una variable de tipo boolean
        resultado= false;                                                       //Se inicializa la variable el falsa
        for(int i =0; i<cadena.length();i++)                                    //Una ciclo for(Se crea una variable entera y se inicializa en cero; Va hasta cuando
        {                                                                       //la varible sea menor que la longitud de la cadena; y la recorre de uno en uno
            if(cadena.substring(i,i+1).equals("."))                             //Condición hasta que la cadena tenga un .
            {
                resultado=true;                                                 //Se iguala la variable en verdadero
                break;                                                          //Termina el proceso cuando encuentre un .
            }
        }
        return resultado;                                                       //Devuelbe el resultado
    }
    public static String calcula(String numero1,String numero2,String signo)    //Metodo de calcula de tipo String resiviendo a (numero1,numero2,signo)
    {
        Double resultado=0.0;
        String respuesta;                                                       //Se crea una variable de tipo String
        
        if(signo.equals("-"))                                                       //Si se oprime el boton -
        {
            resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2);
        }
        if(signo.equals("+"))                                                       //Si se oprime el boton +
        {
            resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
        }
        if(signo.equals("*"))                                                       //Si se oprime el boton *
        {
            resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2);
        }
        if(signo.equals("/"))                                                       //Si se oprime el boton /
        {
            resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2);
        }
        if(signo.equals("%"))                                                       //Si se oprime el boton %
        {
            resultado = (Double.parseDouble(numero1)/100) * Double.parseDouble(numero2);
        }
        if(signo.equals("x^y"))                                                     //Si se oprime el boton x^y
        {
            resultado = Math.pow(Double.parseDouble(numero1), Double.parseDouble(numero2));
        }
        if(signo.equals("x√y"))                                                     //Si se oprime el boton x√y
        {
            resultado = Math.pow(Double.parseDouble(numero2),1.0/Double.parseDouble(numero1));
        }
        if(signo.equals("pi"))                                                      //Si se oprime en boton pi
        {
            if(signo.equals("-"))                                                       //Si se oprime el boton -
            {
                resultado = Math.PI-(Double.parseDouble(numero1));
            }
            if(signo.equals("+"))                                                       //Si se oprime el boton +
            {
                resultado = Math.PI+(Double.parseDouble(numero1));
            }
            if(signo.equals("*"))                                                       //Si se oprime el boton *
            {
                resultado = Math.PI*(Double.parseDouble(numero1));
            }
            if(signo.equals("/"))                                                       //Si se oprime el boton /
            {
                resultado = Math.PI/(Double.parseDouble(numero1));
            }
        }
        if(signo.equals("e"))                                                       //Si se oprime en boton e
        {
            if(signo.equals("-"))                                                       //Si se oprime el boton -
            {
                resultado = Math.E-(Double.parseDouble(numero1));
            }
            if(signo.equals("+"))                                                       //Si se oprime el boton +
            {
                resultado = Math.E+(Double.parseDouble(numero1));
            }
            if(signo.equals("*"))                                                       //Si se oprime el boton *
            {
                resultado = Math.E*(Double.parseDouble(numero1));
            }
            if(signo.equals("/"))                                                       //Si se oprime el boton /
            {
                resultado = Math.E/(Double.parseDouble(numero1));
            }
        }
        respuesta = resultado.toString();                                           //Se almacena el resultado el la variable de tipo String
        return respuesta;                                                           //Se retorna la respuesta
    }
}