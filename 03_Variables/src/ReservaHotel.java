public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Reto Reserva Hoteles ***");
        //Declaración de las variables
        var nombreCliente = "Eduard";
        var apellidoCliente ="Aguacía R";
        var nombreCompletoCliente = nombreCliente+" "+apellidoCliente;
        var diaEstancia = 1;
        var tarifaDiaria = 100.50;
        final var CON_VISTA_MAR = false;
        // imprime variables
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("apellidoCliente = " + apellidoCliente);
        System.out.println("nombreCompletoCliente = " + nombreCompletoCliente);
        System.out.println("diaEstancia = " + diaEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("CON_VISTA_MAR = " + CON_VISTA_MAR);
        //Modificacion de las variables
        nombreCliente = "Pepito";
        apellidoCliente ="Perez Porras";
        nombreCompletoCliente = nombreCliente+" "+apellidoCliente;
        diaEstancia = 3;
        tarifaDiaria = 200.50;
        // imprime variables
        System.out.println();
        System.out.println("Nuevo datos");
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("apellidoCliente = " + apellidoCliente);
        System.out.println("nombreCompletoCliente = " + nombreCompletoCliente);
        System.out.println("diaEstancia = " + diaEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("CON_VISTA_MAR = " + CON_VISTA_MAR);
    }
}
