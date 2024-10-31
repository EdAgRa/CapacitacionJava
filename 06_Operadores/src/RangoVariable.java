import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        System.out.println("*** Valor Fuera de Rango ***");
        var consola = new Scanner(System.in);

        System.out.print("Digite un  numero entero: ");
        var dato = Integer.parseInt(consola.nextLine());

        //Revisamos si etá dentro de rango (entre 1 y 10)
        var estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("Variable dentro de rango (1 y 10)? " + estaDentroRango);

        //Revisar la lógica inversa, si el dato está fuera de rango
        var estaFueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("Variable Fuera de rango (1 y 10)? " + estaFueraRango);
    }
}
