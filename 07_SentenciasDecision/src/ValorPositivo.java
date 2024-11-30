import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("*** Validar Valor Positivo");

        var consola = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        var numero = Integer.parseInt(consola.nextLine());

        if(numero > 0){
            System.out.print("Es positivo numero: "+numero);
        } else if (numero < 0) {
            System.out.print("Es negativo numero: "+numero);
        }else {
            System.out.print("Es numero: 0");
        }
    }
}
