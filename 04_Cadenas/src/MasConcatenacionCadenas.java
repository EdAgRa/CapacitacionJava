public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        System.out.println("*** Mas Concatenaciones en Java ***");
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1+" "+cadena2;
        System.out.println("cadena3 usando + = " + cadena3);

        //Metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);

        // StringBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado StringBuilder = " + resultado);

        //StringBuffrer - cuando se trabaja con varios Hilos
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado stringBuffer = " + resultado);

        //join - unir 2 o mas cadenas
        resultado = String.join(" ",cadena1,cadena2,"Adios");
        System.out.println("resultado join = " + resultado);
    }
}
