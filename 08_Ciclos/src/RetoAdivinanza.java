import java.util.Random;
import java.util.Scanner;

public class RetoAdivinanza {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivina el Número ***");

        var random = new Random();
        var consola = new Scanner(System.in);
        var numeroSecreto = random.nextInt(50)+1;
        var intentos = 1;
        var intentosRestantes = 4;
        var esCorrecto = false;

        System.out.print("Digite un Número entre 1 y 50: ");
        var numeroJuego = consola.nextInt();

        while (numeroSecreto != numeroJuego && intentosRestantes != 0 ) {
            if (numeroJuego > 50){
                System.out.printf("""
                        Esta fuera del rango entre 1 - 50
                        Le quedan %d Intentos%n""",intentosRestantes );
                System.out.print("Ingrese un nuevo Número: ");
                numeroJuego = consola.nextInt();
            } else if (numeroSecreto > numeroJuego) {
                System.out.printf("""
                        El numero es Mayor
                        Le quedan %d Intentos%n""",intentosRestantes );
                System.out.print("Ingrese un nuevo Número: ");
                numeroJuego = consola.nextInt();
            }else {
                System.out.printf("""
                        El numero es Menor
                        Le quedan %d Intentos%n""",intentosRestantes );
                System.out.print("Ingrese un nuevo Número: ");
                numeroJuego = consola.nextInt();
            }
            intentosRestantes--;
            intentos++;
            System.out.println("dentro");
        }

        if(esCorrecto||numeroSecreto == numeroJuego) {
            System.out.printf("""
                    %n***** Felicidades! *****
                    \tAdivinaste el Número Secreto %d
                    \tusando solo %d Intentos
                    """, numeroJuego, intentos);
        }else {
            System.out.printf("""
                    %n----- UPS! Que Pena! -----
                    \tNo lograste Encontrar Número Secreto,
                    \tDespués de %d Intentos
                    \tEl número secreto era %d
                    Mejor SUERTE para la próxima
                    """,intentos,numeroSecreto);
        }
    }
}
