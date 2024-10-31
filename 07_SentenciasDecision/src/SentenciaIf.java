import java.util.Scanner;

public class SentenciaIf {
    public static void main(String[] args) {
        System.out.println("*** Uso Sentencia If, Else, ElseIf ***");

        var consola = new Scanner(System.in);
        final var EDAD_MAYOR = 18;
        final var EDAD_ADOLESCENTE = 13;
        System.out.print("Digite la edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        if (edad >= EDAD_MAYOR) {
            System.out.println("Eres mayor de edad ");
        } else if (edad >= EDAD_ADOLESCENTE && edad < EDAD_MAYOR) {
            System.out.println("Eres un adolescente ");
        } else{
            System.out.println("Eres menor de edad ");
        }
    }
}
