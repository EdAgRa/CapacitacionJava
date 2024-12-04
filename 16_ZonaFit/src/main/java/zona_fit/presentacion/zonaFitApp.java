package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDao;
import zona_fit.dominio.Cliente;
import java.util.Scanner;

public class zonaFitApp {
    public static void main(String[] args) {//Ejecucion del programa
        ejecutaZonaFitApp();//metodo con la estructura de ejecución
    }
    private static void ejecutaZonaFitApp() {//metodo con la estructura de ejecución
        var salir = false; // variable para controlar el flujo general
        var consola = new Scanner(System.in);//preparamos para recibir datos por consola
        IClienteDao clienteDAO = new ClienteDAO();//Objeto de la clase ClienteDAO interacciones DB
        while (!salir){
            try {
              var opcion =  mostrarMenu(consola);//metodo para listar las opciones de menu
                salir = ejecutarOpciones(consola, opcion, clienteDAO);// metodo para capturar la opcion de menu y da como saliea true o false para determinar la salida
            }
            catch (Exception e) {
                System.out.println("Error: Ejecutando Opciones: " + e.getMessage());
            }
            System.out.println();//salto de linea después de mostrar el menu
        }
    }
    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                *** ZONA FIT ***
                \tMenu:
                \t\t1. Listar Clientes.
                \t\t2. Buscar cliente.
                \t\t3. Agregar cliente.
                \t\t4. Modificar cliente.
                \t\t5. Eliminar cliente.
                \t\t6. Salir.
                \tElige una Opción:\s""");
        return Integer.parseInt(consola.nextLine());
    }
    private static boolean ejecutarOpciones(Scanner consola,
                                            int opcion,
                                            IClienteDao clienteDao) {
        var salir = false;
        switch (opcion) {
            case 1-> {//listado de clietes
                System.out.println("--- Listado Clientes ---");
                var clientes = clienteDao.listarClientes();
                clientes.forEach(System.out::println);
            }
            case 2-> {// buscar cliente
                System.out.println("--- Buscar Cliente por Id ---");
                System.out.print("\tIngrese parametro de búsqueda (id): ");
                var idBuscar = Integer.parseInt(consola.nextLine());
                var clienteBuscar = new Cliente(idBuscar);
                var resultadoBusqueda = clienteDao.buscarCliente(clienteBuscar);
                if(resultadoBusqueda)
                    System.out.println("Resulado de la Busqeda:\n\t"+clienteBuscar);
                else
                    System.out.println("Cliente con el id: "+idBuscar+", No fue Encontrado.");
            }
            case 3 -> {//Agregar clientes
                System.out.println("--- Agregar Cliente Nuevo ---");
                System.out.print("\tIngrese el nombre de cliente: ");
                var nombre = consola.nextLine();
                System.out.print("\tIngrese el apellido de cliente: ");
                var apellido = consola.nextLine();
                System.out.print("\tIngrese el numero de membresía del cliente: ");
                var membresia = Integer.parseInt(consola.nextLine());
                var clienteNuevo = new Cliente(nombre,apellido,membresia);
                var resultatoNuevo = clienteDao.agregarCliente(clienteNuevo);
                if(resultatoNuevo)
                    System.out.println("Cliente Agregado: \n\t"+clienteNuevo);
                else
                    System.out.println("Cliente "+clienteNuevo+", No fue Agregado");
            }
            case 4 ->{//Modificar clientes
                System.out.println("--- Modificar Datos del Cliente ---");
                System.out.print("\tIngrese el Id que quiere modificar (id): ");

                var idModificar = Integer.parseInt(consola.nextLine());
                var clienteBuscar = new Cliente(idModificar);
                var resultadoBusqueda = clienteDao.buscarCliente(clienteBuscar);

                if(resultadoBusqueda) {
                    System.out.println("\nCliente a Modificar:\n\t" + clienteBuscar);
                    System.out.print("\n\tIngrese Nuevo nombre de cliente: ");
                    var nombre = consola.nextLine();
                    System.out.print("\tIngrese Nuevo apellido de cliente: ");
                    var apellido = consola.nextLine();
                    System.out.print("\tIngrese Nuevo numero de membresía del cliente: ");
                    var membresia = Integer.parseInt(consola.nextLine());
                    var clienteModificar = new Cliente(idModificar, nombre, apellido, membresia);
                    var resultadoModificar = clienteDao.modificarCliente(clienteModificar);
                    if (resultadoModificar)
                        System.out.println("\nCliente Modificado:\n\t" + clienteModificar);
                    else
                        System.out.println("\nCliente No Fue Modificado: ");
                }else
                    System.out.println("Cliente con el id: "+idModificar+", No fue Encontrado.");
            }
            case 5 -> {//Eliminar clientes
                System.out.println("--- Eliminar Cliente ---");
                System.out.print("\tIngrese parametro de búsqueda (id): ");
                var idborrar = Integer.parseInt(consola.nextLine());
                var clienteBorrar = new Cliente(idborrar);
                var resultadoBorrado = clienteDao.eliminarCliente(clienteBorrar);
                if(resultadoBorrado)
                    System.out.println("\nCliente Borrado: "+idborrar);
                else
                    System.out.println("\nCliente No Borrado: ");
            }
            case 6 -> {
                System.out.println("--- Vuelva Pronto! ---");
                salir = true;
            }
            default -> System.out.println("Opción "+opcion+", Es Invalida");
        }
        return salir;
    }
}
