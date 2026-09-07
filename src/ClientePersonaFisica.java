public class ClientePersonaFisica extends Cliente {
    // Atributos específicos de una persona física
    private String dni;
    private String fechaNacimiento;
    private String profesion;
    private double ingresosDeclarados;

    // Constructor
    public ClientePersonaFisica(int id, String nombre, String apellidoRazonSocial, String documentoCuit,
                                String direccion, String telefono, String email, String fechaAlta,
                                String dni, String fechaNacimiento, String profesion, double ingresosDeclarados) {
        // Llama al constructor de la clase padre (Cliente) para los atributos comunes
        super(id, nombre, apellidoRazonSocial, documentoCuit, direccion, telefono, email, fechaAlta);
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.profesion = profesion;
        this.ingresosDeclarados = ingresosDeclarados;
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getIngresosDeclarados() {
        return ingresosDeclarados;
    }

    public void setIngresosDeclarados(double ingresosDeclarados) {
        this.ingresosDeclarados = ingresosDeclarados;
    }

    // Sobrescribimos el método del padre para agregar los datos propios
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\n--- Datos de Persona Física ---" +
                "\nDNI: " + dni +
                "\nFecha de Nacimiento: " + fechaNacimiento +
                "\nProfesión: " + profesion +
                "\nIngresos Declarados: $" + ingresosDeclarados;
    }
}