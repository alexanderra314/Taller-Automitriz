
package modelo;

import Emtity.revision;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class revisionModel {
    private final conexiones con;

    public revisionModel() {
        con=new conexiones();
    }

public boolean registrorevision(revision re){
    int resultado=0;
    String sql="INSERT INTO `revision`(`id_consecutivo`, `fecha`, `datos_vehiculo`, `descripcion`, `estado`) VALUES (NULL,?,?,?,?)";
    try {
        PreparedStatement ps=con.getconnetion().prepareStatement(sql);
        
        ps.setString(1,re.getFecha());
        ps.setString(2,re.getDatos_vehiculos());
        ps.setString(3,re.getDescripcion());
        ps.setString(4,re.getEstado());
        resultado=ps.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e);
    }
    return resultado>0;
}

}
