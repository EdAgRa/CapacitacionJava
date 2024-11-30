public class ManjoSubcadenas {
    public static void main(String[] args) {
        System.out.println("*** manejo de Subcadenas ***");

        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // subcadena
        var subcadena1 = cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);
        var subcadena2 = cadena1.substring(5);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
