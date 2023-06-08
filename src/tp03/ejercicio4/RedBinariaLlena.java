package tp03.ejercicio4;
import tp03.ejercicio1.*;
public class RedBinariaLlena<T> {
	private ArbolBinario<Integer> a;
	public RedBinariaLlena(ArbolBinario<Integer> a) {
		this.a=a;
	}
	private int retardoReenvioRec(ArbolBinario<Integer> arbol) {
		if (arbol.esHoja())
			return arbol.getDato();
		int valorHI = retardoReenvioRec(arbol.getHijoIzquierdo());
		int valorHD = retardoReenvioRec(arbol.getHijoDerecho());
		return Math.max(valorHI, valorHD);
	}
	public int retardoReenvio() {
		if (a.esHoja())
			return a.getDato();
		int valorHI = retardoReenvioRec(a.getHijoIzquierdo());
		int valorHD = retardoReenvioRec(a.getHijoDerecho());
		return Math.max(valorHI, valorHD);
	}
}
