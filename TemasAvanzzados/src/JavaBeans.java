import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        var persona = new Persona();
        persona.setNombre("Eduard");
        persona.setApellido("Aguacía");
        System.out.println(persona);
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());
    }
}

class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public Persona(){}

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}