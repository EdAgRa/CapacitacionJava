package maquina_sncks_archivos.domino;

import maquina_sncks_archivos.servicio.ServicioSnacksLista;

import java.io.Serializable;
import java.util.Objects;

public class Snack extends ServicioSnacksLista implements Serializable {
    private static int contadorSnack = 0;
    private int idSnack;
    private String nombre;
    private double precio;

    public Snack(){//constructor vacío, característica de un javaBeans
        this.idSnack = ++Snack.contadorSnack;// incremento el idSnack antes de usarlo
    }

    public Snack(String nombre, double precio){// constructor de dos argumentos (llave,valor)
        this();// manda llamar el constructor vacío(linea 12), esto para no repetir la inicialización de la variable de idSnack
        //inicializa los demás atributos
        this.nombre = nombre;
        this.precio = precio;
    }

    //genera los metodos Get y Set
    public static int getContadorSnack() {
        return contadorSnack;
    }

    public int getIdSnack() {
        return idSnack;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Genera Sobreescribo el metodo toString
    @Override
    public String toString() {
        return "Snack{" +
                "idSnack=" + idSnack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public  String escribirSnack(){//metodo para escribir el archivo
        return idSnack + ";" + nombre + ";" + precio + ";";
    }

    //Genera los metodos recomendados con el uso de listas equals() y hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}
