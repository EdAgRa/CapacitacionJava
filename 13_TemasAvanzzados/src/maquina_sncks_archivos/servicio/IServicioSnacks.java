package maquina_sncks_archivos.servicio;

import maquina_sncks_archivos.domino.Snack;//es importante que sea el correcto Ójó

import java.util.List;

public interface IServicioSnacks {
    void agregarSnack(Snack snack);//definir el metodo para agregar
    void mostrarSnacks();//definir el metodo para mostrar
    List<Snack> getSnack();// define el metodo que retorna una lista

}
