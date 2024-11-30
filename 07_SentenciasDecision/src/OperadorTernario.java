import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");
        final var EDAD_MAYOR = 18;
        var consola = new Scanner(System.in);

        System.out.print("Digite un número: ");
        var numero = Double.parseDouble(consola.nextLine());

        //sistaxis
        //condicion ? exp1 : exp2
        //Determinar si un numero es par o no
        var resultado = (numero % 2 == 0) ? "Par":"Impar";
        System.out.println("resultado = " + resultado);

        //Calcular si es mayor de edad
        System.out.print("Digite la edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        var mensaje = (edad >= EDAD_MAYOR)?"Eres mayor de edad":"Eres menor de edad";
        System.out.println("Tienes " +edad +", "+ mensaje);

        //Valor positivo, negativo o cero(operador ternario anidado)
        resultado = (numero > 0)?"Positivo":(numero < 0)?"Negativo":"Cero";
        System.out.println("\nel número "+numero +" es " + resultado);



    }
}
