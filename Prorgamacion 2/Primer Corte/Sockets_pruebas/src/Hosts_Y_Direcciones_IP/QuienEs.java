package Hosts_Y_Direcciones_IP;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class QuienEs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite host: ");
		String host = entrada.next();
		if(host != null) {
			try {
				InetAddress dir = InetAddress.getByName(host);
				System.out.println("IP: " + dir.getHostAddress());
				System.out.println("Nombre: " + dir.getHostName());
			}catch(UnknownHostException e) {
				System.out.println("host desconocido");
			}
		}
		
	}

}
