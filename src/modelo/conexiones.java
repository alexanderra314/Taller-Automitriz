package modelo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexiones {

    private final String url = "jdbc:mysql://localhost:3306/tautomotriz";
    private final String user = "root";
    private final String pass = "";
    private Connection conexion;

    public conexiones() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, pass);
            System.out.println("CONEXION EXITOSA");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            System.out.println("revise la libreria");
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("revise la conexion");
        }
    }

    public Connection getConnetion() {
        return conexion;
    }

}
