package Controller;

import model.Matriz;
import view.View;

public class Controller {
	  private Matriz model;
	  private View view;

	  public Controller(Matriz model, View view) {
	    this.model = model;
	    this.view = view;
	  }

	  public void sumDiagonal() {
	    int[][] matrix = view.readMatrix();
	    model.setMatrix(matrix);
	    view.printMatrix(matrix);
	    int result = model.sumDiagonal();
	    view.showResult(result);
	  }
	}
