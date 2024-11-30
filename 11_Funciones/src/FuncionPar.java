import java.util.Scanner;

public class FuncionPar {
    //Fx() Para saber si un número en par o no
    static boolean esPar(int numero){
        //Opcion Uno
//        if (numero % 2 == 0)
//            return true;
//        else
//            return false;
        //Opcion Dos
        return (numero % 2 == 0? true : false);
    }
    public static void main(String[] args) {
        System.out.print("Digite un Número: ");
        var numero  = Integer.parseInt(new Scanner(System.in).nextLine());
        // Intento mio
//        var resultado = esPar(numero);
//        System.out.println("El numero "+numero+ " es Par? "+resultado);
        // Tutor
        System.out.println("El número "+numero+ " es Par? "+esPar(numero));

    }
}
