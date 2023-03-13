package co.edu.unbosque.sockets.taller;

import java.io.IOException;
import java.util.Scanner;

public class EjecutaClienteSencillo {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("CLIENTE> A qué servidor desea conectarse?");
        System.out.println("1. Servidor 1 (puerto 1118)");
        System.out.println("2. Servidor 2 (puerto 2913)");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                new ClienteSencillo().ejecuta("localhost:1118");
                break;
            case 2:
                new ClienteSencillo().ejecuta("localhost:2913");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

}
