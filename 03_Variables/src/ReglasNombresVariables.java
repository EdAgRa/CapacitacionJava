public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas Nombres Variables
        String nombreCompleto = "Eduard Aguacia Ramirez"; // correcto, Aplica buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Eduard Aguacia Ramirez 2"; // correcto, NO aplica buenas practicas
        System.out.println("nombreCompleto = " + NombreCompleto);
        //String nombre-Cliente = "Eduard Aguacia Ramirez 3"; // NO es correcto el -
        String nombre_Cliente = "Eduard Aguacia Ramirez 4"; // correcto, NO aplica buenas practicas el _
        String _apellido = "Aguacia"; // Correcto y aceptable
        String $apellido = "Aguacia 2"; // Correcto y aceptable
        int totPzs = 10; // correcto, NO aplica buenas practicas el abusa del abreviado
        int totalPiezas = 10; // correcto, aplica buenas practicas
        boolean casado = true; //Correcto pero puede mejorar
        boolean esCasado = true; //Correcto, aplica buenas practicas
        boolean isCasado = true; //Correcto, aplica buenas practicas
        boolean tieneSaldo = true; //Correcto, aplica buenas practicas
        boolean hasSaldo = true; //Correcto, aplica buenas practicas
    }
}
