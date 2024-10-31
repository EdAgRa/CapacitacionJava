public class DetalleProducto {
    public static void main(String[] args) {
        // Detalle del Producto
        System.out.println("*** Tienda en Linea (Detalle Producto)***");
        // Declara variables
        String nombreProducto = "Libros de Auto Ayuda";
        float precio = 10.50F;
        int cantidadDisponible = 10;
        boolean esDisponible = true;
        // Imprime variables
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("esDisponible = " + esDisponible);
        // Cambia valores variables
        nombreProducto = "Boligrafos";
        precio = 5.25F;
        cantidadDisponible = 100;
        esDisponible = false;
        // Imprime nueva mente las variables
        System.out.println();
        System.out.println("nombreProducto_2 = " + nombreProducto);
        System.out.println("precio_2 = " + precio);
        System.out.println("cantidadDisponible_2 = " + cantidadDisponible);
        System.out.println("esDisponible_2 = " + esDisponible);
    }
}
