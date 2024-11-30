import java.util.Scanner;

public class RetoCajeroAutomatico {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;
        var saldoCuenta = 1000.00;

        while (!salir){
            System.out.print("""
                    \n*** Aplicación de Cajero Automático ***
                    Operaciones Permitidas
                    \t1. Consultar Saldo
                    \t2. Retirar
                    \t3. Depositar
                    \t4. Salir
                    Escoja un opción:\s""");
            var opcion = consola.nextInt();
            switch (opcion){
                case 1 -> System.out.printf("El saldo actual es: $%.2f \n",saldoCuenta);
                case 2 -> {
                    System.out.print("Ingrese el monto a retirar: ");
                    var montoOperacion = consola.nextDouble();
                    if (saldoCuenta >= montoOperacion) {
                        saldoCuenta -= montoOperacion;
                        System.out.printf("El Nuevo saldo es: $%.2f \n",saldoCuenta);
                    }else System.out.printf("No cuenta con el saldo suficiente. Saldo actual $%.2f \n",saldoCuenta);
                }
                case 3 -> {
                    System.out.print("Ingrese el monto a deposita: ");
                    var montoOperacion = consola.nextDouble();
                    saldoCuenta += montoOperacion;
                    System.out.printf("El Nuevo saldo es: $%.2f \n",saldoCuenta);
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema, Vuelva Pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción no valida, seleccione una opción del 1 al 4");
            }
        }
    }
}
