package visual;

import Controladores.ControladorGuardar;
import Controladores.ControladorSalir;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ingreso_Datos extends JFrame {
    
        private GridLayout contenedor = new GridLayout(15,3);
        private JLabel lblNombre = new JLabel ("Nombre");
        private JTextField txtNombre = new JTextField ();
        private JLabel lblApellido = new JLabel ("Apellido");
        private JTextField txtApellido = new JTextField ();
        private JLabel lblDni = new JLabel ("DNI");
        private JTextField txtDni = new JTextField ();
        private JLabel lblCalle = new JLabel ("Calle");
        private JTextField txtCalle = new JTextField ();
        private JLabel lblAltura = new JLabel ("Altura");
        private JTextField txtAltura = new JTextField ();
        private JButton guardar = new JButton ("Guardar");
        private JButton salir = new JButton ("Salir");
        private ControladorGuardar controladorGuardar = new ControladorGuardar(txtNombre, txtApellido, txtDni, txtCalle, txtAltura);
        private ControladorSalir controladorSalir = new ControladorSalir();
        
 public Ingreso_Datos (){
     
        this.setLayout(contenedor);
        this.setTitle("Registro de Datos");
        this.setLocation(200,300);
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add (lblNombre);
        this.add (txtNombre);
        this.add (lblApellido);
        this.add (txtApellido);
        this.add (lblDni);
        this.add (txtDni);
        this.add (lblCalle);
        this.add (txtCalle);
        this.add (lblAltura);
        this.add (txtAltura);
        this.add (guardar);
        this.guardar.addMouseListener(controladorGuardar);
        this.add (salir);
        this.setVisible(true);
    
}
    
}
