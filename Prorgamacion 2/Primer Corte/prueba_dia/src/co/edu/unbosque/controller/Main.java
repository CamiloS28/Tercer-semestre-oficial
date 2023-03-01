
package co.edu.unbosque.controller;

public class Main {
	public static void main(String[] args) {
		//UsuariosDAO usuariosDAO = new UsuariosDAO(4);
		Controller c = new Controller();
		Thread controllerHilo = new Thread(c);
		controllerHilo.start();
	}
}
