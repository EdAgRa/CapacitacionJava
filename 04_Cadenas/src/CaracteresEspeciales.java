public class CaracteresEspeciales {
    public static void main(String[] args) {
        System.out.println("*** Caracteres Especiales ***");
        // '\n' - imprimir un salto de lines
        var cadena1 = "Hola\nMundo";
        System.out.println("cadena1 = " + cadena1);
        //'\t'- tabulador
        var cadena2 = "\tHola\tMundo";
        System.out.println("cadena2 = " + cadena2);
        // '\'' - comilla simple
        var cadena3 = "Hola \'Mundo";
        System.out.println("cadena3 = " + cadena3);
        // '\"' - comilla Doble
        var cadena4 = "Hola \"Mundo";
        System.out.println("cadena4 = " + cadena4);
        // '\\' - Diagonal Invertida
        var cadena5 = "Hola \\Mundo";
        System.out.println("cadena5 = " + cadena5);
    }
}