
package modelo;

import Emtity.vehiculo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import taller_automotriz.Formulario_Vehiculo;


public class VehiculoMolde {
    private final conexiones con;
    Formulario_Vehiculo fov=new Formulario_Vehiculo();
   

    public VehiculoMolde() {
        con=new conexiones();
        
    }
   
 
    public boolean vehiculosafiliados(vehiculo v){
        int resultado=0;
        String sql="INSERT INTO `vehiculo`(`placa`, `modelo`, `referencia`, `id_propietario`, `afiliacion`, `aseguradora`) VALUES (?,?,?,?,?,null)";
        try {
            PreparedStatement ps=con.getconnetion().prepareStatement(sql);
            ps.setString(1,v.getPlaca());
            ps.setString(2,v.getModelo());
            ps.setString(3,v.getReferencia());
            ps.setLong(4,v.getId_propietario());
            ps.setLong(5,v.getAfiliacion());
            ps.setString(6,v.getAseguradora());
            resultado=ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR A EJECUTAR LA SENTENCIA "+ex.getMessage());
        }
       
        return resultado>0; 
    }
    
    public boolean vehiculosocacionales(vehiculo ve){
        int resultado=0;
        String sql="INSERT INTO `vehiculo`(`placa`, `modelo`, `referencia`, `id_propietario`, `afiliacion`, `aseguradora`) VALUES (?,?,?,?,null,?)";
        try {
            PreparedStatement ps=con.getconnetion().prepareStatement(sql);
            ps.setString(1,ve.getPlaca());
            ps.setString(2,ve.getModelo());
            ps.setString(3,ve.getReferencia());
            ps.setLong(4,ve.getId_propietario());
            ps.setLong(5,ve.getAfiliacion());
            ps.setString(6,ve.getAseguradora());
            resultado=ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR A EJECUTAR LA SENTENCIA "+ex.getMessage());
        }
       
        return resultado>0; 
    }
    
    public void consultanafiliacion() {
        
       vehiculo veh=new vehiculo();
        try {
            String sql="SELECT max(afiliacion) FROM vehiculo";
            Statement st=con.getconnetion().createStatement();
            ResultSet rst=st.executeQuery(sql);
            while(rst.next()){
               veh.setAfiliacion(rst.getLong(sql));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"NO SE PUDO ENCONTRAR EL NUMUERO DE AFILIACION");
        }
     
    }
   
}
