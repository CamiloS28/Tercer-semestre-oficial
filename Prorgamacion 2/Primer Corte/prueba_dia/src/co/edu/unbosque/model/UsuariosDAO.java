package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Random;


public class UsuariosDAO {
	private int numCashiers;
	private Persona persona= new Persona();
	private Random random = new Random();

	private ArrayList<Persona>listaPersona;
	
	public UsuariosDAO(int cajeros) {
		this.numCashiers = cajeros;
		listaPersona = new ArrayList<>();

		for (int i = 0; i < 50; i++) {
			int id = i + 1;
			String name = "Cliente " + id;
			int edad = persona.generarEdadAleatoria();
			int saldo = persona.generarSaldoAleatorio();
			String tipoTransaccion = random.nextBoolean() ? "Consignacion": "Retiro"; //tiene la misma probabilidad 
			//? sirve para expresar 1 condicional booleana ? verdadero : falso	
			Persona persona = new Persona(id,name, saldo, edad,tipoTransaccion);
			persona.setSaldo(saldo);
			listaPersona.add(persona); //aqui se agregan so no need de crear un metodo crear

		}
		
	}
	public UsuariosDAO() {

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
