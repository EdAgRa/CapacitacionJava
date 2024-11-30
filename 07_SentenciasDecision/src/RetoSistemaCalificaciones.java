import java.util.Scanner;

public class RetoSistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");

        var consola = new Scanner(System.in);
        System.out.print("Digite la calificación (0-10): ");
        var valorNota = Double.parseDouble(consola.nextLine());

        var letraNota = "";
        if (valorNota >= 9 && valorNota<= 10)
            letraNota = "A";
        else if (valorNota >= 8 && valorNota<= 9)
            letraNota = "B";
        else if (valorNota >= 7 && valorNota<= 8)
            letraNota = "C";
        else if (valorNota >= 6 && valorNota<= 7)
            letraNota = "D";
        else if (valorNota >= 0 && valorNota<= 6)
            letraNota = "F";
        else letraNota = "Valor Desconocido";

        System.out.printf("\nEl valor %.1f Corresponde a la calificación %s\n",valorNota,letraNota);

    }
}
