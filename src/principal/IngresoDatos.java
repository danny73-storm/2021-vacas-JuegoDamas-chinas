package src.principal;

import java.util.Scanner;

public class IngresoDatos {
    static Scanner leer = new Scanner(System.in);

    private static void imprimirMensaje(String mensaje) {
        System.out.print("\n" + mensaje + " ");
    }

    public static int getEntero(String mensaje, boolean negativo) {
        imprimirMensaje(mensaje);
        int tmp = leer.nextInt();
        leer.nextLine();

        if (negativo) {
            return tmp;
        }

        if (tmp < 0) {
            do {
                imprimirMensaje("\n\n No puede ingresar números negativos\n");
                imprimirMensaje(mensaje);
                tmp = leer.nextInt();
            } while (tmp < 0);
        }

        return tmp;
    }

    public static String getTexto(String mensaje) {
        imprimirMensaje(mensaje);
        String res = leer.nextLine();
        return res;
    }

}
