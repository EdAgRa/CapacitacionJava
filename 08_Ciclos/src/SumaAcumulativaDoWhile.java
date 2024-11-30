public class SumaAcumulativaDoWhile {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulativa usando do while ***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        var numero = 1;
        do{
            System.out.println("(acumuladorSuma + numero) -> "+ acumuladorSuma +" + "+numero);

            //realiza la suma acumulativa
            acumuladorSuma += numero++; // acumulador suma + numero

            System.out.println("Suma parcial acumulada "+acumuladorSuma+"\n");
        }while (numero <= 5);

        System.out.println("Suma de los primeros "+MAXIMO+" números: "+ acumuladorSuma);

    }
}
