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
        
        //Creacion de Componentes
        
        //Etiqueta
        JLabel etiqueta = new JLabel("¡Hola mundo!");
        etiqueta.setBounds(60,20,100,20);
        contentPane.add(etiqueta);
        
        //Campo de Texto
        JTextField textField = new JTextField();
        textField.setBounds(43,67,86,26);
        contentPane.add(textField);
        
        JButton btnPulsame = new JButton("Pulsame");
        btnPulsame.setBounds(43, 133, 89, 23);
        contentPane.add(btnPulsame);
        
        JRadioButton rdbtnOpcion = new JRadioButton("Opcion 1", true);
        rdbtnOpcion.setBounds(43, 194, 109, 23);
        contentPane.add(rdbtnOpcion);
        
    }
 
    public static void main(String[] args) {
        AplicacionGrafica ventana = new AplicacionGrafica();
    }
    
}
