import java.util.Scanner;

public class RetoEstacionAnioMejorado {
        public static void main(String[] args) {
            System.out.println("*** Estación del Año ***");

            var consola = new Scanner(System.in);

            System.out.print("Digite el número del mes: ");
            var mes = Integer.parseInt(consola.nextLine());

            var estacion = switch (mes){
                case 1, 2, 12 -> "Invierno";
                case 3, 4, 5  -> "Primavera";
                case 6, 7, 8  -> "Verano";
                case 9, 10, 11 -> "Otoño";
                default -> "Estación desconocida";
            };

            System.out.printf("El mes %d Corresponde a %s",mes,estacion);
        }
}
