package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	@Autowired
	private IClienteServicio clienteServicio;

	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

	static String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("*****************************");
		logger.info("***.::Inicio Aplicación::.***");
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info(nl+ """
						***.::Aplicación Finalizada::.***
						*********************************"""+nl);
	}

	@Override
	public void run(String... args) throws Exception {
		 ejecutarZonaFitApp();
	}

	private void ejecutarZonaFitApp() {
		var salir = false;
		var consola = new Scanner(System.in);
		while (!salir) {
			try {
				var opcion = mostarmenu(consola);
				salir = ejecutarOpciones(consola,opcion);
			}
			catch (Exception e) {
				logger.error("Error: Ejecutando Opciones; "+nl+e.getMessage());
			}
			logger.info(nl);
		}
	}

	private int mostarmenu (Scanner consola) {
		logger.info(nl+ """
						**********************
						*** ZONA FIT (GYM) ***
						**********************
						""");
		logger.info("""
				Menu:
				\t1. Listar Clientes.
				\t2. Buscar cliente.
				\t3. Agregar cliente.
				\t4. Modificar cliente.
				\t5. Eliminar cliente.
				\t6. Salir.
				Elige una Opción:\s""");
		return Integer.parseInt(consola.nextLine());
	}

	private boolean ejecutarOpciones(Scanner consola,
									 int opcion) {
		var salir = false;
		switch (opcion) {
			case 1 ->{
				logger.info(nl+"--- Listado de Clientes ---"+nl);
				List<Cliente> clientes = clienteServicio.listarClientes();
				clientes.forEach(cliente -> logger.info(cliente.toString()+nl));

            }
			case 2 -> {
				logger.info(nl+"--- Buscar cliente ---"+nl);
				logger.info("Ingrese el Parametro de búsqueda (id): ");
				var idBuscar = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idBuscar);
				if(cliente != null)
					logger.info("Resultado de la Búsqueda : "+nl+"\t"+cliente.toString());
				else
					logger.info("Cliente con el Id: "+idBuscar+", No fue Encontrado");
			}
			case 3 ->{
				logger.info(nl+"--- Agregar cliente ---"+nl);
				logger.info("Ingrese el Nombre del Cliente: ");
				String nombre = consola.nextLine();
				logger.info("Ingrese el Apellido del Cliente: ");
				var apellido = consola.nextLine();
				logger.info("Ingrese Número de Membresía del Cliente: ");
				var membresia = Integer.parseInt(consola.nextLine());
				var nuevocliente = new Cliente();
				nuevocliente.setNombre(nombre);
				nuevocliente.setApellido(apellido);
				nuevocliente.setMembresia(membresia);
				try {
					clienteServicio.guardarCliente(nuevocliente);
					logger.error("Cliente Agregado:  "+nl+"\t"+nuevocliente.toString());
				}
				catch (Exception e) {
					logger.error("Error: Agregando Cliente; "+nl+e.getMessage());
				}
			}
			case 4 -> {
				logger.info(nl+"--- Modificar cliente ---"+nl);
				logger.info("Ingrese el Id que desea Modificar: ");
				var idModificar = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idModificar);
				if(cliente != null) {
					logger.info("Cliente a Modificar : " + nl + "\t" + cliente.toString());
					logger.info(nl+"Ingrese Nuevo Nombre del Cliente: ");
					var nombre = consola.nextLine();
					logger.info("Ingrese Nuevo Apellido del Cliente: ");
					var apellido = consola.nextLine();
					logger.info("Ingrese el Nuevo Número de Membresía del Cliente: ");
					var membresia = Integer.parseInt(consola.nextLine());
					cliente.setNombre(nombre);
					cliente.setApellido(apellido);
					cliente.setMembresia(membresia);
					try {
						clienteServicio.guardarCliente(cliente);
						logger.error("Cliente Modificado:  "+nl+"\t"+cliente.toString());
					}
					catch (Exception e) {
						logger.error("Error: Modificando Cliente; "+nl+e.getMessage());
					}
				}
				else
					logger.info("\tCliente con el Id: "+idModificar+", No fue Encontrado");
			}
			case 5 ->{
				logger.info(nl+"--- Eliminar cliente ---"+nl);
				logger.info("Ingrese el Id que desea Eliminar: ");
				var idEliminar = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idEliminar);
				if(cliente != null) {
					try {
						clienteServicio.eliminarCliente(cliente);
						logger.error("Cliente Eliminado:  "+nl+"\t"+cliente.toString());
					}
					catch(Exception e){
						logger.error("Error: Eliminando Cliente; "+nl+e.getMessage());
					}
				}
				else logger.info("\tCliente con el Id: "+idEliminar+", No fue Encontrado");
			}
			case 6 ->{
				logger.info(nl+"--- Vuelva Pronto!!! ---");
				salir = true;
			}
			default -> logger.info(nl+"--- Opción Invalida ---");
		}
		return salir;
	}
}



