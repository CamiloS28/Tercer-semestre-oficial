package co.edu.unbosque.controller;

import java.util.Collections;
import java.util.Comparator;

import co.edu.unbosque.model.Cajero;
import co.edu.unbosque.model.Persona;
import co.edu.unbosque.model.UsuariosDAO;
import co.edu.unbosque.view.View;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Controller c = new Controller();
		View view = new View();
		Thread controllerHilo = new Thread(c);
		controllerHilo.start();
		Cajero cajero = new Cajero();
		Thread cajeroHilo = new Thread(cajero);
		Persona persona = new Persona();
		cajeroHilo.start();
		cajeroHilo.join();
		
		// Ordenar la lista de personas por edad
		Collections.sort(persona.getListaPersona(), Comparator.comparingInt(Persona::getEdad));
		 
		for (Persona persona1 : persona.getListaPersona()) {
			// Imprimir los datos de las personas ordenadas por edad
            view.imprimirNormal("Nombre " + persona1.getNombreId() + " " + "Edad: " + persona1.getEdad() + " Saldo: " + persona1.getSaldo());
        }
        
        // Procesar primero a las personas mayores de 60 años
        for (Persona persona1 : persona.getListaPersona()) {
            if (persona1.getEdad() >= 60) {
                // procesar persona mayor de 60 años
            } else {
                // procesar persona menor de 60 años
            }
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
