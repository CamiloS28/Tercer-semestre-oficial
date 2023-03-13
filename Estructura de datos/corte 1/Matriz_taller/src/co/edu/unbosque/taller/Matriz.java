package co.edu.unbosque.taller;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[][] matriz = new int[4][4];
		System.out.println("Ingrese los valores de la matriz:");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				matriz[i][j] = input.nextInt();
			}
		}
		input.close();


		System.out.println("Matriz original:");
		for(int[] matrizfila:matriz) {
			System.out.println(Arrays.toString(matrizfila));
		}
		int[] aux = new int[matriz.length];
		for(int i = 0; i < matriz.length; i ++) {
			int miraMenor = matriz[i][0];
			for(int j = 1; j< matriz[i].length; j++) {
				if(matriz[i][j] < miraMenor) {
					miraMenor = matriz[i][j];
				}
			}
			aux[i] = miraMenor;
		}
		System.out.println("Sin ordenar: ");
		for(int[] matrizFila:matriz) {
			System.out.println(Arrays.toString(matrizFila));
		}
		System.out.println("Valores minimos ordenados: ");
		for(int minimos:aux) {
			System.out.print("***" + minimos + "***");
		}
	}
}
