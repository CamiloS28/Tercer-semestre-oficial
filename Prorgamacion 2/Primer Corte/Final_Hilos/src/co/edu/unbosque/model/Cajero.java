package co.edu.unbosque.model;

public class Cajero {
	
	public synchronized int realizarTransaccion(Persona persona) {
		if(persona.getTipoTransaccion().equals("Consignacion")) {
			return realizarAbono(persona);
		}
		else {
			return realizarRetiro(persona);
		}
	}
	public synchronized int realizarAbono(Persona persona) {
		
		int valor = persona.generarSaldoAleatorio();
		if(persona.getSaldo() >= 0) {
			String a = ("*** " + persona.getNombre() + " Tiene saldo actual de " + persona.getSaldo() + " - Va a abonar " + valor + " ***");
			System.out.println(a);
			persona.abonar(valor);
			System.out.println("*** " + persona.getNombre() + " ahora tiene saldo de:  " + persona.getSaldo());
			return persona.getSaldo();
		}
		else {
			System.out.println(("La cuenta esta en negativos"));
			return -1;
		}		
	}

	public synchronized int realizarRetiro(Persona persona) {

		int valor = persona.generarSaldoAleatorio();
		if(persona.getSaldo() >= valor) {
			System.out.println("--- " + persona.getNombre() + " Tiene saldo actual de: "+persona.getSaldo()+" - Va a retirar: "+ valor + " ---");
			persona.retirar(valor);
			System.out.println("--- "+persona.getNombre()+" hizo retiro exitoso de: "+valor+" su saldo es: "+persona.getSaldo()+ " ---");
			return persona.getSaldo();
		}else {
			System.out.println("--- " + persona.getNombre() + " Tiene saldo actual de: "+persona.getSaldo()+" - Va a retirar:  "+valor + " ---");
			System.out.println("--- No hay saldo para: "+persona.getNombreId()+" para retirar: "+persona.getSaldo() + " ---");
			return -1;
		}
	}
}