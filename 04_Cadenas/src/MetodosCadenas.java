public class MetodosCadenas {
    public static void main(String[] args) {
        System.out.println("*** Métodos de cadenas ***");
        var cadena1 = "Hola Mundo";

        //Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        //Reemplazar caracteres
        var nuevaCadena = cadena1.replace("o","A");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Convertir a Mayúsculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);
        //Convertir en Minúsculas
        System.out.println("minusculas = " + cadena1.toLowerCase());

        //Eliminar espacios al inicio y al final
        var cadena2 = "      Eduard Aguacía       ";
        System.out.println("cadena2 con espacios= " + cadena2);
        System.out.println("cadena2 sin espacios= " + cadena2.trim());

    }
}
