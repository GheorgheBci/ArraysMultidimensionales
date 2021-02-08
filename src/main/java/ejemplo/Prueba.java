package ejemplo;

/**
 *
 * @author george
 */
public class Prueba {

    public static void main(String[] args) {

//        int[][] notas = new int[2][3];
        int[][] notas = {{5, 7, 9}, {4, 6, 5}};

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("notas[" + i + "][" + j + "] " + "es "
                        + notas[i][j]);
            }
        }
    }
}
