package modelo;

import Entity.revision;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import taller_automotriz.lista_revisiones;

public class revisionModel {

    private final conexiones con;

    public revisionModel() {
        con = new conexiones();
    }

    public boolean registrorevision(revision re) {
        int resultado = 0;
        String sql = "INSERT INTO `revision`(`id_consecutivo`, `fecha`, `placa`, `descripcion`, `estado`) VALUES (NULL,?,?,?,?)";
        try {
            PreparedStatement ps = con.getConnetion().prepareStatement(sql);

            ps.setTimestamp(1, re.getFecha());
            ps.setString(2, re.getDatos_vehiculos());
            ps.setString(3, re.getDescripcion());
            ps.setString(4, re.getEstado());
            resultado = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return resultado > 0;
    }

    public List<revision> mostrarrevisones() {

        List<revision> listarevision = new ArrayList<>();

        try {
            Statement st = con.getConnetion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM revision");
            while (rs.next()) {
                listarevision.add(new revision(rs.getInt("id_consecutivo"),
                        rs.getTimestamp("fecha"),
                        rs.getString("placa"),
                        rs.getString("descripcion"),
                        rs.getString("estado")));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listarevision;
    }
    
    public List<revision> rangofecha(String fecha1, String fecha2){
          List<revision> listarevision = new ArrayList<>();
     try {
            Statement st = con.getConnetion().createStatement();
            String query = "SELECT * FROM `revision` WHERE fecha BETWEEN '"+fecha1+"' and '"+fecha2+"' ";
            System.out.println("Sentencia: " + query);
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                listarevision.add(new revision(rs.getInt("id_consecutivo"),
                        rs.getTimestamp("fecha"),
                        rs.getString("placa"),
                        rs.getString("descripcion"),
                        rs.getString("estado")));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listarevision;
    
        }
     

 
    
    
}
