package matrizcuadrada;

/**
 *
 * @author Jorge
 */
public class Matriz {

    public static void main(String[] args) {

        int[][] numeros = {{9, 5, 10}, {1, 12, 24}, {6, 5, 12}};

        int numeroElegido = 0;
        int numeroElegidoFinal = 0;
        int fila = 0, columna = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < numeros.length; i++) {
            numeroElegido = 0;

            for (int j = 0; j < numeros[i].length; j++) {

                if (numeros[i][j] > numeroElegido) {
                    numeroElegido = numeros[i][j];
                    columna = j;
                }
            }

            if (numeros[i][columna] <= numeros[0][columna] && numeros[i][columna] <= numeros[1][columna] && numeros[i][columna] <= numeros[2][columna]) {
                fila = i;
                numeroElegidoFinal = numeros[i][columna];
            }
        }

        System.out.println("El número es " + numeroElegidoFinal + " [" + fila + "]"
                + "[" + columna + "]");
    }
}
