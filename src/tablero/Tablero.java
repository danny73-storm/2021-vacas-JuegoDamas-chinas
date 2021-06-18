package src.tablero;

import src.principal.*;

public class Tablero {
    int ancho;
    int alto;
    Casilla casilla[][];

    public Tablero(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        casilla = new Casilla[alto][ancho];
        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {
                casilla[y][x] = new Casilla(obtenerCaracter(x,y),2,4);
            }
        }
    }

    public void pintarTablero() {
        for (int y = 0; y < alto; y++) {
            for (int x = 0; x <ancho ; x++) {
                casilla[y][x].imprimirCasilla2(0);
            }
            System.out.println();
        }
    }

    public char obtenerCaracter(int columna, int fila) {
        if (fila % 2 != 0)
            columna = columna + 1;
         
        if (columna % 2 == 0)
            return '|';
        else
            return ' ';
        
    }
    
}
