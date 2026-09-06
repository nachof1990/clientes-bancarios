public class ClienteEmpresa extends Cliente {

    private String rubro;
    private String representanteLegal;

    public ClienteEmpresa(int id, String nombre, String apellidoRazonSocial, String documentoCuit, String direccion, String telefono, String email, String fechaAlta, String rubro, String representanteLegal) {
        super(id, nombre, apellidoRazonSocial, documentoCuit, direccion, telefono, email, fechaAlta);
        this.rubro = rubro;
        this.representanteLegal = representanteLegal;
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
}
