package Emtity;

public class vehiculo {

    private String placa;
    private String referencia;
    private String modelo;
    private Long id_propietario;
    private Long afiliacion;
    private String aseguradora;

    public vehiculo(String placa, String referencia, String modelo, Long id_propietario, Long afiliacion, String aseguradora) {
        this.placa = placa;
        this.referencia = referencia;
        this.modelo = modelo;
        this.id_propietario = id_propietario;
        this.afiliacion = afiliacion;
        this.aseguradora = aseguradora;
    }

    public vehiculo(String placa, String referencia, String modelo, Long id_propietario, String aseguradora) {
        this.placa = placa;
        this.referencia = referencia;
        this.modelo = modelo;
        this.id_propietario = id_propietario;
        this.aseguradora = aseguradora;
    }

    public vehiculo(String placa, String referencia, String modelo, Long id_propietario, Long afiliacion) {
        this.placa = placa;
        this.referencia = referencia;
        this.modelo = modelo;
        this.id_propietario = id_propietario;
        this.afiliacion = afiliacion;
    }

    
    
    public vehiculo(Long afiliacion) {
        this.afiliacion = afiliacion;
    }

    public vehiculo() {
    }
    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

  

    public Long getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(Long id_propietario) {
        this.id_propietario = id_propietario;
    }

    public Long getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(Long afiliacion) {
        this.afiliacion = afiliacion;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

}
