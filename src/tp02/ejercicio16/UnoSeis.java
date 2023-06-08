package tp02.ejercicio16;
import tp02.ejercicio1.*;
public class UnoSeis {
	
	public static void main(String[] args) {
		ListaDeEnterosEnlazada L = new ListaDeEnterosEnlazada();
		int num=6;
		L.sucesion(num, L);
		L.comenzar();
		L.imprimir(L, L.proximo());
	}
}
