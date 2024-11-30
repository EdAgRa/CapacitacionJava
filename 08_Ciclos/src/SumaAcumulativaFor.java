public class SumaAcumulativaFor {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulativa usando for ***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        for (var numero = 1;numero <= 5;numero++){
            System.out.println("(acumuladorSuma + numero) -> "+ acumuladorSuma +" + "+numero);
            //realiza la suma acumulativa
            acumuladorSuma += numero;
            System.out.println("Suma parcial acumulada "+acumuladorSuma+"\n");
        }

        System.out.println("Suma de los primeros "+MAXIMO+" números: "+ acumuladorSuma);

    }
}
