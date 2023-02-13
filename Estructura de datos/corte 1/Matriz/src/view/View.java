package view;

import java.util.Scanner;

public class View {
  public int[][] readMatrix() {
    Scanner sc = new Scanner(System.in);
    int[][] matrix = new int[4][4];

    System.out.println("Ingrese los datos de la matriz 4x4: ");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    return matrix;
  }

  public void printMatrix(int[][] matrix) {
    System.out.println("La matriz ingresada es: ");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public void showResult(int result) {
    System.out.println("La suma de los datos de la diagonal principal es: " + result);
  }
}

