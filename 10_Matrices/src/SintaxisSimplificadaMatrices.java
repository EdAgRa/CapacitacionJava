public class SintaxisSimplificadaMatrices {
    public static void main(String[] args) {
        System.out.println("*** Sintaxis Simplificada Matrices ***");
        //Definimos una matriz
        var matriz = new int[][]{
                {100,200,300},
                {400,500,600}
        };
        //Recorer una matriz(Ciclos Anidados)
        //1. ciclo para recorrer renglones
        for (var ren = 0;ren < matriz.length;ren++){
            //2.ciclo para recorre las columnad
            for (var col = 0;col < matriz[ren].length;col++){
                System.out.println("Valor["+ren+"]["+col+"] = "+ matriz[ren][col]);
            }
        }
    }
}
