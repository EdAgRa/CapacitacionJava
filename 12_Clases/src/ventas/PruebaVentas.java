package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");
        var producto1 = new Producto("Blusa",30.00);
        var producto2 = new Producto("Zapatos",50.00);

        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        //orden1.mostrarOrden();
        System.out.println(orden1);

        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Guantes",75.50));
        orden2.agregarProducto(producto2);
//        orden2.agregarProducto(producto3);
        //orden2.mostrarOrden();
        System.out.println(orden2);

        var orden3 = new Orden();
        orden3.agregarProducto(producto2);
        orden3.agregarProducto(producto1);
        //orden3.agregarProducto(producto3);
        //orden3.mostrarOrden();
        System.out.println(orden3);

    }
}
