public class ClientePersonaFisica extends Cliente {

    private String fechaNacimiento;
    private String profesion;
    private double ingresosDeclarados;

    public ClientePersonaFisica(int id, String nombre, String apellidoRazonSocial, String documentoCuit, String direccion, String telefono, String email, String fechaAlta, String fechaNacimiento, String profesion, double ingresosDeclarados) {
        super(id, nombre, apellidoRazonSocial, documentoCuit, direccion, telefono, email, fechaAlta);
        this.fechaNacimiento = fechaNacimiento;
        this.profesion = profesion;
        this.ingresosDeclarados = ingresosDeclarados;
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
}
