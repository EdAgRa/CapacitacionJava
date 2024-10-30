public class ArgumentosVariables {
    public static void main(String[] args) {
        //imprimirNumeros(1,2,3,4,5);// varargs argumentos variables
        variosNumeros("Karla",10,20,30);// se debe colocar primero los que no son variables
    }

//    static void imprimirNumeros(int i, int i1, int i2, int i3, int i4) {
//    }
    private static void imprimirNumeros(int... numeros) {
        for(var i= 0; i < numeros.length;i++){
            System.out.print(numeros[i]+" ");
        }
    }

//    static void variosNumeros(String karla, int i, int i1, int i2) {
//    }
    static void variosNumeros(String nombre, int... numeros) {
        System.out.println("Nombre = " + nombre);
        imprimirNumeros(numeros);

    }

}
