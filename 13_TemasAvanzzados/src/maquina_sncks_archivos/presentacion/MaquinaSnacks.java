package maquina_sncks_archivos.presentacion;

import maquina_sncks_archivos.domino.Snack;
import maquina_sncks_archivos.servicio.IServicioSnacks;
import maquina_sncks_archivos.servicio.ServicioSnacksArchivos;
import maquina_sncks_archivos.servicio.ServicioSnacksLista;

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
        //IServicioSnacks servicioSnacks = new ServicioSnacksLista();//Creamos el objeto para obtener el servicio de snacks (lista)
        IServicioSnacks servicioSnacks = new ServicioSnacksArchivos();//Creamos el objeto para obtener el servicio de snacks (Archivo)
        //Crear la lista de productos (tiquete)de tipo Snackt
        List<Snack> productos = new ArrayList<>(); //Definimos el arreglo de la lista de productos del inventario
        System.out.println("*** Maquina de Snacks ***");
        servicioSnacks.mostrarSnacks();//Muestra el inventario de snacks disponibles con el servicio
        while (!salir){//Ciclo de la máquina de Snacks
            try { //Control de Exception general
                var opcion = mostarMenu(consola);
                salir = ejecutarOpciones(opcion,consola,productos,servicioSnacks);
            }catch (Exception e){
                System.out.println("Ocurrió un Error: "+e.getMessage());
            }
            finally {//Siempre se ejecuta imprime un salto de línea en cada iteración
                System.out.println();
            }
        }
    }

    private static int mostarMenu(Scanner consola){//Metodo para mostrar las opciones de menu y tomar la opción seleccionada
        System.out.print("""
                Menu:
                1. Comprar Snack
                2. Mostar Ticket de Compra
                3. Agregar Nuevo Snack
                4. Inventario de Snacks Disponibles
                5. Salir
                Elige una Opción:\s""");
        //leemos y retornamos la opción seleccionada
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola,
                                            List<Snack> productos,
                                            IServicioSnacks servicioSnacks){//Metodo que indica si continuamos o salimos
        var salir = false;
        switch (opcion){//Evalúa la opción seleccionada y ejecuta según sea
            case 1 -> compraSnack(consola,productos, servicioSnacks);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola, servicioSnacks);
            case 4 -> listarInventarioSnacks(consola, servicioSnacks);
            case 5 -> {
                System.out.println("Regresa Pronto!");
                salir = true;
            }
            default -> System.out.println("Opción "+opcion+", Es Invalida");
        }
        return salir;
    }

    private static void listarInventarioSnacks(Scanner consola,
                                               IServicioSnacks servicioSnacks){
        servicioSnacks.mostrarSnacks();
    }

    private static void compraSnack(Scanner consola, List<Snack> productos,
                                    IServicioSnacks servicioSnacks){//Metodo para operar la opción 1 (Comprar Snack)
        System.out.print("Que snack quieres comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine());//Lee el valor ingresado por consola (Opción de Snack)
        //validación que exista el snack en la lista de snacks
        var snackEncontrado = false;
        for(var snack: servicioSnacks.getSnack()){//Recorre la lista (for(eatch)) para comparar y validar que exista el snack)
            if(idSnack == snack.getIdSnack()){ //valido si es igual el id de la consola con la de la lista de inventario
                productos.add(snack);//agrega el snack al Ticket si existe
                System.out.println("Ok, Snack "+snack+", Agregado.");
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado){ //si no existe
            System.out.println("Id de Snack "+idSnack+", No encontrado.");
        }
    }

    private static void mostrarTicket(List<Snack> productos){//Metodo para mostrar el ticket de venta con los productos comprados
        var ticket = "*** Ticket de Venta ***";
        var total = 0.0;
        for(var producto:productos){//recorro los productos de la lista de compra
            ticket += "\n\t-"+ producto.getNombre()+"- $"+producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\t-Total -> $"+total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner consola, IServicioSnacks servicioSnacks){
        System.out.print("Nombre del nuevo snack: ");
        var nombre  = consola.nextLine();
        System.out.print("Precio del nuevo snack: ");
        var precio  = Double.parseDouble(consola.nextLine());
        servicioSnacks.agregarSnack(new Snack(nombre,precio));
        System.out.println("El snack se agrego correctamente");
        servicioSnacks.mostrarSnacks();
    }
}
