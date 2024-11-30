public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        System.out.println("*** Reemplazar Subcadenas ***");
         var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);

        //Reemplazar "Mundo" por "a Todos"
        var nuevaCadena = cadena.replace("Mundo", "a Todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        ////Reemplazar "Hola" por "Saludos"
        nuevaCadena = cadena.replace("Hola", "Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);

    }
}
