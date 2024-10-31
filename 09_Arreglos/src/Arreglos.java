import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        System.out.println("*** Arreglos Declaración, Modificación, Impresión ***");
        //Declaración inicial
        //1. declaración de arreglo
        int[] enteros;
        //2. Inicializar el arreglo
        enteros = new int[3];
        //Paso 1 y 2 en una sola linea
        int[] numeros2 = new int[2];
        var numeros3 = new int[2];

        //Modificaicón
        var enteros4 = new int[5];
        //modificar los elementos
        enteros4[0] = 13;
        enteros4[1] = 21;
        enteros4[4] = 62;
        //Impresion
        //System.out.println("valor 1 = " + enteros4[0]);
        //System.out.println("valor 2 = " + enteros4[1]);
        //System.out.println("valor 3 = " + enteros4[2]);
        //System.out.println("valor 4 = " + enteros4[3]);
        //System.out.println("valor 5 = " + enteros4[4]);
/*
        //Arreglos Declaracion y llenado
        int[] enteros5 = {100,200,300,400,500};
        var enterosVar = new int[]{100,200,300,400,500};
        // Ciclos(Iterar) con Arreglos
        for (var i = 0;i < enterosVar.length;i++)
            System.out.println("Indice: "+i+" = "+enterosVar[i]);
*/
        //Introducir valores a un arreglo
        var consola = new Scanner(System.in);
        //Declarar arreglo
        System.out.print("Proporcina el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        //Creamos de manera dinámica el arreglo
        var enterosDinamicos = new int[largoArreglo];
        // Ciclos(Iterar) con Arreglos
        for (var i = 0;i < largoArreglo;i++){
            System.out.print("digita el valor ["+i+"] : ");
            enterosDinamicos[i] = Integer.parseInt(consola.nextLine());
        }
        System.out.println("\nImpresión del Arreglo");
        for (var i = 0;i < largoArreglo;i++)
            System.out.println("Indice: "+i+" = "+enterosDinamicos[i]);




    }
}
