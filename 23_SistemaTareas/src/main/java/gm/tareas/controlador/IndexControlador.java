package gm.tareas.controlador;

import gm.tareas.modelo.Tarea;
import gm.tareas.servicio.TareaServicio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ResourceBundle;

@Component
public class IndexControlador implements Initializable {
    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    @Autowired
    private TareaServicio tareaServicio;

    @FXML
    private TableView<Tarea> tareaTabla;

    @FXML
    private TableColumn<Tarea, Integer> idTareaColumna;

    @FXML
    private TableColumn<Tarea, String> nombreTareaColumna;

    @FXML
    private TableColumn<Tarea, String> responsableColumna;

    @FXML
    private TableColumn<Tarea, String> descripcionColumna;

    @FXML
    private TableColumn<Tarea, String> estatusColumna;

    private final ObservableList<Tarea> tareasLista = FXCollections.observableArrayList();//refresca la ventana

    @FXML
    private TextField nombreTareaTexto;

    @FXML
    private TextField responsableTexto;

    @FXML
    private TextField descripcionTexto;

    @FXML
    private ComboBox<String> estatusTexto;

    private Integer idTareaInterno;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tareaTabla.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);//Para que solo se seleccione una registro de la tabla
        estatusTexto.getItems().addAll("Por Definir","Activa", "Cerrada","Pendiente");
        configurarColumnas();
        listarTareas();
    }

    private void configurarColumnas() {
        idTareaColumna.setCellValueFactory(new PropertyValueFactory<>("idTarea"));
        nombreTareaColumna.setCellValueFactory(new PropertyValueFactory<>("nombreTarea"));
        responsableColumna.setCellValueFactory(new PropertyValueFactory<>("responsable"));
        descripcionColumna.setCellValueFactory(new PropertyValueFactory<>("descripcionTarea"));
        estatusColumna.setCellValueFactory(new PropertyValueFactory<>("estatus"));
    }

    private void listarTareas() {
        tareasLista.clear();//limpia el objeto lista
        tareasLista.addAll(tareaServicio.listarTareas());//Trae la info de la db
        tareaTabla.setItems(tareasLista);//agrega la información a la tabla

    }

    public void agregarTarea() {
        if (nombreTareaTexto.getText().isEmpty()) {// si la caja de nombre esta vacía
            mostrarMensaje("Error Validación", "Debe Proporcionar una tarea");
            nombreTareaTexto.requestFocus();//Ubica el cursor en la caja
            return;
        } else {
            var tarea = new Tarea();
            recolectarDatosFromulario(tarea);
            tarea.setIdTarea(null);//limpia el valor del id interno
            tareaServicio.guardarTarea(tarea);//guearda los datos en la DB
            mostrarMensaje("Información", "Tarea Agregada");//Mensaje de confirmación
            limpiarFormulario();//limpia el Formulario
            listarTareas();//carga de nuevo la tabla de la ventana
        }
    }

    public void cargarTareaFormulario() {
        var tarea = tareaTabla.getSelectionModel().getSelectedItem();
        if (tarea != null) {
            idTareaInterno = tarea.getIdTarea();
            nombreTareaTexto.setText(tarea.getNombreTarea());
            responsableTexto.setText(tarea.getResponsable());
            descripcionTexto.setText(tarea.getDescripcionTarea());
            // Buscar el valor en el ComboBox y seleccionarlo
            var indice = estatusTexto.getItems().indexOf(tarea.getEstatus());
            if (indice >= 0) {
                estatusTexto.getSelectionModel().select(indice);
            } else {
                estatusTexto.getSelectionModel().clearSelection(); // Limpiar selección si no encuentra el valor
            }
        }
    }

    private void recolectarDatosFromulario(Tarea tarea) {//Método para capturar los datos del formulario
        if (idTareaInterno != null)
            tarea.setIdTarea(idTareaInterno);
        tarea.setNombreTarea(nombreTareaTexto.getText());
        tarea.setResponsable(responsableTexto.getText());
        tarea.setDescripcionTarea(descripcionTexto.getText());
        if (estatusTexto.getValue() != null)
            tarea.setEstatus(estatusTexto.getValue());
        else
            estatusTexto.getSelectionModel().select(0);
            tarea.setEstatus(estatusTexto.getValue());
    }

    @FXML
    private void modificarTarea() {
        if (idTareaInterno == null) {
            mostrarMensaje("Información", "Debe seleccionar una tarea");
            return;
        }
        if (nombreTareaTexto.getText().isEmpty()) {
            mostrarMensaje("Error Validación", "Debe Proporcionar una tarea");
            nombreTareaTexto.requestFocus();//Ubica el cursor en la caja
            return;
        }
        var tarea = new Tarea();
        recolectarDatosFromulario(tarea);
        tareaServicio.guardarTarea(tarea);
        mostrarMensaje("Información", "Tarea Modificada");
        limpiarFormulario();
        listarTareas();
    }

    @FXML
    private void eliminarTarea() {
        var tarea = tareaTabla.getSelectionModel().getSelectedItem();
        if (tarea != null) {
            logger.info("Registro a eliminar: " + tarea.toString());
            tareaServicio.eliminarTarea(tarea);
            mostrarMensaje("Informació n", "Tarea :" + tarea.getIdTarea() + " - " + tarea.getNombreTarea() + "; Eliminada");
            limpiarFormulario();
            listarTareas();
        } else {
            mostrarMensaje("Error", "No se ha seleccionado ninguna tarea");
        }
    }

    public void limpiarFormulario() {
        idTareaInterno = null;
        nombreTareaTexto.clear();
        responsableTexto.clear();
        descripcionTexto.clear();
        estatusTexto.getSelectionModel().clearSelection(); // Limpiar selección si no encuentra el valor
    }

    private void mostrarMensaje(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);//tipo de mensaje
        alerta.setTitle(titulo);//título del mensaje
        alerta.setHeaderText(null);//cabecera del menaje (nulo)
        alerta.setContentText(mensaje);//contenido del mensaje
        alerta.showAndWait();//muestra el mensaje y espera a que se cierre el mensaje
    }

}
