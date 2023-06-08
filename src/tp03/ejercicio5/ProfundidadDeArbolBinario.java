package tp03.ejercicio5;
import tp03.ejercicio1.*;
public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> a;
	
	public ProfundidadDeArbolBinario(ArbolBinario<Integer> a) {
		this.a = a;
	}

	private int sumaEP(int p,int pa, ArbolBinario<Integer> arbol) {
		if (pa > p)
			return -1;
		int suma=arbol.getDato();
		if (pa<p) {
			if (arbol.tieneHijoDerecho())
				return suma +=sumaEP(p, pa+1, arbol.getHijoDerecho());
			if (arbol.tieneHijoIzquierdo())
				return suma += sumaEP(p, pa+1, arbol.getHijoIzquierdo());
		}
		return suma;
	}
	
	public int sumaElementosProfundidad(int p) {
		if (this.a.esVacio())
			return -1;
		int suma=0;
		int pActual=0;
		suma+=sumaEP(p, pActual, this.a);
		return suma;
	}
}
