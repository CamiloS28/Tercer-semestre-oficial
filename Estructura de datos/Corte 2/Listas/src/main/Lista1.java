package main;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		lista l = new lista();
		int opcion;
		
		do {
			System.out.println("1. Crear lista");
			System.out.println("2. Imprimir lista");
			System.out.println("0. SAlir");
			System.out.println("Diigite el dato: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1: 
				System.out.println("Digite numero de nodos: ");
				n = sc.nextInt();
				for(int i = 1; i<n; i++) {
					System.out.println("Diite el numero de enteros: ");
					l.insertarElemento(new nodo(sc.nextInt()));
				}
			case 2:
				l.imprimir();
				break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Digite bien el dato");
			}
		}while(opcion != 0);
	}

}
