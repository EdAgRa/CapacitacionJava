import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domíngo");
        //miLista.add("Domíngo"); la lista permite elementos duplicados

        for(String elemento : miLista) {
            System.out.println("Dia de la semana: " + elemento);
        }

        System.out.println("\nFunciones lambda(funciones anónimas de un código muy compacto");
        miLista.forEach( elemento -> {
            System.out.println("Elemento: " + elemento);
        });

        System.out.println("\nSimplificado lambda");
        miLista.forEach(System.out::println);

        System.out.println("\nOtra forma de lista");
        System.out.println("Lista de Nombres: ");
        List<String> nombres = Arrays.asList("Pedro","Pepito","Juanito");
        nombres.forEach(System.out::println);
    }
}