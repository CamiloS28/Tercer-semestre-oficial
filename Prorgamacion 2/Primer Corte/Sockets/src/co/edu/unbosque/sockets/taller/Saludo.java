package co.edu.unbosque.sockets.taller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Saludo implements Runnable{
	private Socket cliente;
	private String texto;
	public Saludo(Socket cliente, String texto){
		this.cliente = cliente;
		this.texto = texto;
	}
	public void run() {
		System.out.println("Cliente conectando... ");
		try {
			PrintWriter pw = new PrintWriter(cliente.getOutputStream(), true);
			pw.println(texto);
			pw.close();

		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}