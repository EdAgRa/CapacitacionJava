import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Números Aleatorios ***");
        var random = new Random();

        //Generar un numero aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio entre 1 y 9 = " + numeroAleatorio);

        //Generar un numero aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio entre 1 y 10 = " + numeroAleatorio);

        //Generar un numero float entre 0.0 y 1.0
        var foltanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + foltanteAleatorio);

        //simular el lanzamiento de un dado
        var dado = random.nextInt(6)+1;
        System.out.println("Resultado de lanzar el dado = " + dado);

    }
}
