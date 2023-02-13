package Project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int [] arreglo = new int [9];
//		
//		for(int i = 0; i < arreglo.length; i++) {
//			System.out.print("Ingrese dato: ");
//			arreglo [i] = sc.nextInt();
//		}
//		for (int i = 0; i < arreglo.length; i++) {
//		    System.out.print(arreglo[i] + " ");
//		}
		
		char [] letras = new char [9];
		
		for(int i = 0; i < letras.length; i++) {
			System.out.print("Ingrese dato: ");
			letras[i] = sc.next().charAt(0);
		}
		
		for (int i = 0; i < letras.length; i++) {
		    System.out.print (letras[i] + " ");
	}
	
	}
}
