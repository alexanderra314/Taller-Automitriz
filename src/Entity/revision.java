
package Entity;

import java.sql.Timestamp;


public class revision {
  private int id_revision;
  private Timestamp fecha;
  private String datos_vehiculos;
  private String descripcion;
  private String estado;

    public revision(int id_revision, Timestamp fecha, String datos_vehiculos, String descripcion, String estado) {
        this.id_revision = id_revision;
        this.fecha = fecha;
        this.datos_vehiculos = datos_vehiculos;
        this.descripcion = descripcion;
        this.estado = estado;
    }

   

    public revision(Timestamp fecha, String datos_vehiculos, String descripcion, String estado) {
        this.fecha = fecha;
        this.datos_vehiculos = datos_vehiculos;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    

    public int getId_revision() {
        return id_revision;
    }

    public void setId_revision(int id_revision) {
        this.id_revision = id_revision;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

   

    public String getDatos_vehiculos() {
        return datos_vehiculos;
    }

    public void setDatos_vehiculos(String datos_vehiculos) {
        this.datos_vehiculos = datos_vehiculos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


  
  
}
