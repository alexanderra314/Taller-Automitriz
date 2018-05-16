package Emtity;

public class propietario {

    
   
    private Long id_propietario;
    private String nombre;
    private Long celular;

    public propietario(Long id_propietario, String nombre, Long celular) {
        this.id_propietario = id_propietario;
        this.nombre = nombre;
        this.celular = celular;
    }

    public Long getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(Long id_propietario) {
        this.id_propietario = id_propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }


   
}
