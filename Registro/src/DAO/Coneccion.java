package DAO;
import java.sql.*;

public class Coneccion {
   private Connection cnx = null;
   private String host, usu, clave, bd;
   private ErrorSQL errorSQL;
    public Coneccion(String host, String usu, String clave, String bd, ErrorSQL errorSQL) {
        this.host = host;
        this.usu = usu;
        this.clave = clave;
        this.bd = bd;
        this.errorSQL = errorSQL;
    }
    public Connection getCnx() {
        return cnx;
    }
   public void conectar() throws SQLException, ClassNotFoundException {
      if (cnx == null) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.bd, this.usu, this.clave);
         } catch (SQLException ex) {
            cnx = null;
            errorSQL.setNroError(ex.getErrorCode());
            errorSQL.setDetalle(ex.getMessage());
         } catch (ClassNotFoundException ex) {
            cnx = null;
         }
      }
      
   }
   public void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }    
}


/*package DAO;
import java.sql.*;

public class Coneccion {
   private Connection cnx = null;
   private String host, usu, clave, bd;
   private ErrorSQL errorSQL;
    public Coneccion(String host, String usu, String clave, String bd, ErrorSQL errorSQL) {
        this.host = host;
        this.usu = usu;
        this.clave = clave;
        this.bd = bd;
        this.errorSQL = errorSQL;
    }
    public Connection getCnx() {
        return cnx;
    }
   public void conectar() throws SQLException, ClassNotFoundException {
          if (cnx == null) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.bd, this.usu, this.clave);
         } catch (SQLException ex) {
            cnx = null;
            errorSQL.setNroError(ex.getErrorCode());
            errorSQL.setDetalle(ex.getMessage());
         } catch (ClassNotFoundException ex) {
            cnx = null;
         }
      }
      
   }
   public void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }   
}
*/