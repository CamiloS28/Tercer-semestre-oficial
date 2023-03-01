package co.edu.unbosque.sockets.ejercicio1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public final class ServidorSencillo {
	
	public void ejecuta (int puerto) {
		try {
			System.out.println("Servidor esuchando por el puerto: " + puerto);
			
			ServerSocket servidor = new ServerSocket();
			Socket cliente;
			try {
				while((cliente = servidor.accept()) !=null) {
					new Thread(new Saludo (cliente)).start();
				}
			}finally {
				servidor.close();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
