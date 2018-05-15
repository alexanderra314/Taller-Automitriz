
package modelo;

import Emtity.afiliados;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class afiliadoModel {
    private final conexiones con;

    public afiliadoModel() {
        con=new conexiones();
    }
   
 
    public boolean registroafiliados(afiliados afiliado){
        int resultado=0;
        String sql="INSERT INTO `afiliados`(`id_afiliado`, `placa`, `referencia`, `modelo`, `id_porpietario`, `pr_nombre`, `pr_celular`) VALUES (null,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=con.getconnetion().prepareStatement(sql);
            ps.setString(1,afiliado.getPlaca());
            ps.setString(2,afiliado.getReferencia());
            ps.setInt(3,afiliado.getModelo());
            ps.setLong(4,afiliado.getId_propietario());
            ps.setString(5,afiliado.getPr_nombre());
            ps.setLong(6,afiliado.getPr_celular());
            resultado=ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR A EJECUTAR LA SENTENCIA "+ex.getMessage());
        }
       
        return resultado>0; 
    }
    
   
}
