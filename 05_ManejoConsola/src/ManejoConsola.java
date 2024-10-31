import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        System.out.println("*** Manejo Consola ***");
        var consola = new Scanner(System.in);// in - input - entrada de datos
        System.out.print("Escribe tu Nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

    }
}
