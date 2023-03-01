package main;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite su numero: ");
		int num = sc.nextInt();
		int Factorialnum = factorial(num);
		System.out.println("El factorial de " + num + " es " + Factorialnum);
	}

	private static int factorial(int num) {
		if(num == 0) {
			return  1;
		}else {
			return num * factorial(num-1);
		}

	}

}

