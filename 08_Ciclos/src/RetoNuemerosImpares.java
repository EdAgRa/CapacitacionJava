public class RetoNuemerosImpares {
    public static void main(String[] args) {
        System.out.println("*** Números Impares 1 al 20 ***");

        var contador = 1;
        do {
            //Revisamos si es número par
            if (contador % 2 != 0)
                System.out.print(contador+" ");
            contador++;
        }while (contador <= 20);
    }
}
