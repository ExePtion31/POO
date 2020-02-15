import java.awt.*;
import java.awt.event.*;

public class Principal 
{
    public static void main( String args[] ) 
       {
        IHM ihm = new IHM();
       }
 }

class IHM {
    public IHM() {
        Frame miFrame = new Frame( "Ejersicio en clase" );
        // Se instancia un objeto BorderLayout con una holgura en vertical y
        // horizontal de 3 pixels
        BorderLayout miBorderLayout = new BorderLayout( 3,3 );
        // Se fija este BorderLayout para que sea el controlador de
        // posicionamiento de componentes para el objeto Frame
        miFrame.setLayout( miBorderLayout );

        // Se instancian los objetos, para indicar los
        // posicionamientos del BorderLayout 
       
        Button boton2 = new Button( "NOMBRE" );
        Button boton4 = new Button( "APELLIDO" );
        Label label1 = new Label( "PRESIONE UNA TECLA" );

        // Se añaden los objetos al Frame en las mismas posiciones
        // que vienen dadas por las etiquetas que se les han asignado en
        // el constructor
    
        miFrame.add( boton2,"West" );
        miFrame.add( boton4,"East" );
        miFrame.add( label1,"Center" );
        miFrame.setSize( 400,400 ); ///Cambiar tamaño de la ventana Hori/vertica
        miFrame.setVisible( true );

        // Instancia un objeto receptor de eventos de tipo action y
        // lo registra para los objetos que se han añadido al
        // objeto Frame
        MiReceptorAction miReceptorAction = new MiReceptorAction( miBorderLayout,miFrame );
        boton2.addActionListener( miReceptorAction );
        boton4.addActionListener( miReceptorAction );
        

        // Se instancia y registra un receptor de eventos de ventana
        // para terminar la ejecucion del programa cuando se cierre
        // el Frame
        miFrame.addWindowListener( new Conclusion() );
        }
    }

class MiReceptorAction implements ActionListener{
    BorderLayout miObjBorderLayout;
    Frame miObjFrame;

    MiReceptorAction( BorderLayout layout,Frame frame ) {
        miObjBorderLayout = layout;
        miObjFrame = frame;
        }

    // Cuando sucede un evento Action, se incrementa el espacio que
    // que hay entre los componentes en el objeto BorderLayout.
    // Luego se fija el controlador de posicionamiento al nuevo
    // que se construye, y luego se valida el Frame para asegurar
    // que se actualiza en la pantalla
    public void actionPerformed( ActionEvent evt ) {
        miObjBorderLayout.setHgap( miObjBorderLayout.getHgap()+5 );
        miObjBorderLayout.setVgap( miObjBorderLayout.getVgap()+5 );    
        miObjFrame.setLayout( miObjBorderLayout );
        miObjFrame.validate();
        }
    }

class Conclusion extends WindowAdapter {
    public void windowClosing( WindowEvent evt ) {
        // Termina el programa cuando se cierra la ventana
        System.exit( 0 );
        }
    }