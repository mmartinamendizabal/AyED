package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class PilaGenerica<T> {
	private ListaEnlazadaGenerica<T> dato;
	
	public PilaGenerica(){
		this.dato = new ListaEnlazadaGenerica<T>();
	}
	
	public T tope() {
		T elem = null;
		this.dato.comenzar();
		while(! this.dato.fin()) {
			elem = this.dato.proximo();
		}
		return elem;
	}
	
	public T desapilar() {
		T elem = this.tope();
		this.dato.eliminar(elem);
		return elem;
	}
	public void apilar(T elemento) {
		this.dato.agregarFinal(elemento);		
	}
	public boolean esVacia() {
		return this.dato.esVacia();
	}
}
