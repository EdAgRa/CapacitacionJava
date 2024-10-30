public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Matias";
        var edad = 35;
        var salario = 21000.50;

        //String.format
        var mensaje = String.format("Nombre: %s, Edad %d, Salario: $%.2f",nombre,edad,salario);
        System.out.println(mensaje);

        //Método printf
        System.out.printf("Nombre: %s, Edad %d, Salario: $%.2f%n",nombre,edad,salario);

        var numeroEmpleado = 166;
        //formateo con text blok
        mensaje = """
                %nDetalle Persona:\s
                ------------------
                \tNombre: %s
                \tNo. Empleado: %05d
                \tEdad: %d años
                \tSalario: $%.2f%n
                """.formatted(nombre,numeroEmpleado,edad,salario);
        System.out.println(mensaje);

        //formateo con tex block y printf dierectamente
        System.out.printf("""
                %nDetalle Persona:\s
                ------------------
                \tNombre: %s
                \tNo. Empleado: %05d
                \tEdad: %d años
                \tSalario: $%.2f%n
                """,nombre,numeroEmpleado,edad,salario);
        
    }
}
