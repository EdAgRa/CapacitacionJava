package maquina_sncks_archivos.servicio;

import maquina_sncks_archivos.domino.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks{
    private final String NOMBRE_ARCHIVO = "snacks.txt";
    private List<Snack> snacks = new ArrayList<>(); //lista de snacks

    public ServicioSnacksArchivos() { //Constructor, clase
        //creamos el archivo si no existe
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try {
            existe = archivo.exists(); //cambia la variable con false o true
            if (existe){// pregunta si existe
                this.snacks = obtenerSnacks();
            }
            else {//si no existe crea el archivo en blanco
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Archivo se ha creado");
            }
        }catch (Exception e){
            System.out.println("Error Creando Archivo"+e.getMessage());
            e.printStackTrace();
        }
        if (!existe)  //Si no existe, cargamos algunos snacks iniciales
            cargarSnacksIniciales();

    }

    private void cargarSnacksIniciales() {//method para agregar snacks
        this.agregarSnack(new Snack("Papas",70.0));
        this.agregarSnack(new Snack("Refresco",50.5));
        this.agregarSnack(new Snack("Sandwich",120.0));
    }

    private List<Snack> obtenerSnacks() {//metodo para obtener la lista del archivo
        var snacks = new ArrayList<Snack>();//es una variable temporal interna
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));//Lee las líneas del archivo
            for (String linea : lineas) {//Recorremos los registros del archivo
                String[] lineasSnack = linea.split(";");//separa la lina por el caractér ingresado y asi arma el arreglo
                var idSnack = lineasSnack[0];// no se usa para nuestro ejercicio
                var nombre = lineasSnack[1];
                var precio = Double.parseDouble(lineasSnack[2]);
                var snack = new Snack(nombre,precio);// variable con la estructura para la adición
                snacks.add(snack);//agrega el snack leído a la lista
            }
        }catch (Exception e){
            System.out.println("Error Obteniendo Snacks"+e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }

    @Override
    public void agregarSnack(Snack snack) {
        this.snacks.add(snack);//Agregamos el snack pero en la lista en memoria
        this.agregarSnackArchivo(snack);//Guardamos el snack en el archivo
    }

    private void agregarSnackArchivo(Snack snack) {//metodo para escribir en el archivo
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);//abrir el archivo
        try{
            anexar = archivo.exists();//variable par identificar si se agrega o sobreescribe
            var salida = new PrintWriter(new FileWriter(archivo, anexar));//Se prepara para escribir
            salida.println(snack.escribirSnack());//Escribe el registro y con el metodo le digo como escribirlo
            salida.close();//Guardar el archivo con el cambio
        }catch (Exception e){
            System.out.println("Error Agregando Snack"+e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void mostrarSnacks() {//metodo para mostrar el inventario de Snacks
        System.out.println("--- Inventario de Snacks ---");
        var inventarioSnacks = "";//variable para poner lista
        for (var snack : this.snacks) {//recorre la lista para llenar la variable
            inventarioSnacks += snack.toString()+"\n";// el toString es un formato a escribir
        }
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnack() {
        return this.snacks;
    }
}
