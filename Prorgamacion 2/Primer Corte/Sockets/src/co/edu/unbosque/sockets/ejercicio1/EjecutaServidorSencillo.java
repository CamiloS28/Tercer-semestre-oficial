package co.edu.unbosque.sockets.ejercicio1;

import java.util.Scanner;

public class EjecutaServidorSencillo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("SERVIDOR> Digite Puerto: ");
		int puerto = entrada.nextInt();
		new ServidorSencillo().ejecuta(puerto);
	}

}
