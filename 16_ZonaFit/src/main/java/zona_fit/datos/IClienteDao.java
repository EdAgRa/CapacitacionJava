package zona_fit.datos;

import zona_fit.dominio.Cliente;
import java.util.List;

public interface IClienteDao {
    List<Cliente> listarClientes();//metodo devuelve una objeto de tipo lista
    boolean buscarCliente(Cliente cliente); //Metodo pra buscar Cliente regresa un Booleano
    boolean agregarCliente(Cliente cliente);//metodo pra adicionar un cliente
    boolean modificarCliente(Cliente cliente);//metodo de actualizacion de registro
    boolean eliminarCliente(Cliente cliente);// metodo para eliminar

}
