import java.util.Random;
import java.util.Scanner;

public class RetoGeneradorIDUnico {
    public static void main(String[] args) {
        System.out.println("*** Sistema Generador de ID Único ***");
        var consola = new Scanner(System.in);
        var random = new Random();

        //Solicita datos
        System.out.print("Digite el Nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Digite el Primer Apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Ingrese el año de Nacimiento(YYYY): ");
        var anioNacimiento = consola.nextLine();

        //Normalizo las cadenas
        var segmentoNombre = nombre.trim().toUpperCase().substring(0,2);
        var segmentoApellido = apellido.trim().toUpperCase().substring(0,2);
        var segmentoAnio = anioNacimiento.trim().substring(2);
        var aleatorio = random.nextInt(9999)+1;
        var aleatorioFormato = String.format("%04d",aleatorio);

        //Genero el ID único
        var idUnico = segmentoNombre+segmentoApellido+segmentoAnio+aleatorioFormato;

        //Mensaje Final
        System.out.printf( """
                %nHola %s %s,
                \tTu nuevo número de identificación (ID) generado por el sistema es:
                \t%s
                \t¡Felicidades! 
                """,nombre,apellido,idUnico);


    }
}
