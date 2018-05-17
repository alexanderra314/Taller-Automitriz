package modelo;

import Emtity.propietario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PropietarioModel {

    private final conexiones con;
    private long ced;
    private Long pro;

    public PropietarioModel() {
        con = new conexiones();
        

    }

    public boolean registropropietraios(propietario p) {
        int resultado = 0;

        String sql = "INSERT INTO `propietario`(`id_propietario`, `nombre`, `celular`) VALUES (?,?,?) ";
        try {
            PreparedStatement ps = con.getconnetion().prepareStatement(sql);
            ps.setLong(1, p.getId_propietario());
            ps.setString(2, p.getNombre());
            ps.setLong(3, p.getCelular());
            resultado = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado > 0;
    }

    public Long busquedapropíetario(propietario p1) {
        
        try {
            Long seleccion1=p1.getId_propietario();
            
         
            Statement st = con.getconnetion().createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM propietario"
                    + " WHERE id_propietario='" + seleccion1 + "'");
            
            while (rs.next()) {
                pro = rs.getLong(1);
                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return pro;
        
    }

   
  //  public List<vehiculo> mostrarvehiculo(){
        
 //   }
     
    }
