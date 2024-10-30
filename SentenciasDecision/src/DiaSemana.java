import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("*** Dia Semana Sentencia Switch***");

        var consola = new Scanner(System.in);
        System.out.print("Digite el Numero de dia de la semana (1-7): ");
        var dia = Integer.parseInt(consola.nextLine());

        var nombreDia = "lerolero";
        switch (dia){
            case 1:
                nombreDia = "Domingo";
                break;
            case 2:
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miércoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sábado";
                break;
            default:
                nombreDia = "NO ES VALIDO";
                //break
        }
        System.out.printf("\nEl Número de dia %d Corresponde a %s",dia,nombreDia+"\n");
    }
}
