package aplicaciongrafica;

import javax.swing.*;
/**
 *
 * @author Pablo
 */
public class AplicacionGrafica extends JFrame{
    
    private JPanel contentPane;
    public AplicacionGrafica(){
        
        //Añade un titulo, no es estrictamente necesario
        setTitle("Titulo de la ventana");
        
        /* Coordenadas x y de la aplicacion y su altura
        y longitud, si no lo indicamos aparecera una 
        ventana pequeña*/
        setBounds(400,200,607,448);
        
        /* indica que cuando se cierre la ventana se acaba la aplicacion 
        si no lo indicamos aparecera una ventana muy pequeña*/
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Hace visible la ventana, si  no lo hacemos no veremos la aplicacion
        setVisible(true);
        
        //Creamos el panel
        contentPane = new JPanel();
        
        //Indicamos su Diseño
        contentPane.setLayout(null);
        
        //Asigno el panel a la ventana
        setContentPane(contentPane);
    }
 
    public static void main(String[] args) {
        AplicacionGrafica ventana = new AplicacionGrafica();
    }
    
}
