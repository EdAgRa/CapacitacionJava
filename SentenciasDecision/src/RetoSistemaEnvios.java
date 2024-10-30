import java.util.Scanner;

public class RetoSistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos ***");

        final var KILO_NACIONAL = 10.0;
        final var KILO_INTERNACIONAL = 20.0;

        var consola = new Scanner(System.in);
        System.out.print("Digite el Destino (nacional/internacional): ");
        var destino = consola.nextLine();

        System.out.print("Digite el peso del paquete (Kg): ");
        var peso = Double.parseDouble(consola.nextLine());


        var valorEnvio = switch (destino){
            case "nacional" -> peso * KILO_NACIONAL;
            case "internacional" -> peso * KILO_INTERNACIONAL;
            default -> 0.0;
        };

        System.out.printf("\nEl costo de envío del paquete de %.2f es de $%.2f\n",peso,valorEnvio);
    }
}
