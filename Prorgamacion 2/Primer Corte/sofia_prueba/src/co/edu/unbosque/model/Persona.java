package co.edu.unbosque.model;

import java.util.ArrayList;

public class Persona {
	private int nombreId;
	private String nombre; 
	private int edad;
	private int saldo;
	private String tipoTransaccion;


	private static int saldoMinimo = 100000;
	private static int saldoMaximo = 500000;

	private static int edadMinima = 18;
	private static int edadMaxima = 80;


	ArrayList<Persona> listaPrioridad = new ArrayList<Persona>();
	private static ArrayList<Persona>listaPersona = new ArrayList<Persona>();
	
	
	
	

	public Persona() {
		
		
	}

	public Persona(int nombreid, String nombre, int edad, int saldo) {
	    this.nombreId = nombreid;
	    this.nombre = nombre;
	    this.edad = edad;
	    this.saldo = saldo;
	    saldoMinimo = 100000;
	    saldoMaximo = 500000;
	    edadMinima = 18;
	    edadMaxima = 80;
	}


	//aca genero saldo aleatorio 
	public int generarSaldoAleatorio() {
	    return (int) (Math.random() * (saldoMaximo - saldoMinimo + 1) + saldoMinimo);
	}

	//genero edad random 
	public int generarEdadAleatoria() {
	    return (int) (Math.random() * (edadMaxima - edadMinima + 1) + edadMinima);
	}


	public boolean esAptoParaPrioridad(int edad) {
		edad = generarEdadAleatoria();
		if(edad>75||edad<=80) {
			return true;
		}
		else {
			return false;}
	}
	
	//	public void create(int name, int age,int saldo) {
	//		listaPersona.add(new Persona(name, age, saldo));
	//	}


	public int retirar(int monto) {
		return saldo = saldo - monto;
	}

	public int abonar(int monto) {
		return saldo + monto;
	}


	public int getNombreId() {
		return nombreId;
	}

	public void setNombreId(int nombreId) {
		this.nombreId = nombreId;
	}


		public static ArrayList<Persona> getListaPersona() {
			return listaPersona;
		}
	
		public void setListaPersona(ArrayList<Persona> listaPersona) {
			this.listaPersona = listaPersona;
		}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public static int getSaldoMinimo() {
		return saldoMinimo;
	}

	public static void setSaldoMinimo(int saldoMinimo) {
		Persona.saldoMinimo = saldoMinimo;
	}

	public static int getSaldoMaximo() {
		return saldoMaximo;
	}

	public static void setSaldoMaximo(int saldoMaximo) {
		Persona.saldoMaximo = saldoMaximo;
	}

	public static int getEdadMinima() {
		return edadMinima;
	}

	public static void setEdadMinima(int edadMinima) {
		Persona.edadMinima = edadMinima;
	}

	public static int getEdadMaxima() {
		return edadMaxima;
	}

	public static void setEdadMaxima(int edadMaxima) {
		Persona.edadMaxima = edadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoTransaccion() {
		return tipoTransaccion;
	}

	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}




}
