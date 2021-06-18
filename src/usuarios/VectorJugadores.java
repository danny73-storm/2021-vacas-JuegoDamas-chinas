package src.usuarios;

import src.principal.*;

public class VectorJugadores {

    private Jugadores[] jugadores = new Jugadores[5];
    private int siguienteCodigo;

    public VectorJugadores(){
        siguienteCodigo = 1;
    }

    // ingresar jugadores
    public void agregarJugadores(String nombre, int years) {
        if (siguienteCodigo > 5) {
            System.out.println("Límite de jugadores ");
        } else {
            jugadores[(siguienteCodigo - 1)] = new Jugadores(siguienteCodigo, nombre, years);
        }
        siguienteCodigo++;
    }

    public void agregarJugadores() {
        for (int i = 0; i<5 ; i++) {
            String nombre = IngresoDatos.getTexto("Ingrese el nombre del jugador: ");
            int years = IngresoDatos.getEntero("Ingrese cuantos años tiene: ", false);
            agregarJugadores(nombre, years);
        }
    }

    // fin ingresar jugadores

    public void mostrarJugadores() {
        
        for (int i = 0; i < (siguienteCodigo - 1); i++) {
            System.out.println("-" + i + ") " + jugadores[i].getInformacion());
            // System.out.println("-"+i+") "+Jugadores[i].getId() + " nombre
            // "+Jugadores[i].getNombre()+ " year "+Jugadores[i].getYears());

        }

        System.out.println("\n\n");
    }
    
}
