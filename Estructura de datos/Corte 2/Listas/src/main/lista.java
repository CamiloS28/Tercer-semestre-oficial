package main;

import org.w3c.dom.Node;

public class lista{
	public nodo inicio;

	public lista(){

	}

	public boolean vacia() {
		if(inicio == null)
			return true;
		else
			return false;
	}
	public void insertarElemento(nodo entrada) {
		if(vacia()) {
			inicio = entrada;
		}else {
			nodo aux = inicio;
			while(aux.sig != null) {
				aux = aux.sig;
			}
			aux.sig = entrada;
			
		}
	}
	public void imprimir() {
		if(vacia()) {
			System.out.println("La lista esta vacia");
		}else {
			nodo A = inicio;
			System.out.println("Elementos de la lista");
			while(A!=null) {
				System.out.println(A.info);
				A=A.sig;
			}
		}
	}
}