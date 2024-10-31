public class ComparacionCadenas {
    public static void main(String[] args) {
        System.out.println("*** Comparacion de cadenas en Java (pool de cadenas)***");
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        // Comparacion de cadenas (==) comparta la referencia
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);
        // comparacion de cadena1 y cadena3 pero en referencias
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        // Comparacion de cadena1 y cadena3 pero en contenido usamos el metodo eguals
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
