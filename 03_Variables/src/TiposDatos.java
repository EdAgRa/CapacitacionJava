public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java
        // Enteros (valor defoult 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // Lo l par indicar que es tipo long
        System.out.println("tipoLong = " + tipoLong);

        // Punto flotante (valor defoult 0.0)
        float tipoFloat = 3.14F;// F o f para indicar que es tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDoble = 3.141516D;// D es opcional para indicar que es tipo Double

        // Caracter (Valor por default '\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (Referencia)
        String nombre = null; // Valor por default
        System.out.println("nombre = " + nombre);
        nombre = "Juan Perez";
        System.out.println("nombre = " + nombre);

    }
}
