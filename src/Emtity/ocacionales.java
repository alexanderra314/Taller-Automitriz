
package Emtity;


public class ocacionales {
    private String placa;
    private String referencia;
    private int modelo;
    private Long id_propietario;
    private String pr_nombre;
    private Long pr_celular;
    private String aseguradora;

    public ocacionales() {
    }

    public ocacionales(String placa, String referencia, int modelo, Long id_propietario, String pr_nombre, Long pr_celular, String aseguradora) {
        this.placa = placa;
        this.referencia = referencia;
        this.modelo = modelo;
        this.id_propietario = id_propietario;
        this.pr_nombre = pr_nombre;
        this.pr_celular = pr_celular;
        this.aseguradora = aseguradora;
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

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Long getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(Long id_propietario) {
        this.id_propietario = id_propietario;
    }

    public String getPr_nombre() {
        return pr_nombre;
    }

    public void setPr_nombre(String pr_nombre) {
        this.pr_nombre = pr_nombre;
    }

    public Long getPr_celular() {
        return pr_celular;
    }

    public void setPr_celular(Long pr_celular) {
        this.pr_celular = pr_celular;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

 
    
    
}
