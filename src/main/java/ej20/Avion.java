package ej20;

/**
 *
 * @author Jorge
 */
public class Avion {

    private boolean[][] asientos;

    public Avion() {
        this.asientos = new boolean[25][4];
    }

    public void reservarAsiento(int fila, int asiento) {
        getAsientos()[fila][asiento] = true;
    }

    public void cancelarAsiento(int fila, int asiento) {
        getAsientos()[fila][asiento] = false;
    }

    public String libreONo(boolean asiento) {
        if (asiento) {
            return "ocupado";
        } else {
            return "libre";
        }
    }

    public void mostrarMatriz() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.println("asientos[" + i + "][" + j + "] " + "está "
                        + libreONo(asientos[i][j]));
            }
            System.out.println("");
        }
    }

    public boolean[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(boolean[][] asientos) {
        this.asientos = asientos;
    }

}
