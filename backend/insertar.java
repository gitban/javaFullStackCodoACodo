
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class insertar {

    // Instancias la clase que hemos creado anteriormente
    private conexion SQL = new conexion();
    // Llamas al método que tiene la clase y te devuelve una conexión
    private Connection conn = SQL.conectarMySQL();
    // Query que usarás para hacer lo que necesites
    private String sSQL = "SELECT * FROM pacientes";
    // PreparedStatement

    public List<String[]> mostrarDatos() {

        Statement st = null;
        ResultSet rs = null;

List<String[]> usuarios = new ArrayList<>();

sSQL = "SELECT * FROM usuarios";
 try {
        st = conn.createStatement();
        rs = st.executeQuery(sSQL);

        while (rs.next()) {
            String[] registros = new String[4];
            registros[0] = rs.getString("id_usuario");
            registros[1] = rs.getString("nombre_usuario");
            registros[2] = rs.getString("apellido_usuario");
            registros[3] = rs.getString("rol_id");
            System.out.print(registros[0] + " -> " + registros[1] + " -> " + registros[2] + " -> " + registros[3] + "\n");
            usuarios.add(registros);
        }
        return usuarios;  
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
       return null;
    }
}

    public static void main(String[] args) {
        System.out.println("Hola metodo main");
        new insertar().mostrarDatos();
    }
}
