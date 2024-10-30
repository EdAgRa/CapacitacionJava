import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Victoria");

        System.out.println("Elementos del tipo Set");
        conjunto.forEach(System.out::println);

        conjunto.remove("Karla");// remover un elemento de la lista set
        System.out.println("\n Nuevos Elementos del tipo Set");
        conjunto.forEach(System.out::println);

    }
}
