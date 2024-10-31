public class BusquedaSubcadenas {
    public static void main(String[] args) {
        System.out.println("*** Buscar Subcadenas ***");
        // indexOf() - devuelve el indice de la primera aparición de la subcadena
        var cadena1 = "Hola Mundo";
        //Subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        // lastIdenxOf - devuelve el índice de la última aparición de la subcadena
        //Subcadena a buscar "Mundo"
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        // subcadena no encontrada devuelve -1
        var cadena3 = cadena1.indexOf("Java");
        System.out.println("cadena3 con indexOf()= " + cadena3);
        var cadena4 = cadena1.lastIndexOf("Java");
        System.out.println("cadena4 con lastIndexOf()= " + cadena4);
    }
}
