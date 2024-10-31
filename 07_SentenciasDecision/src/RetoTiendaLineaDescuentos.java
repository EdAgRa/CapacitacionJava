import java.util.Scanner;

public class RetoTiendaLineaDescuentos {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Linea con Descuentos");
        final var VALOR_MINIMO = 1000.00;
        
        double descuento;
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el monto de la Compra: ");
        var valorCompra = Double.parseDouble(consola.nextLine());
        System.out.print("Es miembro de la tienda (true/false): ");
        var esMiembro = Boolean.parseBoolean(consola.next());

        if(valorCompra >= VALOR_MINIMO && esMiembro){
            descuento = 10;
        } else if (esMiembro) {
            descuento = 5;
        }else {
            descuento = 0;
        }

        if(descuento != 0){
            var valorDescuento = (valorCompra * descuento) / 100;
            var valorCompraDescuento = valorCompra - valorDescuento;
            System.out.printf("""
                    %nFelicidades, has obtenido un descuento del %.0f%%
                    \tMonto de la compra: $%.2f
                    \tMonto del descuento: $%.2f 
                    \tMonto final de la compara con descuento: $%.2f%n                      
                    """,descuento,valorCompra,valorDescuento,valorCompraDescuento);
        }else {
            System.out.printf("""
                    %nNo obtuvo ningún tipo de descuento.
                    \tMonto final de la compara: $.2f%n
                    Le invitamos a hacerse miembro de la tienda!
                    """,valorCompra);
        }
    }
}
