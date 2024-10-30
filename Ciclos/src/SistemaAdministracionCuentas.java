import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        System.out.println("*** sistema Administración Cuentas ***");
        var consola = new Scanner(System.in);
        var salir = false;

        while (!salir) {
            System.out.print("""
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoja un opción:\s""");
            var opcion = consola.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción Inválida...\n");
            }
        }
        System.out.println("Fin del sistema de Administración de Cuentas");
    }
}
