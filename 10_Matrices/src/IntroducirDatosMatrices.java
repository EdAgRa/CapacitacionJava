import java.util.Scanner;

public class IntroducirDatosMatrices {
    public static void main(String[] args) {
        System.out.println("*** Introducir Datos en Matrices ***");

        int reglones, columnas;
        var consola = new Scanner(System.in);
        //Definimos la matriz
        System.out.print("Digite el número de renglones: ");
        reglones = Integer.parseInt(consola.nextLine());
        System.out.print("Digite el número de columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[reglones][columnas];
        //Solicitar los valores
        for (var ren = 0; ren < reglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.print("Digite el valor para ["+ren+"]["+col+"]: ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        //Iterar los valores de la matriz
        System.out.println();
        for (var ren = 0;ren < reglones;ren++){
            for (var col = 0;col < columnas;col++){
                System.out.println("Valor["+ren+"]["+col+"] = "+ matriz[ren][col]);
            }
        }
    }
}
