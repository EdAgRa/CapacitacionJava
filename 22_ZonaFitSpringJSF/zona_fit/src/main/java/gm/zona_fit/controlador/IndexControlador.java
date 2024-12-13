package gm.zona_fit.controlador;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //para que herede los servicios de Spring
@Data   //métodos Get y Set
@ViewScoped//porque es una página de una sola página
public class IndexControlador {

    @Autowired
    IClienteServicio clienteServicio;
    private List<Cliente> clientes;
    private Cliente clienteSeleccionado;
    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class.getName());


    @PostConstruct//Para llamar el método siguiente a este después de la construcción de la clase
    public void init() {
        cargarDatos();
    }

    public void cargarDatos() {//Método para cargar la lista consulta
        this.clientes = this.clienteServicio.listarClientes();
        this.clientes.forEach(cliente -> logger.info(cliente.toString()));//para validar por consola que haga la consulta
    }

    public void agregarCliente() {
        this.clienteSeleccionado = new Cliente();
    }

    public void guardarCliente() {
        logger.info("Guardar el cliente: " + this.clienteSeleccionado);
        if (this.clienteSeleccionado.getId() == null) {//nuevo regisntro
            this.clienteServicio.guardarCliente(this.clienteSeleccionado);
            this.clientes.add(this.clienteSeleccionado);//llena el objeto clinte con todos los datos a insertar
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente Agregado"));//mensaje de confirmación
        }
        else{//modificar registro
            this.clienteServicio.guardarCliente(this.clienteSeleccionado);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente Actualizado"));
        }
        PrimeFaces.current().executeScript("PF('ventanaModalCliente').hide()");//oculta la ventna modal
        PrimeFaces.current().ajax().update("forma-clientes:mensajes","forma-clientes:clientes-tabla");//actualiza la parte del mensaje de confirmación y la información de la tabla
        this.clienteSeleccionado = null;//limpia el objeto el cliente seleccionado
    }

    public void eliminarCliente() {
        logger.info("Eliminar el cliente: " + this.clienteSeleccionado);
        this.clienteServicio.eliminarCliente(this.clienteSeleccionado);
        this.clientes.remove(this.clienteSeleccionado);
        this.clienteSeleccionado = null;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente Eliminado"));
        PrimeFaces.current().ajax().update("forma-clientes:mensajes","forma-clientes:clientes-tabla");//actualiza la parte del mensaje de confirmación y la información de la tabla
    }
}
