public class Constanttes {
    public static void main(String[] args) {
        System.out.println("*** Constantes en Java ***");
        final var DIAS_SEMANA = 7;
        System.out.println("DIAS_SEMANA = " + DIAS_SEMANA);
        //DIAS_SEMANA = 8; esto es un error se define como constante
        final var PI = 3.141592;
        System.out.println("PI = " + PI);
        System.out.println("Math.PI = " + Math.PI);// Math es constante de la clase ya definida
        final var MENSAJE_BIENVEIDA = "Bienvenid@ a la Universidad Java";
        System.out.println("MENSAJE_BIENVEIDA = " + MENSAJE_BIENVEIDA);
        final var MINUTOS_POR_SEGUNDO = 60;
        System.out.println("MINUTOS_POR_SEGUNDO = " + MINUTOS_POR_SEGUNDO);

    }
}
