package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        try {
            //leer todas las lineas del archivo
            List<String> lines = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del Archivo: ");
//            for (String line : lines) {
//                System.out.println(line);
//            } una forma de leer
            lines.forEach(System.out::println);//otra manera de leer
        } catch (Exception e) {
            System.out.println("Error: Al leer todo el archvo" + e.getMessage());
            e.printStackTrace();
        }
    }
}
