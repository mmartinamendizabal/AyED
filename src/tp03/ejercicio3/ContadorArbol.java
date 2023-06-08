package tp03.ejercicio3;
import tp03.ejercicio1.*;
import tp02.ejercicio2.ListaEnlazadaGenerica;
public class ContadorArbol {
	private ArbolBinario<Integer> a;

	public ContadorArbol(ArbolBinario<Integer> a) {
		this.a = a;
	}
	private ListaEnlazadaGenerica<Integer> numerosParesRec(ListaEnlazadaGenerica<Integer> L, ArbolBinario<Integer> arbol){
		if((arbol.getDato()%2)==0) 
			L.agregarFinal(arbol.getDato());
		if (arbol.tieneHijoIzquierdo()) 
			L = numerosParesRec(L, arbol.getHijoIzquierdo());
		if (arbol.tieneHijoDerecho()) 
			L = numerosParesRec(L, arbol.getHijoDerecho());
		return L;
	}
	public ListaEnlazadaGenerica<Integer> numerosPares() {
		ListaEnlazadaGenerica<Integer> L = new ListaEnlazadaGenerica<Integer>();
		return numerosParesRec(L, this.a);
	}

}
