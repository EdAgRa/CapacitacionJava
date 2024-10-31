public class NumerosParesFor {
    public static void main(String[] args) {
        System.out.println("*** Números pares usando for ***");

        System.out.println("Números Pares ");
        for (var contador = 1;contador <= 20;contador++){
            if (contador % 2 == 0)
                System.out.print(contador +" ");
        }
        System.out.println("\nNúmeros Impares ");
        for (var contador2 = 1;contador2 <= 20;contador2++){
            if (contador2 % 2 != 0)
                System.out.print(contador2 +" ");
        }
    }
}
