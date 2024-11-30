import java.util.Scanner;

public class PrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema Prestamo de Libros ***");

        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("Cuenta con credencial de estudiante (true/false)? ");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuantos kilómetros vive de la biblioteca? ");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo = tieneCredencial || distanciaBiblioteca <= DISTANCIA_PERMITIDA_KM;
        System.out.println("Es elegible para Prestamo de libros  = " + esElegiblePrestamo);


    }
}
