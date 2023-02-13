package model;

public class Matriz {
	  private int[][] matrix;

	  public Matriz(int[][] matrix) {
	    this.matrix = matrix;
	  }

	  public int sumDiagonal() {
	    int sum = 0;
	    for (int i = 0; i < 4; i++) {
	      sum += matrix[i][i];
	    }
	    return sum;
	  }

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	  
	}

