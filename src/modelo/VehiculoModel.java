package modelo;

import Entity.vehiculo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VehiculoModel {

    private final conexiones con;

    public VehiculoModel() {
        con = new conexiones();

    }

    public List<vehiculo> consultarVehiculo(Long cedula) {
        List<vehiculo> lista = new ArrayList<>();
       
        System.out.println(cedula);
        try {
            Statement sentencia = con.getConnetion().createStatement();

            ResultSet rs = sentencia.executeQuery("SELECT * FROM vehiculo WHERE id_propiertario='"+cedula+"'");
            while (rs.next()) {
                lista.add(new vehiculo(rs.getString("placa"),
                        rs.getString("referencia"),
                        rs.getString("nombreAseguradora"),
                        rs.getLong("id_propietario"),
                        rs.getLong("afiliacion"),
                        rs.getString("aseguradora")));

            }

        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la sentencia SQL \n" + ex.getMessage());
        }
        return lista;

    }

    public boolean vehiculosafiliados(vehiculo v) {
        int resultado = 0;
        String sql = "INSERT INTO `vehiculo`(`placa`, `modelo`, `referencia`, `id_propietario`, `afiliacion` ) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.getConnetion().prepareStatement(sql);
            ps.setString(1, v.getPlaca());
            ps.setString(2, v.getModelo());
            ps.setString(3, v.getReferencia());
            ps.setLong(4, v.getId_propietario());
            ps.setLong(5, v.getAfiliacion());
            resultado = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR A EJECUTAR LA SENTENCIA SQL" + ex.getMessage());
        }

        return resultado > 0;
    }

    public boolean vehiculosocacionales(vehiculo ve) {
        int resultado = 0;
        String sql = "INSERT INTO `vehiculo`(`placa`, `modelo`, `referencia`, `id_propietario`,  `aseguradora`) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.getConnetion().prepareStatement(sql);
            ps.setString(1, ve.getPlaca());
            ps.setString(2, ve.getModelo());
            ps.setString(3, ve.getReferencia());
            ps.setLong(4, ve.getId_propietario());
            ps.setString(5, ve.getAseguradora());
            resultado = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR A EJECUTAR LA SENTENCIA " + ex.getMessage());
        }

        return resultado > 0;
    }

    public void consultanafiliacion(vehiculo va) {

        try {
            String sql = "SELECT max(afiliacion) FROM vehiculo";
            Statement st = con.getConnetion().createStatement();
            ResultSet rst = st.executeQuery(sql);
            while (rst.next()) {
                va.setAfiliacion(rst.getLong(1));
                System.out.println("Afiliacion tiene valoñr " + va.getAfiliacion());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ENCONTRAR EL NUMUERO DE AFILIACION");
        }

    }

    public  boolean consultarsiafiliacion(vehiculo v) {
        String selecplaca=v.getPlaca();
        System.out.println(selecplaca);
        int afiliado = 0;

        try {
            Statement sentencia = con.getConnetion().createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT COUNT (*) FROM vehiculo WHERE placa='"+selecplaca+"'");
            while (rs.next()) {

                afiliado = rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VehiculoModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return afiliado>0;
    }

}
