package zona_fit.datos;


import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import zona_fit.conexion.Conexion;
import zona_fit.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static zona_fit.conexion.Conexion.getConexion;


public class ClienteDAO implements IClienteDao{
    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();//se define una lista de objetos inicializada con un arregle
        PreparedStatement ps;//Esto para preparar la sentencia de base de datos
        ResultSet rs;// esta interface tiene el resultado de la consulta
        Connection con = getConexion();//Objeto de conexión de manera abreviada usando (import static zona_fit.conexion.Conexion.getConexion;)
        var sql = "SELECT * " +
                  "  FROM cliente " +
                  " ORDER BY id";//sentencia sql
        try {
            ps = con.prepareStatement(sql);//realizamos la consulta
            rs = ps.executeQuery();//obtenemos el resultado de la sentencia
            while (rs.next()) {//recorremos los datos de la consulta con ayuda del metodo next() para posicionarnos en primer registro si lo hay
                var cliente = new Cliente();//recibe los datos obtenidos a continuación por casa registro
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                clientes.add(cliente);// agrega a la lista de clientes
            }
        }catch (Exception e) {
            System.out.println("Error: Consultando cliente; "+e.getMessage());
            e.printStackTrace();
        }
        finally {
            try {
                con.close();//cerramos la conexión de DB
            }
            catch (Exception e) {
                System.out.println("Error: Cerrando conexión; "+e.getMessage());
            }
        }
        return clientes;//retorna toda la lista de todos los registros
    }

    @Override
    public boolean buscarCliente(Cliente cliente) {
        PreparedStatement ps;//Esto para preparar la sentencia de base de datos
        ResultSet rs;// esta interface tiene el resultado de la consulta
        Connection con = getConexion();//Objeto de conexión de manera abreviada usando (import static zona_fit.conexion.Conexion.getConexion;)
        String sql = "SELECT * " +
                  "  FROM cliente " +
                  " WHERE id = ?" ;//solo recupera un regristro
        try {
            ps = con.prepareStatement(sql);//prepara la consulta
            ps.setInt(1, cliente.getId());//Envía un parametro específico a la consulta
            rs = ps.executeQuery();//recibimos el resultado
            if (rs.next()) {//pregunta si tenemos un registro y se posiciones en el
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                return true;
            }
        }
        catch (Exception e) {
            System.out.println("Error: Buscando cliente por id; "+e.getMessage());
        }
        finally {
            try {
                con.close();
            }
            catch (Exception e) {
                System.out.println("Error: Cerrando conexión; "+e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;//Esto para preparar la sentencia de base de datos
        Connection con = getConexion();//Objeto de conexión de manera abreviada usando (import static zona_fit.conexion.Conexion.getConexion;)
        String sql = "INSERT INTO cliente(nombre,apellido,membresia) " +
                  "             VALUES(?,?,?)";//inserta un registro
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.executeUpdate();
            return true;
            //return ps.executeUpdate() > 0; una forma abreviada
        }
        catch (Exception e) {
            System.out.println("Error: Agregando cliente; "+e.getMessage());
        }
        finally {
            try {
                con.close();
            }
            catch (Exception e) {
                System.out.println("Error: Cerrando conexión; "+e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        PreparedStatement ps;//Esto para preparar la sentencia de base de datos
        Connection con = getConexion();//Objeto de conexión de manera abreviada usando (import static zona_fit.conexion.Conexion.getConexion;)
        String sql = "UPDATE cliente " +
                  "   SET  nombre = ?,"+
                        " apellido = ?,"+
                        " membresia = ?"+
                  " WHERE id = ?" ;//Para actualizar un registro
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.setInt(4, cliente.getId());
            ps.execute();
            return true;
        }
        catch (Exception e) {
            System.out.println("Error: Actualizando cliente por id; "+e.getMessage());
        }
        finally {
            try {
                con.close();
            }
            catch (Exception e) {
                System.out.println("Error: Cerrando conexión; "+e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        PreparedStatement ps;//Esto para preparar la sentencia de base de datos
        Connection con = getConexion();//Objeto de conexión de manera abreviada usando (import static zona_fit.conexion.Conexion.getConexion;)
        String sql = "DELETE " +
                  "  FROM cliente " +
                  " WHERE id = ?" ;//solo borra un regristro
        try {
            ps = con.prepareStatement(sql);//prepara la consulta
            ps.setInt(1, cliente.getId());//Envía un parametro específico a la consulta
            ps.execute();
            return true;
        }
        catch (Exception e) {
            System.out.println("Error: Borrando cliente por id; "+e.getMessage());
        }
        finally {
            try {
                con.close();
            }
            catch (Exception e) {
                System.out.println("Error: Cerrando conexión; "+e.getMessage());
            }
        }
        return false;
    }
                              //=============================//
                             //====prueba temporal local====//
                            //=============================//
    public static void main(String[] args) {
        IClienteDao clienteDao = new ClienteDAO();
// buscar cliente
//        var cliente1 = new Cliente(4);
//        System.out.println("Cliente antes de la búsqueda: "+cliente1);
//        var encontrado = clienteDao.buscarCliente(cliente1);
//        if(encontrado)
//            System.out.println("\nCliente Encontrado: "+cliente1);
//        else
//            System.out.println("\nCliente No Encontrado: "+cliente1);
// insertar cliente
//        var nuevoCliente = new Cliente("Eduard","Aguacía",300);
//        var agregado = clienteDao.agregarCliente(nuevoCliente);
//        if(agregado)
//            System.out.println("\nCliente Agregado: "+nuevoCliente);
//        else
//            System.out.println("\nCliente No Agregado: ");
// Modificar cliente
//        var clienteModificado = new Cliente(7,"Marco Aurelio","Agameino",400);
//        var agregado = clienteDao.modificarCliente(clienteModificado);
//        if(agregado)
//            System.out.println("\nCliente Agregado: "+clienteModificado);
//        else
//            System.out.println("\nCliente No Agregado: ");
// borrando cliente
        var borrarCliente = new Cliente(13);
        var borrado = clienteDao.eliminarCliente(borrarCliente);
        if(borrado)
            System.out.println("\nCliente Borrado: "+borrarCliente);
        else
            System.out.println("\nCliente No Borrado: ");
// listar cliente
        System.out.println("*** Listar Clientes ***");
        var clientes = clienteDao.listarClientes();
        clientes.forEach(System.out::println);
    }
}
