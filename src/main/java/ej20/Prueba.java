package ej20;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Prueba {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Avion av = new Avion();

        int opcion = 0;
        int fila, asiento;
        boolean salir = true;

        do {

            do {
                System.out.println("¿Qué desea hacer? \n"
                        + "1. Reservar \n"
                        + "2. Cancelar \n"
                        + "3. Mostrar \n"
                        + "4. Salir");
                opcion = teclado.nextInt();
            } while (opcion < 1 || opcion > 4);

            switch (opcion) {
                case 1:
                    System.out.println("Indiac la fila");
                    fila = teclado.nextInt();

                    System.out.println("Indica el asiento");
                    asiento = teclado.nextInt();

                    av.reservarAsiento(fila, asiento);
                    break;

                case 2:
                    System.out.println("Indiac la fila");
                    fila = teclado.nextInt();

                    System.out.println("Indica el asiento");
                    asiento = teclado.nextInt();

                    av.cancelarAsiento(fila, asiento);
                    break;

                case 3:
                    av.mostrarMatriz();
                    break;

                case 4:
                    salir = false;
            }

        } while (salir);
    }
}
