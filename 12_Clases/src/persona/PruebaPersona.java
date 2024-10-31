package persona;

import persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objeto Persona ***");
        System.out.println("Variable estática: "+  Persona.getContadorPersonas());

        var objeto1 = new Persona("Eduard","Aguacía");
        System.out.println(objeto1);// automaticamente se llama toString()
        System.out.println("Variable estática: "+ Persona.getContadorPersonas()  );

        var objeto2 = new Persona("Pedro","Perez");
        System.out.println(objeto2);// automaticamente se llama toString()
        System.out.println("Variable estática: "+ Persona.getContadorPersonas()  );
    }
}
