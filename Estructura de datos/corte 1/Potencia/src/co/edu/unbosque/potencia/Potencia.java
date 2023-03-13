package co.edu.unbosque.potencia;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Ingrese el numero base: ");
		int base = sc.nextInt();
		
		System.out.println("Ingrese el numero exponente: ");
		int expo = sc.nextInt();
		
		System.out.println("Al elevar " + base + " a la " + expo + " es igual a: " + elevar(base,expo));
		
		
	}
	public static int elevar(int base, int expo) {
		if(expo== 0) {
			return 1;
		}else {
			return base*elevar(base, expo-1);
		}
	}

}
