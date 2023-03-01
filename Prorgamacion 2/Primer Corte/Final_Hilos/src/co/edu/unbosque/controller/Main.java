package co.edu.unbosque.controller;

import co.edu.unbosque.model.Persona;

public class Main {
	public static void main(String[] args) {
		
		Persona per = new Persona();
		Thread perHilo = new Thread(per);
		perHilo.start();
		
		Controller c = new Controller(per);
		Thread controllerHilo = new Thread(c);
		controllerHilo.start();
		
	}
}
