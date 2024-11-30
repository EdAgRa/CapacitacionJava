public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("*** Operador or ***");
        boolean a = true, b = false;
        boolean c = false, d = true;
        boolean e = false, f = false;
        boolean g = true, h = true;
        //or (regresa true si alguno es verdadero verdaderos )
        var resultado = a || b;// solo a es verdadero
        System.out.println("resultado a true - b flase = " + resultado);
        resultado = c || d;// solo d es verdadero
        System.out.println("resultado c flase - d true = " + resultado);
        resultado = e || f;// los dos son falsos
        System.out.println("resultado e flase - f flase = " + resultado);
        resultado = g || h;// los dos son verdaderos
        System.out.println("resultado g true - h true = " + resultado);
    }
}
