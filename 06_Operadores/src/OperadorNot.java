public class OperadorNot {
    public static void main(String[] args) {
        System.out.println("*** Operador not ***");
        boolean a = true, b = false;
        //Operador not! (invierte el valor lógico)
        var resultado = !a;
        System.out.println("resultado a - true = " + resultado);
        resultado = !b;
        System.out.println("resultado b - flase = " + resultado);
    }
}
