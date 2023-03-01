package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Cajero;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.UsuariosDAO;
import co.edu.unbosque.view.View;

public class Controller implements Runnable{

	
	private View view;
	private UsuariosDAO usuariosDao;
	private Cajero cajero;
	public Controller() {
		view  = new View();
		cajero = new Cajero();
		view.imprimirNormal("Asignar Cajero");
		usuariosDao = new UsuariosDAO(view.leerInt());
	}
	
	@Override
	public void run() {
		while(true) {
			int numeroCajeros = usuariosDao.getNumCashiers();
			List<Persona> listaPersona = new ArrayList<>();

			for (int i = 0; i < numeroCajeros; i++) {
				Persona persona = usuariosDao.getNextCustomer();
				if(persona == null) {
					break;
				}
				listaPersona.add(persona);
			}
			for (Persona persona : listaPersona) {
				int monto = cajero.realizarTransaccion(persona);
				view.imprimirNormal("Nombre "+persona.getNombreId() + " " +"Edad "+ persona.getEdad()+" Saldo "+persona.getSaldo());
			
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void AsignarPrioridad() {
		List<Persona> listaPersona = new ArrayList<>();
		for(Persona persona : listaPersona) {
			
			if(persona.getEdad() > 50) {
				listaPersona.remove(0);
				
				
			}
			
		}
	}
}
