import java.util.Scanner;

public class FuncionSumar {
    //Definir la funcion de sumar
    static int sumar(int a, int b){
        var resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("*** Suma de Dos Valores ***");
        var consola = new Scanner(System.in);

        System.out.print("Digite el Primer Valor: ");
        int arg1 = consola.nextInt();
        System.out.print("Digite el Segundo Valor: ");
        int arg2 = consola.nextInt();

        var resultadoFuncion = sumar(arg1,arg2);
        System.out.println("Resultado Función = " + resultadoFuncion);
    }
}
