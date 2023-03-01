package co.edu.unbosque.model;

import java.util.ArrayList;


public class UsuariosDAO {
	private int numCashiers;
	private Persona persona= new Persona();

	private ArrayList<Persona>listaPersona;


	public UsuariosDAO(int cajeros) {
		this.numCashiers = cajeros;

		//persona = new Persona();
		listaPersona = new ArrayList<>();

		for (int i = 0; i < 50; i++) {
		    int id = i + 1;
		    String name = "Cliente " + id;
		    int edad = persona.generarEdadAleatoria();
		    int saldo = persona.generarSaldoAleatorio();
		    Persona persona = new Persona(id, name, edad, saldo);
		    listaPersona.add(persona);
		}
	}
	public int getNumCashiers() {
		return numCashiers;
	}
	public Persona getNextCustomer() {
		if(listaPersona.isEmpty()) {
			return null;
		}


		return listaPersona.remove(0);
	}
	public ArrayList<Persona> getListaPersona() {
		return listaPersona;
	}
	public void setListaPersona(ArrayList<Persona> listaPersona) {
		this.listaPersona = listaPersona;
	}

	
	public String showAll() {
		String res = "";
		for (Persona s : listaPersona) {
			res += s.toString();
		}
		return res;
	}
	
}
