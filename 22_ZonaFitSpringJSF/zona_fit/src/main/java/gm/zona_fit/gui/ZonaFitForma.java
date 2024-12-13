package gm.zona_fit.gui;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//@Component
public class ZonaFitForma extends JFrame {
    private JPanel panelPrincipal;
    private JTable clientesTabla;
    private JTextField nombreTexto;
    private JTextField apellidoTexto;
    private JTextField membresiaTexto;
    private JButton guardarBoton;
    private JButton eliminarBoton;
    private JButton limpiarBoton;
    IClienteServicio clienteServicio;
    private DefaultTableModel tablaModeloClientes;//objeto que maneja los datos de la tabla
    private Integer idCliente; // objeto para el id valor default null

//    @Autowired
    public ZonaFitForma(ClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
        iniciarForma();
        clientesTabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cargarClienteSelecionado();
            }
        });
        guardarBoton.addActionListener(e -> guardarCliente());

        eliminarBoton.addActionListener(e -> borrarCliente());

        limpiarBoton.addActionListener(e -> limpiarFormulario());

    }

    private void iniciarForma() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        //this.tablaModeloClientes = new DefaultTableModel(0,4);// Objeto con la estructura de la tabla (filas(0 para luego incrementar dinámicamente), columnas)
        this.tablaModeloClientes = new DefaultTableModel(0,4){//Inhabilita la edición de los registros directamente de la tabla
            @Override
            public boolean isCellEditable(int row,int colum){
                return false;
            }
        };

        String [] encabezados = {"Id","Nombre","Apellido","Membresia"};//Arreglo para las columnas
        this.tablaModeloClientes.setColumnIdentifiers(encabezados);//envía el arreglo al objeto de estructura de la tabla
        this.clientesTabla = new JTable(tablaModeloClientes);
        this.clientesTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//tipo de selección de renglones en la tabla (uno solo)
        listarClientes();//llamado a los registros de la tabla
    }

    private void listarClientes() {
        this.tablaModeloClientes.setRowCount(0);//conteo de registros
        var clientes = this.clienteServicio.listarClientes();// variable que recibe el listado de clientes
        clientes.forEach(cliente -> {//for que recorre la lista
            Object[] renglonCliente = {//crea un objeto para armar el renglón con el arreglo
                    cliente.getId(),
                    cliente.getNombre(),
                    cliente.getApellido(),
                    cliente.getMembresia()
            };
            this.tablaModeloClientes.addRow(renglonCliente);//agrega el renglón a la estructura de la tabla

        });
    }

    private void guardarCliente() {
        if (nombreTexto.getText().equals("")) {//evalúa si el campo nombre está vacío
            mostrarMensaje("Ingrese el Nombre del Cliente");//método para ventana emergente
            nombreTexto.requestFocus();//ubica el foco en la caja para el nombre
            return;
        }
        if (membresiaTexto.getText().equals("")) {
            mostrarMensaje("Ingrese el valor de la Membresía del Cliente");//método para ventana emergente
            membresiaTexto.requestFocus();//ubica el foco en la caja para la membresía
            return;
        }

        var nombre = nombreTexto.getText();//captura el nombre en una variable
        var apellido = apellidoTexto.getText();//captura el apellido en una variable
        var membresia = Integer.parseInt(membresiaTexto.getText());//captura y convierte en Integer el apellido en una variable
        var cliente = new Cliente(this.idCliente,nombre,apellido,membresia);//Objeto de tipo cliente para procesar los datos
//se simplifica el código
//        cliente.setId(this.idCliente);//Se obtiene del objeto creado y null==insert-!=null==actualizar
//        cliente.setNombre(nombre);
//        cliente.setApellido(apellido);
//        cliente.setMembresia(membresia);

        this.clienteServicio.guardarCliente(cliente);//LLama el servicio y guarda los datos en el objeto cliente
        if (this.idCliente==null)
            mostrarMensaje("Cliente Agregado!");
        else
            mostrarMensaje("Cliente Actualizado!");

        limpiarFormulario();//limpia el formulario
        listarClientes();//recarga la tabla

    }

    private void borrarCliente() {
        if (this.idCliente != null) {
            var cliente = new Cliente();
            cliente.setId(this.idCliente);
            this.clienteServicio.eliminarCliente(cliente);
            mostrarMensaje("Cliente con Id: "+this.idCliente+", Borrado!");
            limpiarFormulario();//limpia el formulario
            listarClientes();//recarga la tabla
        }
        else
            mostrarMensaje("Seleccione el cliente que desea borrar!");
    }

    private void cargarClienteSelecionado() {
        var renglon = clientesTabla.getSelectedRow();// recupera lista de datos del renglón seleccionado
        if (renglon != -1) {//-1 sin registro
            var id = clientesTabla.getModel().getValueAt(renglon, 0).toString();
            this.idCliente = Integer.valueOf(id);// se asigna al objeto
            var nombre = clientesTabla.getModel().getValueAt(renglon,1).toString();
            this.nombreTexto.setText(nombre);//Se inserta en la caja nombre del formulario
            var apellido = clientesTabla.getModel().getValueAt(renglon,2).toString();
            this.apellidoTexto.setText(apellido);//Se inserta en la caja apellido del formulario
            var membresia = clientesTabla.getModel().getValueAt(renglon,3).toString();
            this.membresiaTexto.setText(membresia);//Se inserta en la caja membresía del formulario
        }
    }

    private void limpiarFormulario() {
       nombreTexto.setText("");
       apellidoTexto.setText("");
       membresiaTexto.setText("");
       idCliente = null;
       this.clientesTabla.getSelectionModel().clearSelection();//Quita el focus del registro seleccionado
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);//Muestra el mensaje
    }

}
