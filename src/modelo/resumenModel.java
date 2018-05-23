
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import taller_automotriz.formularioRevision;


public class resumenModel {
    conexiones con;
    private long cedulamostrar;
  

    public resumenModel() {
        con=new conexiones();
        
    }
    
    
    public long mostrarcedula(){
        String select=formularioRevision.txtplaca.getText().toString();
        String sql="SELECT id_propietario FROM vehiculo WHERE placa='"+select+"'";
        
        Statement st;
        try {
            st = con.getConnetion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()) {
                
               cedulamostrar=rs.getLong(1);
            }

        } catch (SQLException ex) {
            System.out.println("ERROR AL TRAER LA CEDULA"+ex);
        }
        return cedulamostrar;
    }
    
    
    
    }
    
    

