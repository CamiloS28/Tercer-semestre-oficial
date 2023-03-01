package Hosts_Y_Direcciones_IP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class QuienSoy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress dir = InetAddress.getLocalHost();
			int i = dir.toString().indexOf("/");
			String dirS = dir.toString().substring(i+1);
			System.out.println(dir + "\n" + dirS);
		}catch(UnknownHostException e) {
			System.out.println("host desconocidoSystem.in");
		}
	}

}
