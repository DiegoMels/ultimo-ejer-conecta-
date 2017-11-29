/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class Datos_Registro {
    
    private String nombre, apellido, calle, dni, altura;
 
    public Datos_Registro(String nombre, String apellido, String calle, String dni, String altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
        this.dni = dni;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }



    
}
