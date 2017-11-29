package Controladores;

import DAO.Consulta;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import principal.Datos_Registro;

public class ControladorGuardar implements MouseListener  {
    private JTextField nombre, apellido, dni, calle, altura;
    Consulta consulta;
    
    
    public ControladorGuardar(JTextField txtNombre, JTextField txtApellido, JTextField txtDni, JTextField txtCalle, JTextField txtAltura) {
        
        this.nombre = txtNombre;
        this.apellido = txtApellido;
        this.dni = txtDni;
        this.calle = txtCalle;
        this.altura = txtAltura;
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        try {
            consulta = new Consulta();
            
            consulta.GrabarCalculo(nombre.getText(), apellido.getText(), dni.getText(), calle.getText(), altura.getText());
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ControladorGuardar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorGuardar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         /*try {
            consultar = new Consulta();
            
            consultar.GrabarCalculo(nombre, apellido, dni, calle, altura);
            
            /*try {
            consultar.GrabarCalculo(nombre, apellido, dni, calle, altura);
            } catch (SQLException ex) {
            Logger.getLogger(ControladorGuardar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorGuardar.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            /*} catch (SQLException ex) {
            Logger.getLogger(ControladorGuardar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorGuardar.class.getName()).log(Level.SEVERE, null, ex);
            }*/
   
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
    
    
}
