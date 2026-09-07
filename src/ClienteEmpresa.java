public class ClienteEmpresa extends Cliente {
    // Atributos específicos de una empresa (persona jurídica)
    private String razonSocial;
    private String cuit;
    private String rubro;
    private String representanteLegal;

    // Constructor
    public ClienteEmpresa(int id, String nombre, String apellidoRazonSocial, String documentoCuit,
                          String direccion, String telefono, String email, String fechaAlta,
                          String razonSocial, String cuit, String rubro, String representanteLegal) {
        // Llama al constructor de la clase padre (Cliente) para los atributos comunes
        super(id, nombre, apellidoRazonSocial, documentoCuit, direccion, telefono, email, fechaAlta);
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.rubro = rubro;
        this.representanteLegal = representanteLegal;
    }

    // Getters y Setters
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    // Sobrescribimos el método del padre para agregar los datos propios
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\n--- Datos de Empresa (Persona Jurídica) ---" +
                "\nRazón Social: " + razonSocial +
                "\nCUIT: " + cuit +
                "\nRubro/Actividad: " + rubro +
                "\nRepresentante Legal: " + representanteLegal;
    }
}