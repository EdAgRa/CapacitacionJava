import java.util.Scanner;

public class RetoEstacionAnio {
    public static void main(String[] args) {
        System.out.println("*** Estación del Año ***");

        final var INVIERNO = "Invierno";
        final var PRIMAVERA = "Primavera";
        final var VERANO = "Verano";
        final var OTONIO = "Otoño";
        var consola = new Scanner(System.in);

        System.out.print("Digite el número del mes: ");
        var mes = Integer.parseInt(consola.nextLine());

        if (mes==1 || mes==2 ||mes ==12){
            System.out.println("El mes "+mes+" Corresponde a Invierno");
        } else if (mes==3 || mes==4 ||mes ==5) {
            System.out.println("El mes "+mes+" Corresponde a Primavera");
        } else if (mes==6 || mes==7 ||mes ==8) {
            System.out.println("El mes "+mes+" Corresponde a Verano");
        } else if (mes==9 || mes==10 ||mes ==11) {
            System.out.println("El mes "+mes+" Corresponde a Otoño");
        }else{
            System.out.println("El mes "+mes+" Corresponde a una Estación Desconocida");
        }
    }
}
