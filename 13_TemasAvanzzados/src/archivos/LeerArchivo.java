package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        //leer el archvo
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            System.out.println("Contenido del Archivo:");
            //Abrir el archivo para la lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            //leemos linea a linea
            var linea = entrada.readLine();
            //leemos todas las lineas
            while (linea != null) {
                System.out.println(linea);
                linea = entrada.readLine();
            }
            //cerrar el archivo
            entrada.close();
        }catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
