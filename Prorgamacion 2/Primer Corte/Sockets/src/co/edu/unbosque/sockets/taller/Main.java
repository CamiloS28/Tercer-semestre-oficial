package co.edu.unbosque.sockets.taller;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            // Crear un ServerSocket para el primer servidor
            ServerSocket servidor1 = new ServerSocket(2222);
            Thread FirstHilo = new Thread(new FirstServerTCP(servidor1, "El primer servidor te saluda"));

            // Crear un ServerSocket para el segundo servidor
            ServerSocket servidor2 = new ServerSocket(3333);
            Thread SecondHilo = new Thread(new FirstServerTCP(servidor2, "El segundo servidor te dice hola"));

            FirstHilo.start();
            SecondHilo.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}