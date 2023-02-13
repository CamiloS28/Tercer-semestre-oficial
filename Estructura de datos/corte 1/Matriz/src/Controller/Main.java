package Controller;

import model.Matriz;
import view.View;

public class Main {
	  public static void main(String[] args) {
	    Matriz model = new Matriz(null);
	    View view = new View();
	    Controller controller = new Controller(model, view);
	    controller.sumDiagonal();
	  }
	}

