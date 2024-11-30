import java.util.Scanner;

public class RetoSistemaAutenticacion2 {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");

        final var USUARIO_REGISTRADO = "DBO";
        final var CLAVE_REGISTRADO = "Bswn_2024";

        var consola = new Scanner(System.in);
        System.out.print("Digite el usuario: ");
        var loginUsuario = consola.nextLine().trim();
        System.out.print("Digite el password: ");
        var claveUsuario = consola.nextLine().trim();

        if (loginUsuario.equals(USUARIO_REGISTRADO) && claveUsuario.equals(CLAVE_REGISTRADO))
            System.out.println("Bienvenido al Sistema");
        else if (!loginUsuario.equals(USUARIO_REGISTRADO) && !claveUsuario.equals(CLAVE_REGISTRADO))
            System.out.println("Usuario y Password Incorrectos, Por favor Corregirlo!");
        else if (!loginUsuario.equals(USUARIO_REGISTRADO))
            System.out.println("Usuario Incorrecto, Por favor Corregirlo!");
        else System.out.println("Password Incorrecto, Por favor Corregirlo!");
    }
}
