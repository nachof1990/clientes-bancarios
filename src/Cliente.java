public class Cliente {
    // Atributos comunes a todos los clientes
    private int id;
    private String nombre;
    private String apellidoRazonSocial;
    private String documentoCuit;
    private String direccion;
    private String telefono;
    private String email;
    private String fechaAlta;

    // Constructor
    public Cliente(int id, String nombre, String apellidoRazonSocial, String documentoCuit,
                   String direccion, String telefono, String email, String fechaAlta) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoRazonSocial = apellidoRazonSocial;
        this.documentoCuit = documentoCuit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fechaAlta = fechaAlta;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoRazonSocial() {
        return apellidoRazonSocial;
    }

    public void setApellidoRazonSocial(String apellidoRazonSocial) {
        this.apellidoRazonSocial = apellidoRazonSocial;
    }

    public String getDocumentoCuit() {
        return documentoCuit;
    }

    public void setDocumentoCuit(String documentoCuit) {
        this.documentoCuit = documentoCuit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    // Método para mostrar la información del cliente
    // Las clases hijas van a "sobrescribir" (override) este método
    // para agregar sus propios atributos
    public String mostrarInformacion() {
        return "ID: " + id +
                "\nNombre: " + nombre +
                "\nApellido/Razón Social: " + apellidoRazonSocial +
                "\nDocumento/CUIT: " + documentoCuit +
                "\nDirección: " + direccion +
                "\nTeléfono: " + telefono +
                "\nEmail: " + email +
                "\nFecha de Alta: " + fechaAlta;
    }
}