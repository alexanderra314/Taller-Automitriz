
package modelo;

import Emtity.vehiculo;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class VehiculoModel {
    private final conexiones con;
    private final long num=0;

   

    public VehiculoModel() {
        con=new conexiones();
        
    }
   
 
    public boolean vehiculosafiliados(vehiculo v){
        int resultado=0;
        String sql="INSERT INTO `vehiculo`(`placa`, `modelo`, `referencia`, `id_propietario`, `afiliacion` ) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps=con.getconnetion().prepareStatement(sql);
            ps.setString(1,v.getPlaca());
            ps.setString(2,v.getModelo());
            ps.setString(3,v.getReferencia());
            ps.setLong(4,v.getId_propietario());
            ps.setLong(5,v.getAfiliacion());
            resultado=ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR A EJECUTAR LA SENTENCIA SQL"+ex.getMessage());
        }
       
        return resultado>0; 
    }
    
    public boolean vehiculosocacionales(vehiculo ve){
        int resultado=0;
        String sql="INSERT INTO `vehiculo`(`placa`, `modelo`, `referencia`, `id_propietario`,  `aseguradora`) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps=con.getconnetion().prepareStatement(sql);
            ps.setString(1,ve.getPlaca());
            ps.setString(2,ve.getModelo());
            ps.setString(3,ve.getReferencia());
            ps.setLong(4,ve.getId_propietario());
            ps.setString(5,ve.getAseguradora());
            resultado=ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR A EJECUTAR LA SENTENCIA "+ex.getMessage());
        }
       
        return resultado>0; 
    }
    
    public void consultanafiliacion(vehiculo va) {
        
     
        try {
            String sql="SELECT max(afiliacion) FROM vehiculo";
            Statement st=con.getconnetion().createStatement();
            ResultSet rst=st.executeQuery(sql);
            while(rst.next()){
               va.setAfiliacion(rst.getLong(1));
               System.out.println("Afiliacion tiene valoñr "+va.getAfiliacion());
                       }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"NO SE PUDO ENCONTRAR EL NUMUERO DE AFILIACION");
        }
     
    }
    
   
}
