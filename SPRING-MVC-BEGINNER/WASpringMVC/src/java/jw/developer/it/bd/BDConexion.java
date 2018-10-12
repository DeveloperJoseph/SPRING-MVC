package jw.developer.it.bd;

//librerias importadas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JOSEPH
 */
public class BDConexion {

    //constructor vacio
    public BDConexion() {
    }

    //atributos para establecer conexion
    private String url = "jdbc:sqlserver://localhost:1433;databaseName=bdnotas";
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String user = "sa";
    private String password = "whoami";

    Connection cnn = null;// conexion con un valor nulo

    //metodo Connection para establecer conexion con nuestro database 
    public Connection establecerConexion() {
        try {
            Class.forName(driver);//referencia al driver que utilizamos
            cnn = DriverManager.getConnection(url, user, password);//establecemos conexion con sql server(url,user,password)
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();//imprimir error por consola
        }
        System.out.println("conectado");
        return cnn;//retornando conexion establecida
    }

    //metodo Connection para cerrar conexion con nuestro database
    public void desconectarConexion() {
        try {
            cnn.close();//cerramos conexion
        } catch (SQLException e) {
            e.printStackTrace();//imprimir error por consola
        }
    }
}
