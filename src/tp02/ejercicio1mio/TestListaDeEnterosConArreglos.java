package tp02.ejercicio1mio;
import tp02.ejercicio1.*;
public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		ListaDeEnterosConArreglos listaArreglos = new ListaDeEnterosConArreglos();
		ListaDeEnterosEnlazada listaEnlazada = new ListaDeEnterosEnlazada();
		
		for (String s:args) {
			listaArreglos.agregarFinal(Integer.parseInt(s));
		}
		listaArreglos.comenzar();
		while (!listaArreglos.fin()) {
			System.out.println(listaArreglos.proximo());
		}
		
		System.out.println("......................................... ");
		
		for (String s:args) {
			listaEnlazada.agregarFinal(Integer.parseInt(s));
		}
		listaEnlazada.comenzar();
		while (!listaEnlazada.fin()) {
			System.out.println(listaEnlazada.proximo());
		}
		System.out.println("........................................");
		listaArreglos.comenzar();
		listaArreglos.imprimirAlReves(listaArreglos, listaArreglos.proximo());
		System.out.println("........................................");
		listaEnlazada.comenzar();
		listaEnlazada.imprimirAlReves(listaEnlazada, listaEnlazada.proximo());
	}
	
	

}
