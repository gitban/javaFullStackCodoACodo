import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class insertar{
    // Instancias la clase que hemos creado anteriormente
    private conexion SQL = new conexion();
    // Llamas al método que tiene la clase y te devuelve una conexión
    private Connection conn = SQL.conectarMySQL();
    // Query que usarás para hacer lo que necesites
    private String sSQL = "SELECT * FROM pacientes";
    // PreparedStatement

    public void mostrarDatos() {
        
        Statement stmt = null;
        ResultSet rs = null;
        
        try
        {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sSQL);
            
            // or alternatively, if you don't know ahead of time that
            // the query will be a SELECT...
            
            if (stmt.execute("SELECT * FROM usuarios")) {
                rs = stmt.getResultSet();
            }
            rs.first();
                while(rs.next()){
                    dato[0]=rs.getString(1);
                    dato[1]=rs.getString(2);
                    dato[2]=rs.getString(3);
                }
    String var1 = rs.getString(1); //primer dato (observa los datos primitivos)
    Integer var2 = rs.getInt(2); //segundo dato
    Float var3 = rs.getFloat(3); //tercer dato
            System.out.println("rs holis" + rs);
        // Now do something with the ResultSet ....
    }catch(
    SQLException ex)
    {
        // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }finally
    {
        // it is a good idea to release
        // resources in a finally{} block
        // in reverse-order of their creation
        // if they are no-longer needed

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException sqlEx) {
            } // ignore

            rs = null;
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException sqlEx) {
            } // ignore

            stmt = null;
        }
    }
    }
public static void main(String[] args) {
    
}
}
