package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import co.edu.unbosque.model.Cajero;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.UsuariosDAO;
import co.edu.unbosque.view.View;

public class Controller implements Runnable{

	private Persona persona;
	private View view;
	private UsuariosDAO usuariosDao;

	private Cajero cajero;
	public Controller() {
		persona = new Persona();
		view  = new View();
		
		usuariosDao = new UsuariosDAO(4);
		//		funcionar();
	}



	@Override
	public void run() {
		while(true) {
			//System.out.println("ingrese numeros");
			int numeroCajeros = usuariosDao.getNumCashiers();

			List<Persona> listaPersona = new ArrayList<>();
			for (int i = 0; i < numeroCajeros; i++) {
				Persona persona = usuariosDao.getNextCustomer();
				if(persona == null) {
					break;
				}
				listaPersona.add(persona);
			}
			//			view.imprimirNormal(" "+usuariosDao.getListaPersona().get(persona.getNombreId())+" "+usuariosDao.getListaPersona().get(persona.getEdad()));
			//			view.imprimirNormal(usuariosDao.showAll());
			for (Persona persona : listaPersona) {
				view.imprimirNormal("Nombre "+persona.getNombreId() + " " +"Edad: "+ persona.getEdad() + " Saldo: " + persona.getSaldo());
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (Persona persona : persona.getListaPersona()) {
	            if (persona.getEdad() >= 60) {
	                // procesar persona mayor de 60 años
	            } else {
	                // procesar persona menor de 60 años
	            }
	        }

		}


	}
















	//		//	while(persona.getListaPersona().size()>50){
	//		for (int j = 0; j < 50; j++) {
	//
	//			int nombre = j;
	//			System.out.println("el nombre es "+nombre);
	//			System.out.println("EDAD");
	//			int edad = persona.generarEdadAleatoria();
	//			System.out.println("Edad "+edad);
	//			int saldo=persona.generarSaldoAleatorio();
	//			System.out.println("saldo "+saldo);
	//
	//			persona.create(nombre, edad, saldo);
	//
	//		}

	//		while(cajero.estanllenos()!=true) {
	//			view.imprimirNormal("1 abona  2 retira 0 sale");
	//			int selec =view.leerInt();
	//
	//			switch (selec) {
	//			case 1: {
	//				int numero = 1;
	//				cajero.tipoTransaccion(numero);
	//			}
	//
	//			default:{
	//				throw new IllegalArgumentException("Unexpected value: " );
	//			}
	//		}
	//
	//	}




}
