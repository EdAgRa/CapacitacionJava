import java.util.Scanner;

public class RetoReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hotel ***");
        final var SIN_VISTA_DIA = 150.50;
        final var CON_VISTA_DIA = 190.50;

        var consola = new Scanner(System.in);
        System.out.print("Digite el Nombre del Cliente: ");
        var nombreCliente = consola.nextLine();
        System.out.print("Digite los días de estadía: ");
        var numeroDias = Integer.parseInt(consola.nextLine());
        System.out.print("Cuarto con vista al mar (true/false)? ");
        var conVistaMar = Boolean.parseBoolean(consola.nextLine());

        var valorReserva = 0.0;
        if(conVistaMar){
            valorReserva = CON_VISTA_DIA * numeroDias;
        }
        else{
            valorReserva = SIN_VISTA_DIA * numeroDias;
        }

        System.out.printf("""
                %n------- Detalle de la Reserva -------
                \tCliente: %s
                \tDías de estadía: %d 
                \tCosto total Reserva: $%.2f
                \tHabitación con vista al mar: %s 
                """,nombreCliente,numeroDias,valorReserva,conVistaMar?"Si :)":"No :(");


    }

}
