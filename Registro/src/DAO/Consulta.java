/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author alumno
 */
public class Consulta {
    ////////////////////////////////////////////////////////////////////////
    /////////////// NO ME TOMA LOS DATOS QUE CARGO /////////////////////////
    ////////////////////////////////////////////////////////////////////////
    
    //private Coneccion cnx;
   private Coneccion cnx;
   private ErrorSQL errorSQL = new ErrorSQL(); 
   PreparedStatement consulta;
   
   public void GrabarCalculo (String nombre, String apellido, String dni, String calle, String altura) throws SQLException, ClassNotFoundException{
       Coneccion conn = new Coneccion ("localhost", "root", "yosololase", "registro", errorSQL);
       conn.conectar();
       Connection cnx = conn.getCnx();
       if(cnx != null){
        try{
            consulta = cnx.prepareStatement("INSERT INTO datos (nombre, apellido, dni, calle, altura) VALUES(?, ?, ?, ?, ?)");
            consulta.setString(1, nombre);
            consulta.setString(2, apellido);
            consulta.setString(3, dni);
            consulta.setString(4, calle);
            consulta.setString(5, altura);
            System.out.println("dentro del TRY de Consulta");
            }catch(SQLException ex){
             System.out.println(ex.getMessage());
         }
            
       }else{
           System.out.println("NO conecto");
           System.out.println(errorSQL.getDetalle());
           System.out.println(errorSQL.getNroError());
       }
    }
   }

    /*public void GrabarCalculo(JTextField nombre, JTextField apellido, JTextField dni, JTextField calle, JTextField altura) throws SQLException, ClassNotFoundException {

       Coneccion conn = new Coneccion ("localhost", "root", "yosololase", "registro", errorSQL);
       conn.conectar();
       Connection cnx = conn.getCnx();
       if(cnx != null){
        try{
            consulta = cnx.prepareStatement("INSERT INTO datos (nombre, apellido, dni, calle, altura) VALUES(?, ?, ?, ?, ?)");
            consulta.setString(1, nombre.toString());
            consulta.setString(2, apellido.toString());
            consulta.setDouble(3, Double.valueOf(dni.toString()));
            consulta.setString(4, calle.toString());
            consulta.setDouble(5, Double.valueOf(altura.toString()));
            consulta.executeUpdate();
            
            }catch(SQLException ex){
             System.out.println(ex.getMessage());
         }
            
       }else{
           System.out.println("NO conecto");
           System.out.println(errorSQL.getDetalle());
           System.out.println(errorSQL.getNroError());
       }
    }*/

