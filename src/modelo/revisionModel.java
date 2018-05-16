
package modelo;

import Emtity.revision;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class revisionModel {
    private final conexiones con;

    public revisionModel() {
        con=new conexiones();
    }
/*
public boolean registrorevision(revision re){
    int resultado=0;
    String sql="INSERT INTO `revision`(`id_revision`, `fecha`, `placa`, `pr_cedula`, `descripcion`, `estado`, `id_afiliado`) VALUES (null,?,?,?,?,?,?)";
    try {
        PreparedStatement ps=con.getconnetion().prepareStatement(sql);
        ps.setString(1,re.getFecha());
        ps.setString(2,re.getPlaca());
        ps.setLong(3,re.getCedula());
        ps.setString(4,re.getDescripcion());
        ps.setString(5,re.getEstado());
        ps.setInt(6, re.getId_revision());
        resultado=ps.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e);
    }
    return resultado>0;
}
*/
}
