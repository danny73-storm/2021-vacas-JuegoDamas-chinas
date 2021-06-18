package src.tablero;

public class Casilla {
    public int posicion;
    public char simbolo;
    public int ancho;
    public int alto;

    public Casilla(char simbolo, int ancho,int alto) {
        this.posicion = 0;
        this.simbolo = simbolo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public void imprimirCasilla() {
        // imprimir 3 lineas
        for (int x = 0; x < ancho; x++) {

            // imprimir el ancho
            for (int y = 0; y < alto; y++) {
                System.out.print(this.simbolo);
            }
            System.out.print("\n");
        }
    }

    public void imprimirCasilla2(int numLinea) {
        if (numLinea < ancho) {
            for (int y = 0; y < alto; y++) {
                System.out.print(this.simbolo);
            }
        }
    }

}
