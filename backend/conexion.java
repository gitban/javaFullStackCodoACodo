import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    public static Connection conectarMySQL() {
    // Librería de MySQL
    //String driver = "com.mysql.jdbc.Driver";

    // Nombre de la base de datos
    String database = "consultorio_amado";

    // Host
    String hostname = "127.0.0.1";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    String ruta = "jdbc:mysql://" + hostname + ":3306/" + database;

    // Nombre de usuario
    String username = "root";

    // Clave de usuario
    String password = "";

        Connection conexion;
        System.out.println("Conectando.....");

        try {
            conexion = DriverManager.getConnection(ruta, username, password);
            System.out.println("Conexion exitosa!!!!!");

        } catch ( SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return  conexion;
    }
public static void main(String[] args) {
    Connection bd = conectarMySQL();
}
}
