import java.util.Scanner;

public class SistemasDescuentoVip {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Descuentos VIP ***");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.print("Cuántos Productos compró hoy? ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tiene la membresía de la tienda (true/false)? ");
        var tieneMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento =
                cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tieneMembresia ;
        System.out.println("Tiene Acceso al Descuento VIP = " + esElegibleDescuento);

    }
}
