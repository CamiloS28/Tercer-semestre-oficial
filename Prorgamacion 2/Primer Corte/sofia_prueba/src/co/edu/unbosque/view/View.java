package co.edu.unbosque.view;

import java.util.Scanner;

public class View {
	private Scanner leer;

	public View() {
		leer  = new Scanner(System.in);
	}

	public int leerInt() {
		return leer.nextInt();
	}

	public void burnLine() {
		leer.nextLine();
	}

	public String leerCadena() {
		return leer.next();
	}


	public void imprimirNormal(String s) {
		System.out.println(s);
	}

	public void imprimirSinSalto(String s) {
		System.out.print(s);
	}
}
