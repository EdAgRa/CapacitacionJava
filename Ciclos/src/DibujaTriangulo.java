import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja Triangulo ***");
        var consola = new Scanner(System.in);
        System.out.print("Digite el número de filas: ");
        var numeroFilas = consola.nextInt();

        for(var fila = 1;fila <= numeroFilas; fila++){
            var espaciosBlanco = " ".repeat(numeroFilas - fila);
            var asteristos = "*".repeat(2 * fila - 1);

            System.out.println(espaciosBlanco+asteristos);

        }
    }

}
