public class Main {

    public static void main(String[] args) {
        ClientePersonaFisica persona = new ClientePersonaFisica(
                1,
                "Ana",
                "Gomez",
                "30123456",
                "Av. Corrientes 1234",
                "1123456789",
                "ana@gmail.com",
                "01/09/2026",

                "01/09/1990",
                "Contadora",
                1500000.0
        );
        ClienteEmpresa empresa = new ClienteEmpresa(
                2,
                "Tech",
                "Finanzas Digitales SA",
                "30-71234567-8",
                "Av. Santa Fe 2500",
                "1144556677",
                "contacto@finanzasdigitales.com",
                "02/09/2026",

                "Tecnologia Financiera",
                "Carlos Perez"
        );
        ClientePremium premium = new ClientePremium(
                3,
                "Laura",
                "Martinez",
                "28987654",
                "Av. Cabildo 1800",
                "1166778899",
                "laura@gmail.com",
                "03/09/2026",

                5000000.0,
                "Mariana Lopez",
                "Atencion preferencial y bonificacion de comisiones"
        );


        System.out.println("----------ClientePersonaFisica----------");
        System.out.println("Nombre: " + persona.getNombre() + " " + persona.getApellidoRazonSocial());
        System.out.println("DNI: " + persona.getDocumentoCuit());
        System.out.println("Direccion: " + persona.getDireccion());
        System.out.println("Profesión: " + persona.getProfesion());
        System.out.println("Ingresos: $" + persona.getIngresosDeclarados());
        System.out.println("----------ClienteEmpresa-----------------");
        System.out.println("Nombre: " + empresa.getNombre());
        System.out.println("cuit: " + empresa.getDocumentoCuit());
        System.out.println("Direccion: " + persona.getDireccion());
        System.out.println("Razon Social: " + empresa.getApellidoRazonSocial());
        System.out.println("Rubro: " + empresa.getRubro());
        System.out.println("Representante Legal: " + empresa.getRepresentanteLegal());
        System.out.println("----------ClientePremium------------------");
        System.out.println("Nombre: " + premium.getNombre() + " " + persona.getApellidoRazonSocial());
        System.out.println("DNI: " + persona.getDocumentoCuit());
        System.out.println("Direccion: " + persona.getDireccion());
        System.out.println("Limite de Credito $: " + premium.getLimiteCreditoEspecial());
        System.out.println("Ejecutivo de cuenta: " + premium.getEjecutivoCuenta());
        System.out.println("Beneficio: " + premium.getBeneficiosAdicionales());
    }
}
