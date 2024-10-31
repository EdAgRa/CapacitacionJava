public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        // Sin el uso de var
        String nombre1 = "Eduard";
        System.out.println("nombre1 = " + nombre1);
        // con el uso de var
        var nombre2 = "Pepito";
        System.out.println("nombre2 = " + nombre2);
        // Definir otras variables con var
        var edad = 45;// se infiere el tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F;// se infiere el tipo float
        System.out.println("sueldo = " + sueldo);
        var esCasado = false; // se infiere el tipo boolean
        System.out.println("esCasado = " + esCasado);
        esCasado = true;
        System.out.println("esCasado = " + esCasado);

        //esCasado = "NO";  es un error
        //var precio; es un error por que debe asignar un valor
        //var apellido = null; es un error por que debe asignar un valor


    }
}
