package maquina_sncks_archivos.servicio;

import maquina_sncks_archivos.domino.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks{
    private static final List<Snack> snacks; //agregamos un atributo de tipo final por que no va a cambiar

    static{ //Bloque de tipo static Inicializador
        snacks = new ArrayList<>();//esto indica que no podemos asignar otro tipo de lista (por ser static), pero sin modificar la lista
        snacks.add(new Snack("Papas",70.0));// agrega un registra a la lista, con la característica de la clase tipo llave
        snacks.add(new Snack("Refresco",50.5));
        snacks.add(new Snack("Sandwich",120.0));
    }

    public void agregarSnack(Snack snack){//Metodo para insertar un nuevo snack a la lista
        snacks.add(snack);
    }

    public void mostrarSnacks(){//Metodo para mostrar la lista de inventario
        var inventarioSnacks = "";
        for(var snack:snacks){//llena la variable con los objetos del arreglo de la lista
            inventarioSnacks += snack.toString()+"\n";
        }
        System.out.println("--- Snacks en el Inventario ---");
        System.out.println(inventarioSnacks);// muestra en pantalla el inventario disponible
    }

    @Override
    public List<Snack> getSnack() {
        return snacks;
    }

}
