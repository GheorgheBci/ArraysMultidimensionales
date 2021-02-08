package actividades;

/**
 *
 * @author Jorge
 */
public class Ej12 {

    public static void main(String[] args) {

        char[][] caracteres = {{'a', 'b', 'k'}, {'x', 'p', 'q'}};

        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres[i].length; j++) {
                System.out.println("caracteres[" + i + "][" + j + "] " + "es "
                        + caracteres[i][j]);
            }
        }
    }
}
