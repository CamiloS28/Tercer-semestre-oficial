package co.edu.unbosque.sockets.taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownHostException;

public final class ClienteSencillo {
	
	public void ejecuta(String ipPuerto) throws IOException {
	    String[] partes = ipPuerto.split(":");
	    String direccionIP = partes[0];
	    int puerto;
	    switch (partes[1]) {
	        case "1118":
	            puerto = 1118;
	            break;
	        case "2913":
	            puerto = 2913;
	            break;
	        default:
	            throw new IllegalArgumentException("Puerto inválido");
	    }
	    try (Socket cliente = new Socket(direccionIP, puerto);
	         BufferedReader br = new BufferedReader(new InputStreamReader(cliente.getInputStream()))) {
	        String saludo;
	        while ((saludo = br.readLine()) != null) {
	            System.out.println(saludo);
	        }
	    } catch (UnknownHostException e) {
	        e.printStackTrace();
	    }
	}
}
