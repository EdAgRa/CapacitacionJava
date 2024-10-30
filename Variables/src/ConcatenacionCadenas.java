public class ConcatenacionCadenas {
    public static void main(String[] args) {
        System.out.println("*** Concatenacion de Cadenas ***");
        var nombre = "Eduard";
        var apellido = "Aguacía";
        var numero = 666;
        // concatenacion sin espacio
        var nombreCompleto = nombre+apellido;
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("numero = " + numero);
        System.out.println();
        System.out.println("nombreCompleto = " + nombreCompleto);
        // concatenacion con espacio
        nombreCompleto = nombre+" "+apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);
        // concatenacion con numeros al final
        nombreCompleto = nombre+" "+apellido+"; "+numero;
        System.out.println("nombreCompleto = " + nombreCompleto);
        // concatenacion con numeros al inicio
        nombreCompleto = numero+"; "+nombre+" "+apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);
        // concatenacion con numeros al medio
        nombreCompleto = nombre+" "+ numero+"; "+apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);
    }
}
