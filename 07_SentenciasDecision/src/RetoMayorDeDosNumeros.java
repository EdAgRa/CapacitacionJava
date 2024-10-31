import java.util.Scanner;

public class RetoMayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** El Mayor de dos Números ***");
        var consola = new Scanner(System.in);

        System.out.print("Digite el primer número: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.print("Digite el segundo número: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        if (numero1 > numero2){
            System.out.printf("%nEl número "+numero1+" es mayor que "+numero2+"%n");
        } else if (numero1 < numero2) {
            System.out.printf("%nEl número "+numero2+" es mayor que "+numero1+"%n");
        }else{
            System.out.println("\nLos números son Iguales\n");
        }
    }
}
