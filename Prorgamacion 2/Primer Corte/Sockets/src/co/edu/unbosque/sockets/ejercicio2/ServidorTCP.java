package co.edu.unbosque.sockets.ejercicio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServidorTCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("SERVIDOR>Host: " + InetAddress.getLocalHost().toString());
		}catch(UnknownHostException e) {
			System.err.println("No se detectó la dirección IP " + e);
		}
		ServerSocket serverSocket =  null;
		try {
			serverSocket = new ServerSocket(1235);
		}catch(IOException e) {
			System.err.println("Error al abrir el socket " + e);
		}
		int entrada;
		long salida;
		while(true) {
			try {
				Socket socket = serverSocket.accept();
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				int puerto = socket.getPort();
				int puertoLocal = socket.getLocalPort();
				InetAddress direccionIP = socket.getInetAddress();
				entrada = dis.readInt();
				salida = (long) entrada * (long) entrada;
				
				
				dos.writeLong(salida);
				dis.close();
				dos.close();
				socket.close();
				
				System.out.println("Puerto Local:" + puertoLocal +" "+"Cliente:" +direccionIP + " -Puerto" + puerto +" Entrada: " + entrada + " Salida:" + salida);
			}catch(Exception e) {
				System.err.println("Se produjo una excepción "+ e);
			}
		}
	}

}
