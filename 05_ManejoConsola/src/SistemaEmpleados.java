import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Empleados ***");
        var consola = new Scanner(System.in);

        //Nombre del Empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        //Edad del Empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        //Salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        //Es Jefe de Departamento
        System.out.print("Es jefe de departamento: (true/false)");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        //Imprimir los valores del Empleado
        System.out.println("\nDatos del Empleado: ");
        System.out.println("\tNombre "+nombreEmpleado);
        System.out.println("\tEdad "+edadEmpleado+" años");
        //System.out.println("\tSalario " + salarioEmpleado);
        System.out.printf("\tSalarios: $%.2f%n", salarioEmpleado);
        System.out.println("\tEs Jefe de departamento? " + esJefeDepartamento);

    }
}
