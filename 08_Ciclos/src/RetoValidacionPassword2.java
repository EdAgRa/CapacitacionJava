import java.util.Scanner;

public class RetoValidacionPassword2 {
    public static void main(String[] args) {
        System.out.println("*** Validación de Password ***");
        final var MINIMO = 6;
        var consola = new Scanner(System.in);
        int tamanioClave;

        do {
            System.out.print("Digite la contraseña: ");
            var claveUsuario = consola.nextLine().strip();
            tamanioClave = claveUsuario.length();

            if(tamanioClave >= 6)    System.out.println("Password Válido");
            else System.out.println("Password Invalido, Intente de Nuevo debe tener al menos 6 caractes ");

        }while ( tamanioClave < 6);
    }
}

