package animales;

public class Animal {
    protected void comer(){
        System.out.println("Como muchas veces al día");
    }

    protected void dormir(){
        System.out.println("Duermo Muchas horas");
    }

    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }
    @Override
    protected void dormir(){
        System.out.println("Duermo 15 horas");
        System.out.print("Método clase padre: ");
        super.dormir();
    }

}

class Gato extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("Puedo maullar");
    }
}

class PruebaAnimal{
    //Metodo poliformico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }


    public static void main(String[] args) {
        //Objeto de la clase Padre(Animal)
        //var animal = new Animal();
        //var animal = new Perro();
        var animal= new Gato();
        imprimirSonido(animal);

/*      System.out.println("*** Ejemplo de Herencia ***");
        System.out.println("--Clase Padre, soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        //animal1.hacerSonido();// este metodo no existe en la clase padre

        System.out.println("\n--Clase Hija, soy un perro ");
        var perro1 = new Perro();
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();

        System.out.println("\n--Clase Hija, soy un Gato ");
        var gato1 = new Gato();
        gato1.hacerSonido();
*/
    }
}