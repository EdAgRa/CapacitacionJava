import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        System.out.println("*** Leer distintos tipos de datos ***");
        // tipo entero
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad+" Años");
        // tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        // Consumir el caracter de saldo de línea
        // esto después de un tipo número y antes de un string
        consola.nextLine();
        // leer tipo String
        System.out.print("Ingresa tu Nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
        // Conversion de datos
        System.out.print("Proporciona un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);
        // tipo flotante
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
        // Boolean.parseBoolean()
        System.out.print("Proporciona un valor booleano (true/false): ");
        boolean booleano = Boolean.parseBoolean(consola.nextLine());
        System.out.println("booleano = " + booleano);
        // Long.parseLong()
        System.out.print("Proporciona un valor largo: ");
        long largo = Long.parseLong(consola.nextLine());
        System.out.println("largo = " + largo);
        // Short.parseShort()
        System.out.print("Proporciona un valor corto: ");
        short corto = Short.parseShort(consola.nextLine());
        System.out.println("corto = " + corto);
        // Byte.parseByte()
        System.out.print("Proporciona un valor byte: ");
        byte byteValue = Byte.parseByte(consola.nextLine());
        System.out.println("byte = " + byteValue);
        //Character no tiene un método parse
        //pero se puede usar para un único carácter
        System.out.print("Proporciona un solo carácter: ");
        char caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);

    }
}
