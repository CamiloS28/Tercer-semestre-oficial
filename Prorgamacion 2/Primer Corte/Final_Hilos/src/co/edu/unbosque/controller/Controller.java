package co.edu.unbosque.controller;

import java.util.InputMismatchException;

import co.edu.unbosque.model.Cajero;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.UsuariosDAO;
import co.edu.unbosque.view.View;

public class Controller implements Runnable {
	private View view;
	private UsuariosDAO usuariosDao;
	private Cajero cajero;

	public Controller(Persona persona) {
		view  = new View();
		cajero = new Cajero();
		view.imprimirNormal("Asignar número de cajeros: ");
		usuariosDao = new UsuariosDAO(0);
		boolean entradaValida = false;
		int intentos = 0;
		int intentosUsuario = 1; // Límite de intentos
		while (!entradaValida && intentos < intentosUsuario) {   //aca solo digo que la entrada sea falsa y los intentos sean menores a los del usuario
			try {
				usuariosDao = new UsuariosDAO(view.leerInt()); //lea
				entradaValida = true; //salga del ciclo
			} catch (InputMismatchException e) {
				view.imprimirNormal("Señor usuario no mate el programa, de por si ya murio");
				intentos++;
			}
		}
	}

	@Override
	public void run() { //metodo que es del thread 
		while(true) {  //CICLO infinito que synchonize
			synchronized(this) {  
				// Esperar hasta que haya nuevas personas en la lista
				while(usuariosDao.getListaPersona().isEmpty()) {
					try {
						wait(); //espere para que no se llene
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int numeroCajeros = usuariosDao.getNumCashiers();  //aca se asignan cajeros 
				for (int i = 0; i < numeroCajeros && !usuariosDao.getListaPersona().isEmpty(); i++) {
					Persona persona = usuariosDao.getListaPersona().remove(0); //este era para prmitir que empezara en 1
					if(persona == null) {
						break;
					}
					int monto = cajero.realizarTransaccion(persona); //genera la transaccion 
					view.imprimirNormal("Nombre: "+persona.getNombreId() + " " +",Edad: "+ persona.getEdad()+" ,Saldo: "+persona.getSaldo() + "\n");

				}
				// Notificar a otros hilos que deben revisar la lista de nuevo
				notify();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}