package co.edu.unbosque.model;

public class Persona implements Runnable {
	private int nombreId,edad,saldo;
	private String nombre; 
	private String tipoTransaccion ="";
	private static int saldoMinimo=100000;
	private static int saldoMaximo=500000;
	static int edadMinima=18;
	static int edadMaxima=80;

	public Persona(int nombreId, String nombre, int saldo, int edad, String tipoTransaccion) {
		this.nombreId = nombreId;
		this.nombre = nombre;
		this.saldo = saldo;
		this.edad = edad;
		this.tipoTransaccion = tipoTransaccion;
	}
	public Persona() {

	}

	public int establecerPrioridad() {
		if (edad > 55) {
			return Thread.MAX_PRIORITY;  // Prioridad máxima para personas mayores de 67 años
		} else {
			return Thread.MIN_PRIORITY;  // Prioridad normal para todas las demás personas
		}
	}

	@Override
	public void run() {
		Thread.currentThread().setPriority(establecerPrioridad()); // Establecer la prioridad del hilo
	}

	//aca genero saldo aleatorio 
	public int generarSaldoAleatorio() {
		return (int) (Math.random() * (saldoMaximo - saldoMinimo + 1)+saldoMinimo);
	}

	//genero edad random 
	public int generarEdadAleatoria() {
		return (int) (Math.random() * (edadMaxima - edadMinima + 1)+edadMinima);
	}

	public int retirar(int monto) {
		return saldo = saldo - monto;
	}

	public int abonar(int monto) {
		return saldo = saldo + monto;
	}


	public int getNombreId() {
		return nombreId;
	}

	public void setNombreId(int nombreId) {
		this.nombreId = nombreId;
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