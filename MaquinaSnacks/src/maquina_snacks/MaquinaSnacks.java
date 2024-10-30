package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks(); //llamado del metodo
    }

    public static void maquinaSnacks(){//Metodo de operación modo de ejecución
        var salir = false;
        var consola = new Scanner(System.in);//objeto para capturar datos de la consola
        //Crear la lista de productos (tiquete)de tipo Snackt
        List<Snacks> productos = new ArrayList<>(); //Definimos el arreglo de la lista
        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnacks();//Muestra el inventario de snacks disponibles
        while (!salir){//Ciclo de la máquina de Snacks
            try { //Control de Exception general
                var opcion = mostarMenu(consola);
                salir = ejecutarOpciones(opcion,consola,productos);
            }catch (Exception e){
                System.out.println("Ocurrió un Error: "+e.getMessage());
            }
            finally {//Siempre se ejecuta imprime un saldo de línea en cada iteración
                System.out.println();
            }
        }
    }

    private static int mostarMenu(Scanner consola){//Metodo para mostrar las opciones de menu
        System.out.print("""
                Menu:
                1. Compar Snack
                2. Mostar Ticket de Compra
                3. Agregar Nuevo Snack
                4. Salir
                Elige una Opción:\s""");
        //leemos y retornamos la opción seleccionada
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snacks> productos ){//Metodo que indica si continuamos o salimos
        var salir = false;
        switch (opcion){//Evalúa la opción seleccionada y ejecuta según sea
            case 1 -> compraSnack(consola,productos);

        }
        return salir;
    }

    private static void compraSnack(Scanner consola, List<Snacks> productos){//Metodo para operar la opción 1 (Comprar Snack)
        System.out.println("Que snack quieres comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine());//Lee el valor ingresado por consola (Opción de Snack)
        var snackEncontrado = false;
        for(var snack:Snacks.getSnacks()){//Recorre la lista (for(eatch)) para comparar y validar que exista el snack)
            if(idSnack == snack.getIdSnack()) { //agrega el snack al Ticket si existe
                productos.add(snack);
                System.out.println("El Snack no Existe...");
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado){ //si no existe
            System.out.println("Id de Snack "+idSnack+", No encontrado.");
        }
    }
}
