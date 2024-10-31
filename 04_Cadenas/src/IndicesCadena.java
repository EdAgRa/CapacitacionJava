public class IndicesCadena {
    public static void main(String[] args) {
        System.out.println("*** Manejo de indices en una cadena ***");
        var cadena1 = "Hola Mundo";






        //recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0);
            System.out.println("primerCaracter = " + primerCaracter);
        //Recuperar el Último caracter
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        //Recuperar la letra m de la cadena1
        var caraterM = cadena1.charAt(5);
        System.out.println("caraterM = " + caraterM);

    }
}
