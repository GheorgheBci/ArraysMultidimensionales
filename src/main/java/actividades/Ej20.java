package actividades;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej20 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean[][] asientos = new boolean[25][4];

        int opcion = 0;
        int fila, asiento;
        boolean salir = true;

        do {
            System.out.println("¿Qué desea hacer? \n"
                    + "1. Reservar \n"
                    + "2. Cancelar \n"
                    + "3. Mostrar \n"
                    + "4. Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Fila");
                    fila = teclado.nextInt();

                    System.out.println("Asiento");
                    asiento = teclado.nextInt();

                    reservarAsiento(asientos, fila, asiento);
                    break;

                case 2:
                    System.out.println("Fila");
                    fila = teclado.nextInt();

                    System.out.println("Asiento");
                    asiento = teclado.nextInt();

                    cancelarAsiento(asientos, fila, asiento);
                    break;

                case 3:
                    mostrarMatriz(asientos);
                    break;

                case 4:
                    System.out.println("¿Quieres salir? \n"
                            + "1. Si \n"
                            + "2. No");
                    int eleccion = teclado.nextInt();

                    if (eleccion != 2) {
                        salir = false;
                    }
            }
        } while (salir);
    }

    public static void reservarAsiento(boolean matriz[][], int fila, int asiento) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (fila == i && asiento == j) {
                    matriz[i][j] = true;
                }
            }
        }
    }

    public static void cancelarAsiento(boolean matriz[][], int fila, int asiento) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (fila == i && asiento == j) {
                    matriz[i][j] = false;
                }
            }
        }
    }

    public static void mostrarMatriz(boolean asiento[][]) {
        for (int i = 0; i < asiento.length; i++) {
            for (int j = 0; j < asiento[i].length; j++) {
                System.out.println("asientos[" + i + "][" + j + "] " + "está "
                        + libreONo(asiento[i][j]));
            }
            System.out.println("");
        }
    }

    public static String libreONo(boolean asiento) {
        if (asiento) {
            return "ocupado";
        } else {
            return "libre";
        }
    }
}
