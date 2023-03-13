package co.edu.unbosque.sockets.taller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FirstServerTCP implements Runnable {
    private String MTexto;
    private ServerSocket Servidor;
    private boolean mostrado = false;

    public FirstServerTCP(ServerSocket servidor, String texto) {
        MTexto = texto;
        this.Servidor = servidor;
    }

    public void run() {
        try {
            System.out.println("Servidor Activo");
            Socket cliente;
            try {
                while ((cliente = Servidor.accept()) != null) {
                    System.out.println("Conectado a: " + cliente.getInetAddress().getAddress() + ":" + cliente.getPort());
                    new Thread(new Saludo(cliente, MTexto)).start();
                }
            } finally {
                Servidor.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
