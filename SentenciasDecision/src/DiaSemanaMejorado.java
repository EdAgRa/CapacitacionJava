import java.util.Scanner;

public class DiaSemanaMejorado {
    public static void main(String[] args) {
        System.out.println("*** Dia Semana Sentencia Switch***");

        var consola = new Scanner(System.in);
        System.out.print("Digite el Numero de dia de la semana (1-7): ");
        var dia = Integer.parseInt(consola.nextLine());

        var nombreDia = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Lunes";
            case 3 -> "Martes";
            case 4 -> "Miércoles";
            case 5 -> "Jueves";
            case 6 -> "Viernes";
            case 7 -> "Sábado";
            default -> "NO ES VALIDO";
        };
        System.out.printf("\nEl Número de dia %d Corresponde a %s", dia, nombreDia + "\n");
    }
}
