
package Emtity;


public class revision {
  private int id_revision;
  private String fecha;
  private String placa;
  private Long cedula;
  private String descripcion;
  private String estado;

    public revision() {
    }

    public revision(String fecha, String placa, Long cedula, String descripcion, String estado) {
        this.fecha = fecha;
        this.placa = placa;
        this.cedula = cedula;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId_revision() {
        return id_revision;
    }

    public void setId_revision(int id_revision) {
        this.id_revision = id_revision;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
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
