package Matriz;

import java.util.Scanner;

import java.util.Scanner;

public class Main_Matriz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[4][4];
    int suma = 0;

    System.out.println("Ingrese los datos de la matriz 4x4: ");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.println("La matriz ingresada es: ");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }

    for (int i = 0; i < 4; i++) {
      suma += matriz[i][i];
    }

    System.out.println("La suma de los datos de la diagonal principal es: " + suma);
  }
}

