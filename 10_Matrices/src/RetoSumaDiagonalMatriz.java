import java.util.Scanner;

public class RetoSumaDiagonalMatriz {
    public static void main(String[] args) {
        System.out.println("*** Suma de la Diagonal de la Matriz");
        final var RENGLONES = 3;
        final var COLUMNAS = 3;
        var consola = new Scanner(System.in);
        var matriz = new int[RENGLONES][COLUMNAS];
        var suma = 0;
        //Solicito los valores de la matriz
        for (var fRen = 0;fRen < RENGLONES;fRen++){
            for (var fCol = 0;fCol < COLUMNAS;fCol++ ){
                System.out.print("Digite el valor ["+fRen+"]["+fCol+"]: ");
                matriz[fRen][fCol] = Integer.parseInt(consola.nextLine());
            }
        }
        //Tomo los datos de la diagonal para sumar
        for (var fRen = 0;fRen < RENGLONES;fRen++) {
            for (var fCol = 0; fCol < COLUMNAS; fCol++) {
                if (fRen == fCol ) {
                    suma += matriz[fRen][fCol];
                }
            }
        }
        System.out.printf("\nSuma Diagonal %d + %d + %d = %d %n",matriz[0][0],
                                                               matriz[1][1],
                                                               matriz[2][2],
                                                               suma);

    }
}
