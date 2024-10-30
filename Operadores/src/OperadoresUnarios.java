import javax.print.DocFlavor;

public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3,b = -2,resultado;
        var c = true;
        //Operdor unario +
        resultado = +a;
        System.out.println("resultado unario +a = " + resultado);
        //Operador unario -
        resultado = -a;
        System.out.println("resultado unario -a = " + resultado);
        //Operador unario incremento/decremento
        //Pre-incremento
        a = 3;
        resultado = ++a;//primero se incrementa el valor
        System.out.println("resultado unario ++a = " + resultado);
        System.out.println("a ya se incremento = " + a);
        //Post-incremento
        a = 3;
        resultado = a++; //primero se usa el valor y despues se incrementa
        System.out.println("resultado unario a++ = " + resultado);
        System.out.println("a en este momento se  incremento = " + a);
        //Pre-decremento
        b = -2;
        resultado = --b;//primero se incrementa el valor
        System.out.println("resultado unario --b = " + resultado);
        System.out.println("b ya decremento = " + b);
        //Post-incremento
        b = -2;
        resultado = b--; //primero se usa el valor y despues se incrementa
        System.out.println("resultado unario b-- = " + resultado);
        System.out.println("b en este momento se decrementa = " + b);

    }
}
