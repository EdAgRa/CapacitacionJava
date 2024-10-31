package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 2);
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {// solo en caso de error
            System.out.println("Error = " + e);
        }
        finally{// se ejecuta siempre independientemente si hubo error o no
            System.out.println("Se revisó la division entre cero");
        }
    }
}