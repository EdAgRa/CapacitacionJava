import java.util.Scanner;

public class RetoCalculoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Cálculo Area del Rectángulo ***");
        var consola = new Scanner(System.in);

        System.out.print("\nDigite la base del rectángulo: ");
        var base = Integer.parseInt(consola.nextLine());
        System.out.print("Digite la altura del rectángulo: ");
        var altura = Integer.parseInt(consola.nextLine());

        var area = base * altura;
        var perimetro = 2 * (base + area);

        System.out.printf("""
                %nÁrea del rectángulo = %d
                Perimetro del rectángulo = %d 
                """,area,perimetro);


    }
}
