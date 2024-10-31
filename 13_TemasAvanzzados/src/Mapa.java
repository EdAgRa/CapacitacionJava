import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String,String> persona = new HashMap<>();// Contiene una llave y un dato
        persona.put("nombre","Diego");
        persona.put("apellido","Flores");
        persona.put("edad","31");
        persona.put("edad","31");// no permite duplicados

        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);
        persona.put("edad","35");// no lo duplica lo reemplaza siempre y cuado exista
        System.out.println("\nNuevos Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        persona.remove("apellido");
        System.out.println("\nValores del mapa después de remover: ");
        persona.entrySet().forEach(System.out::println);

        // Itera sobre los elementos del mapa por separado
        System.out.println("\nIterando los elementos (llave, valor)");
        persona.forEach((llave,valor)-> System.out.println("llave = " + llave + ", Valor = "+ valor));
    }
}
