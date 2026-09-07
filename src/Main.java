public class Main {
    public static void main(String[] args) {

        // Creamos un cliente de tipo Persona Física
        ClientePersonaFisica cliente1 = new ClientePersonaFisica(
                1, "Juan", "Pérez", "30111222", "Av. Rivadavia 1234",
                "1145678900", "juan.perez@mail.com", "05/03/2020",
                "30111222", "15/08/1985", "Contador", 850000.0
        );

        // Creamos un cliente de tipo Empresa
        ClienteEmpresa cliente2 = new ClienteEmpresa(
                2, "Sucursal Norte", "Tech Solutions S.A.", "30-71234567-8",
                "Av. Corrientes 4567", "1148889999", "contacto@techsolutions.com", "10/11/2019",
                "Tech Solutions S.A.", "30-71234567-8", "Desarrollo de Software", "María González"
        );

        // Creamos un cliente Premium
        ClientePremium cliente3 = new ClientePremium(
                3, "Laura", "Fernández", "27333444", "Calle Falsa 123",
                "1156781234", "laura.fernandez@mail.com", "20/01/2018",
                500000.0, "Carlos Ramírez", "Acceso a sala VIP y asesor financiero personal"
        );

        // Mostramos la información de cada cliente por consola
        System.out.println("========== CLIENTE 1 (Persona Física) ==========");
        System.out.println(cliente1.mostrarInformacion());

        System.out.println("\n========== CLIENTE 2 (Empresa) ==========");
        System.out.println(cliente2.mostrarInformacion());

        System.out.println("\n========== CLIENTE 3 (Premium) ==========");
        System.out.println(cliente3.mostrarInformacion());
    }
}