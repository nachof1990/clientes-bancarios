public class ClientePremium extends Cliente {

    private double limiteCreditoEspecial;
    private String ejecutivoCuenta;
    private String beneficiosAdicionales;

    public ClientePremium(int id, String nombre, String apellidoRazonSocial, String documentoCuit, String direccion, String telefono, String email, String fechaAlta, double limiteCreditoEspecial, String ejecutivoCuenta, String beneficiosAdicionales) {
        super(id, nombre, apellidoRazonSocial, documentoCuit, direccion, telefono, email, fechaAlta);
        this.limiteCreditoEspecial = limiteCreditoEspecial;
        this.ejecutivoCuenta = ejecutivoCuenta;
        this.beneficiosAdicionales = beneficiosAdicionales;
    }

    public double getLimiteCreditoEspecial() {
        return limiteCreditoEspecial;
    }

    public void setLimiteCreditoEspecial(double limiteCreditoEspecial) {
        this.limiteCreditoEspecial = limiteCreditoEspecial;
    }

    public String getEjecutivoCuenta() {
        return ejecutivoCuenta;
    }

    public void setEjecutivoCuenta(String ejecutivoCuenta) {
        this.ejecutivoCuenta = ejecutivoCuenta;
    }

    public String getBeneficiosAdicionales() {
        return beneficiosAdicionales;
    }

    public void setBeneficiosAdicionales(String beneficiosAdicionales) {
        this.beneficiosAdicionales = beneficiosAdicionales;
    }
}
