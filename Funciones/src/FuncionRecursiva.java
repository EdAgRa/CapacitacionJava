public class FuncionRecursiva {
    //Imprimir los valores de 1 al 5
    //Funcion recursiva
    static void funcionRecursiva(int numero){
        //caso base
        if(numero == 1)
            System.out.print(numero+" ");
        else {
            // caso recursivo
            //System.out.print(numero+" "); para imprimir en orden descendente
            funcionRecursiva(numero - 1);
            System.out.print(numero+" ");

        }
    }

    public static void main(String[] args) {
        funcionRecursiva(10);
    }
}
