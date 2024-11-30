import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {
        System.out.println("*** Aplicación de Salud y Fitnees");

        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04; // valor aproximado kilocalorias

        //Pedimos los valores al usuario
        var consola = new Scanner(System.in);
        System.out.print("Digite su nombre: ");
        var nombreUsuario = consola.nextLine();
        System.out.print("Digite el número de paso de hoy: ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        //Validar si el usuarios alcanzo los pasos diarios
        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIO)? "Si :)":"No :(";

        //Caluculamos las calorías quemadas
        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        //Mostrar la informacion
        System.out.printf("""
                %nUsuario: %s
                Pasos de hoy: %d
                Calorías quemadas: %.2f Kcal
                Meta de pasos diarios alcanzada %s
                ------------------------------------
                La meta de pasos diarios es de: %d pasos
                """,nombreUsuario,pasosDiarios,caloriasQuemadas,metaAlcanzada,META_PASOS_DIARIO);
    }
}
