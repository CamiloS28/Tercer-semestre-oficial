package co.edu.unbosque.sockets.ejercicio1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EjecutaClienteSencillo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("CLIENTE> Digite dirip:Puerto -> ");
		String iPpuerto =  entrada.next();
		new ClienteSencillo().ejecuta(iPpuerto);
	}

}

