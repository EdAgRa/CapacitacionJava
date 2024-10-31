public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** break y continue");

        //Ejemplo break, imprimir solo el primer numero par
        System.out.println("Palabra break");
        for (var numero = 1;numero < 10;numero++){
            if (numero % 2 == 0){
                System.out.print(numero+" ");
                break;
            }
        }

        //Ejemplo break, imprimir solo números par
        System.out.println("\nPalabra continuo");
        for (var numero = 1;numero < 10;numero++){
            if (numero % 2 == 0){
                continue;
            }
            System.out.print(numero+" ");
        }

    }
}
