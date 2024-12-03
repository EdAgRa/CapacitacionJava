package archivos;

import java.io.*;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try{
            if (archivo.exists()) {
                System.out.println("Archivo: " + archivo + " ya existe.");
            }
            else {
                //creamos el archvo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();//para que se guarde el archivo en el disco
                System.out.println("Se ha creado el archivo: " + archivo);
            }
        }catch (IOException e){
            System.out.println("Error: al crear el archivo" + e.getMessage());
            e.printStackTrace();
        }
    }
}
