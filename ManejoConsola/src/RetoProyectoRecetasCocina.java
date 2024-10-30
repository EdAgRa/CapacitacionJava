import java.util.Scanner;

public class RetoProyectoRecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");
        var consola = new Scanner(System.in);

        //Solicita datos
        System.out.print("\nIngresa el nombre: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingresa los Ingredientes(Separados por comas): ");
        var ingredientes = consola.nextLine();
        System.out.print("Ingresa el tiempo de preparación (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa la dificultad (Fácil/Medio/Difícil): ");
        var dificultad = consola.nextLine();

        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre Receta: " + nombreReceta);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tTiempo de Preparación: " + tiempoPreparacion+" min");
        System.out.println("\tDificultad = " + dificultad);

    }
}
