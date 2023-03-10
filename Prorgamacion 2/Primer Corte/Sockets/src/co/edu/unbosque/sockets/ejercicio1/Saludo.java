package co.edu.unbosque.sockets.ejercicio1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Saludo implements Runnable{
	private Socket cliente;
	
	public Saludo(Socket cliente){
		this.cliente = cliente;
	}
	public void run() {
		System.out.println("Cliente conectando... ");
		try {
			PrintWriter pw = new PrintWriter(cliente.getOutputStream(), true);
			pw.println("Hola desde el servirodr");
			pw.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
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
