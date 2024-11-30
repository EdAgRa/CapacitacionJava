import java.util.Scanner;

public class RetoSistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");
        final var USURIO_REGISTRATO = "BASEWARNET";
        final var CLAVE_REGIATRADA = "Bswn_2024";
        var consola = new Scanner(System.in);

        System.out.print("Digite el Usuario: ");
        var loginUsuario = consola.nextLine();
        System.out.print("Digite el password: ");
        var claveUsuario = consola.nextLine();


        var datosCorrectos = loginUsuario.trim().equals(USURIO_REGISTRATO) && claveUsuario.trim().equals(CLAVE_REGIATRADA);
        System.out.println("Datos son correctos? "+datosCorrectos);


    }
}
