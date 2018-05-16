package modelo;

import Emtity.vehiculo;
import java.sql.PreparedStatement;

public class ocacionalesModel {

    private final conexiones con;
    
    
    public ocacionalesModel() {
        con = new conexiones();
        
    }
    /*
    public boolean registrocacionasles(vehiculo ocacional) {
        int resultado = 0;
        
        String sql = "INSERT INTO `ocacional`(`placa`, `referencia`, `modelo`, `id_propietario`, `pr_nombre`, `pr_celular`, `aseguradora`) VALUES (?,?,?,?,?,?,?) ";
        try {
            PreparedStatement ps = con.getconnetion().prepareStatement(sql);
            ps.setString(1, ocacional.getPlaca());
            ps.setString(2, ocacional.getReferencia());
            ps.setInt(3, ocacional.getModelo());
            ps.setLong(4, ocacional.getId_propietario());
            ps.setString(5, ocacional.getPr_nombre());
            ps.setLong(6, ocacional.getPr_celular());
            ps.setString(7, ocacional.getAseguradora());
            resultado=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return resultado>0;
    }
*/
        
}

