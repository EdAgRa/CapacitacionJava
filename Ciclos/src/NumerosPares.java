public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("*** Números Pares 1 al  20 con While");

        var contador = 0;
        while (contador <= 20){
            //Revisamos si es número par
            if (contador % 2 == 0)
                System.out.print(contador+" ");
            contador++;
        }
    }
}
