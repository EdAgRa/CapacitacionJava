import java.util.Scanner;

public class RetoPromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio Calificaciones ***");
        var consola = new Scanner(System.in);

        System.out.print("Digite el la cantidad de calificaciones: ");
        var numeroCalificaciones = Integer.parseInt(consola.nextLine());
        var calificaciones = new double[numeroCalificaciones];
        var sumaCalificaciones = 0.0;
        System.out.println("\nDigite el valor de cada calificación: ");
        for (var i = 0;i < numeroCalificaciones; i++){
            System.out.print("Digite el valor ["+i+"] : ");
            calificaciones[i] = Double.parseDouble(consola.nextLine());
            sumaCalificaciones += calificaciones[i];
        }
        var promedio = sumaCalificaciones / numeroCalificaciones;
        System.out.printf("\nPromedio de las Calificaciones en : $%.2f%n",promedio);
    }
}
