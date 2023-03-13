package co.edu.unbosque.prueba;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente {
	public void ejecuta(String ipPuert) {
		String [] ipp = new String[2];
		ipp= ipPuert.split(":");
		String ip=ipp[0];
		int puerto = Integer.parseInt(ipp[1]);

		Socket cliente;
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
	
		}
		finally {
			cliente.close();
		}
		}
}
