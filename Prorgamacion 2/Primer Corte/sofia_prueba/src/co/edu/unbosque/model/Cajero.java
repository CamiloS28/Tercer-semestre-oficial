package co.edu.unbosque.model;

import java.util.ArrayList;

public class Cajero implements Runnable{
	
		private boolean disponible;
		private Cajero cajero;
		private ArrayList<Cajero>listaCajero;
		private Persona persona;
		int id ;
	
		public Cajero() {
			listaCajero = new ArrayList<Cajero>();
			persona = new Persona();
		}
	
		public void run() { 
	
			while (estanllenos() != true) {
				persona = obtener(persona);
				disponible = false;
	
	
			}
			
		}
	
		//esta disponible
	
		public synchronized Persona obtener(Persona persona) {
		    while (estanllenos()) {
		        try {
		            wait();
		            System.out.println("ENTRE");
		        } catch (InterruptedException e) {
		            System.out.println("***ERROR ESPERA");
		        }
		    }
		    persona.getListaPersona().remove(persona);
		    return persona;
		}
	
	
		//no sobrepasa las personas
		public boolean estanllenos() {
			return listaCajero.size()>50;
		}
	
	
	
	
		public synchronized String realizarAbono() {//jose o camilo la idea es que una de las personas lo llame
			int valor = persona.generarSaldoAleatorio();
	
			if(persona.getSaldo() >= 0) {
	
				String a =  (persona.getNombre() + " Tiene saldo actual de "+persona.getSaldo()+" va a abonar "+valor);
				//debe imprimir eso
				try {
					Thread.sleep(1300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	
	
				persona.abonar(valor);
				return ("*** "+persona.getNombre()+" ahora tiene saldo de  "+persona.getSaldo());
	
			}
			else {
				return("La cuenta esta en negativos");
			}		
	
	
		}
	
		public synchronized String realizarRetiro() {
	
			int valor = persona.generarSaldoAleatorio();
			if(persona.getSaldo() >= valor) {
				System.out.println(persona.getNombre() + " Tiene saldo actual de "+persona.getSaldo()+" va a retirar "+valor);
	
	
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
				}
	
				persona.retirar(valor);
				return ("***"+persona.getNombre()+" hizo retiro exitoso de "+valor+" su saldo es "+persona.getSaldo());
			}
	
			else {
				return ("No hay saldo para "+Thread.currentThread().getName()+" PARA retirar "+persona.getSaldo() );
			}
		}
	
	

}





