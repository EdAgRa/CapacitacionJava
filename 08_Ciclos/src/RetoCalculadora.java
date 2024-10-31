import java.util.Scanner;

public class RetoCalculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;

        while (!salir){
            var numero1 = 0.0;
            var numero2 = 0.0;
            System.out.print("""
                    \n*** Calculadora en Java ***
                    Operaciones que puede realizar:
                    \t1. Suma
                    \t2. Resta
                    \t3. Multiplicación
                    \t4. Division
                    \t5. Salir
                    Escoja una Opción:\s""");
            var operacion = consola.nextInt();

            if (operacion >=1 && operacion <=4){
                System.out.print("Digite el valor 1: ");
                numero1 = consola.nextDouble();
                System.out.print("Digite el valor 2: ");
                numero2 = consola.nextDouble();
            }

            switch (operacion){
                case 1 -> {
                    numero1 += numero2;
                    System.out.printf("Resultado de la suma: %.2f%n",numero1);
                }
                case 2 ->{
                    numero1 -= numero2;
                    System.out.printf("Resultado de la resta: %.2f%n",numero1);
                }
                case 3 ->{
                    numero1 *= numero2;
                    System.out.printf("Resultado de la Multiplicación: %.2f%n",numero1);
                }
                case 4 ->{
                    if (numero2 != 0){
                        numero1 /= numero2;
                        System.out.printf("Resultado de la Division: %.2f%n",numero1);
                    }
                    else  System.out.println("Para la division, el valor 2 debe se diferente de 0");
                }
                case 5 -> {
                    System.out.println("Saliendo de la Calculadora, Vuelva Pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción No valida, seleccione entre 1 y 5\n");
            }
        }
    }
}
