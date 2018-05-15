package Emtity;

public class afiliados {

    private int id_afiliados;
    private String placa;
    private String referencia;
    private int modelo;
    private Long id_propietario;
    private String pr_nombre;
    private Long pr_celular;

   
    public afiliados(String placa, String referencia, int modelo, Long id_propietario, String pr_nombre, Long pr_celular) {
        this.placa = placa;
        this.referencia = referencia;
        this.modelo = modelo;
        this.id_propietario = id_propietario;
        this.pr_nombre = pr_nombre;
        this.pr_celular = pr_celular;
    }

  
    

    public int getId_afiliados() {
        return id_afiliados;
    }

    public void setId_afiliados(int id_afiliados) {
        this.id_afiliados = id_afiliados;
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

    public Long getPr_celular() {
        return pr_celular;
    }

    public void setPr_celular(Long pr_celular) {
        this.pr_celular = pr_celular;
    }



 
    
    public String getPr_nombre() {
        return pr_nombre;
    }

    public void setPr_nombre(String pr_nombre) {
        this.pr_nombre = pr_nombre;
    }


}
