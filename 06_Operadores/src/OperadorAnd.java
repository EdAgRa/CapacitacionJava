public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador and ***");
        boolean a = true, b = false;
        boolean c = false, d = true;
        boolean e = false, f = false;
        boolean g = true, h = true;
        //and (regresa true si ambos son verdaderos )
        var resultado = a && b;// solo a es verdadero
        System.out.println("resultado a true - b false = " + resultado);
        resultado = c && d;// solo d es verdadero
        System.out.println("resultado c false - d true = " + resultado);
        resultado = e && f;// los dos son falsos
        System.out.println("resultado e false - f false = " + resultado);
        resultado = g && h;// los dos son verdaderos
        System.out.println("resultado g true - h true = " + resultado);
    }
}
