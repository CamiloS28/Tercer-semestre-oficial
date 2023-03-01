package co.edu.unbosque.sockets.ejercicio2;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteTCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("CLIENTE> Digiete host: ");
		String host = entrada.next();
		System.out.println("Digite mensaje de número separados con coma: ");
		String msg = entrada.next();
		String[] mensaje = msg.split(",");
		InetAddress direccionIP = null;
		
		try {
			direccionIP = InetAddress.getByName(host);
		}catch(UnknownHostException e) {
			System.out.println("No se ha encontradp el Host");
		}
		int puerto = 1235;
		for(int n = 0; n < mensaje.length; n++) {
			Socket socket= null;
			DataInputStream dis = null;
			DataOutputStream dos = null;
			try {
				int numero = Integer.parseInt(mensaje[n]);
				socket = new Socket (direccionIP, puerto);
				dis = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream((socket.getOutputStream()));
				dos.writeInt(numero);
				long resultado = dis.readLong();
				System.out.println("Puerto local: " + socket.getLocalPort() + " Puerto: ");
				System.out.println("Solicitud= " + numero + "\t Resuleto =" + resultado);
				dis.close();
				dos.close();
			}catch(Exception e) {
				System.err.println("Se produjo la expceción " + e);
			}
			try {
				if(socket != null)
					socket.close();
			}catch(IOException e) {
				System.err.println("Error al cerrar el socket " + e);
			}
		}
	}

}
