package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        var anexar = false;//esta variable se usa para false=sobreescribir, true=agregar contenido
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        var consola = new Scanner(System.in);
        try{
            anexar = archivo.exists();//válida si el archivo existe y cambia la variable para sobreescribir o agregar contenido
            var salida = new PrintWriter(new FileWriter(archivo, anexar)); //abre el archivo y válida si sobreescribe o agrega
            System.out.print("Ingrese Nuevo texto que desea agregar: ");//pedimos el nuevo contenido
            var nuevoTexto = consola.nextLine();//el usuario lo suministra por consola
            salida.println(nuevoTexto);//escribimos en el archivo
            salida.close();//para que se guarde nueva información y cerramos el archivo
            System.out.println("Texto agregado correctamente");//mensaje en consola de éxito
        }catch (Exception e){
            System.out.println("Error: Escribiendo el archivo" +e.getMessage());
            e.printStackTrace();
        }
    }
}
