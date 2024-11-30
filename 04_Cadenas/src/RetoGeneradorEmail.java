public class RetoGeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        //Nombre del usuario
        var nombreUsuario = "Eduard Aguacía R";
        System.out.println("Nombre usuario: " + nombreUsuario);

        //usuario sin espacios y con punto
        var usurioNormalizado = nombreUsuario.strip().replace(" ",".");
        //busco el ultimo punto
        var ultimoApellido = usurioNormalizado.lastIndexOf(".");
        // usuario con solo un nombre, un apellido, sin espacios y en minúsculas
        usurioNormalizado = usurioNormalizado.strip().substring(0,ultimoApellido).toLowerCase();
        System.out.println("Nombre usuario normalizado: " + usurioNormalizado);
        //Datos empresa
        var nombreEmpresa = "BaseWarNet";
        System.out.println("\nNombre empresa: " + nombreEmpresa);
        var empresaNormalizada = nombreEmpresa.toLowerCase();
        var dominioEmail = ".com.co";
        System.out.println("Extensión del Dominio: " + dominioEmail);

        // Concatenado
        var dominioNormalizado = "@"+empresaNormalizada+dominioEmail;
        System.out.println("Dominio Email Normalizado: " + dominioNormalizado);

        //Email final
        var emailGenerado =  usurioNormalizado+dominioNormalizado;
        System.out.println("\nEmail Final Generado: " + emailGenerado);
    }
}
