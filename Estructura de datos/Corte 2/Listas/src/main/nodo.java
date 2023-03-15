package main;

public class nodo {
	
	int info; //campo de datos
	nodo sig; //referencia al siguiente nodo
	
	public nodo (int elemento) {
		info = elemento; //asigna el elemento a almacenar
		sig = null;
	}
}
