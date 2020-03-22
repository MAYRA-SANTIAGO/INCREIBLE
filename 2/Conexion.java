
package Unidad2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * 
 */
public class Conexion {
   
    // carga la Librería de MySQL
    public String driver = "com.mysql.jdbc.Driver";
    // Nombre de la bd
    public String db = "isc";
    // Host localhsot 127.0.0.10
    public String hostname = "localhost";
    // Puerto
    public String port = "3306";
 // Nombre de usuario
    public String username = "root";

    // Clave de usuario
    public String password = "NATANAEL";

    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + db;

    private  Statement statement = null;
    
    
// metodo para la conexion a BD
    public Connection conectarMySQL(String consulta) {
       
        Connection conn = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("conexion exitosa");
            statement = conn.createStatement();
            statement.execute(consulta);
            System.out.println("Datos Insertados  ");
           
        } catch (ClassNotFoundException | SQLException e) {
            
        }

        return conn;

    }
}
