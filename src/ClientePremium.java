public class ClientePremium extends Cliente {
    // Atributos específicos de un cliente premium/preferencial
    private double limiteCreditoEspecial;
    private String ejecutivoCuentaAsignado;
    private String beneficiosAdicionales;

    // Constructor
    public ClientePremium(int id, String nombre, String apellidoRazonSocial, String documentoCuit,
                          String direccion, String telefono, String email, String fechaAlta,
                          double limiteCreditoEspecial, String ejecutivoCuentaAsignado, String beneficiosAdicionales) {
        // Llama al constructor de la clase padre (Cliente) para los atributos comunes
        super(id, nombre, apellidoRazonSocial, documentoCuit, direccion, telefono, email, fechaAlta);
        this.limiteCreditoEspecial = limiteCreditoEspecial;
        this.ejecutivoCuentaAsignado = ejecutivoCuentaAsignado;
        this.beneficiosAdicionales = beneficiosAdicionales;
    }

    // Getters y Setters
    public double getLimiteCreditoEspecial() {
        return limiteCreditoEspecial;
    }

    public void setLimiteCreditoEspecial(double limiteCreditoEspecial) {
        this.limiteCreditoEspecial = limiteCreditoEspecial;
    }

    public String getEjecutivoCuentaAsignado() {
        return ejecutivoCuentaAsignado;
    }

    public void setEjecutivoCuentaAsignado(String ejecutivoCuentaAsignado) {
        this.ejecutivoCuentaAsignado = ejecutivoCuentaAsignado;
    }

    public String getBeneficiosAdicionales() {
        return beneficiosAdicionales;
    }

    public void setBeneficiosAdicionales(String beneficiosAdicionales) {
        this.beneficiosAdicionales = beneficiosAdicionales;
    }

    // Sobrescribimos el método del padre para agregar los datos propios
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\n--- Datos de Cliente Premium ---" +
                "\nLímite de Crédito Especial: $" + limiteCreditoEspecial +
                "\nEjecutivo de Cuenta Asignado: " + ejecutivoCuentaAsignado +
                "\nBeneficios Adicionales: " + beneficiosAdicionales;
    }
}