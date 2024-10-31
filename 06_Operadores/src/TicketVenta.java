import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Genera Ticket de Venta");
        var consola = new Scanner(System.in);

        System.out.print("Precio Leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());
        System.out.print("Precio Pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());
        System.out.print("Precio Harina: ");
        var precioHarina = Double.parseDouble(consola.nextLine());
        System.out.print("Precio Huevos: ");
        var precioHuevos = Double.parseDouble(consola.nextLine());
        System.out.print("Precio Berenjena: ");
        var precioBerenjena = Double.parseDouble(consola.nextLine());
        System.out.print("Precio Plátanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());
        System.out.print("Aplica algún descuento(%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());
        //Cálculo del subtotal(sin impuestos)
        var subTotal = precioBerenjena+precioHuevos+precioHarina+precioLeche+precioPan;
        //Aplica descuento
        var descuento = subTotal * (descuentoPorcentaje/100.0);
        var subTotalDescuento = subTotal - descuento;
        //Cálculo de Impuesto (19%)
        var impuesto = subTotalDescuento * 0.19;
        //Cálculo total de l compra(con impuestos)
        var costoTotalCompra = subTotalDescuento + impuesto;
        //Impresión ticked de venta
        System.out.printf("""
                %nTicket de Venta
                --------------------
                \tBerenjena ....... $%.2f
                \tHuevos .......... $%.2f
                \tHarina .......... $%.2f
                \tLeche ........... $%.2f
                \tPan ............. $%.2f
                --------------------
                \tSub-Total........ $%.2f
                \tDescuento(% 3d%%) .-$%.2f
                \tImpuesto( 19%%).... $%.2f
                --------------------
                \tTotal Compra .... $%.2f
                """,precioBerenjena,precioHuevos,
                    precioHarina,precioLeche,
                    precioPan,subTotal,descuentoPorcentaje,descuento,
                    impuesto,costoTotalCompra);

    }
}
