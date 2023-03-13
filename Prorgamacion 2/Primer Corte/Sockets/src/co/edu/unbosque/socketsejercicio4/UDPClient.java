package co.edu.unbosque.socketsejercicio4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			
		
		String serverHostname = new String ("127.0.0.1");
		BufferedReader inFromUser = new BufferedReader (new InputStreamReader(System.in));
		DatagramSocket clienteSocket = new DatagramSocket();
		InetAddress IPAddress = InetAddress.getByName(serverHostname);
		System.out.println("Atendiendo la conexión para " + IPAddress + ") via UDP puerto 9876");
		
		byte[] sendData = new byte[10];
		byte[] receiveData = new byte[10];
		
		try {
			clienteSocket.receive(receivePacket);
			SString modifiedSentence = new String(receivePacket.get)
		}
		}
	}

}
