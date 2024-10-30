public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Asignación ***");

        //Asignacion simple
        var miNumero = 10;
        int miNumero2;
        miNumero2 = 15;

        //Asigacion compuesto +=
        miNumero += 5; // miNumero = miNumero + 5, incrementa el valor en 5
        System.out.println("miNumero = " + miNumero);

        //Asigacion compuesto -=
        miNumero = 10;
        miNumero -= 5; // miNumero = miNumero - 5, resta el valor en 5
        System.out.println("miNumero = " + miNumero);

        //Asigacion compuesto *=
        miNumero = 10;
        miNumero *= 2; // miNumero = miNumero - 5, multiplica  el valor en 2
        System.out.println("miNumero = " + miNumero);

        //Asigacion compuesto /=
        miNumero = 10;
        miNumero /= 2; // miNumero = miNumero - 5, divide el valor en 5
        System.out.println("miNumero = " + miNumero);

        //Asigacion compuesto %=
        miNumero = 10;
        miNumero %= 3; // miNumero = miNumero - 5, el cosiente de la division valor en 3
        System.out.println("miNumero = " + miNumero);

        //Asignacion de variables multiples
        int a = 10, b = 15, c = 20;// no se puede usar var
        System.out.printf("a = %d, b = %d, c = %d",a,b,c);

    }
}
