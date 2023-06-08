package tp04.ejercicio3;
import tp02.ejercicio2.*;
import tp04.ejercicio1.ArbolGeneral;

public class RecorridosAG {
	private void numerosImparesMayoresQuePreOrden (ListaGenerica<Integer> L,ArbolGeneral<Integer> a, Integer n) {
		ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
		hijos.comenzar();
		if ((a.getDato()>n)&&(a.getDato()%2!=0)){
			L.agregarFinal(a.getDato());
		}
		if (!hijos.esVacia()) 
			while (!hijos.fin())
				numerosImparesMayoresQuePreOrden (L,hijos.proximo(),n);
	}
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden (ArbolGeneral<Integer> a, Integer n){
			/**Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
			pasados como parámetros, recorrido en preorden.**/
		ListaGenerica<Integer> L = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQuePreOrden(L,a,n);
		return L;	
		}
	
	private void numerosImparesMayoresQueInOrden (ListaGenerica<Integer> L, ArbolGeneral<Integer> a, Integer n) {
		ListaGenerica<ArbolGeneral<Integer>> hijos= a.getHijos();
		hijos.comenzar();
		if(!hijos.esVacia()) {
			numerosImparesMayoresQueInOrden(L, hijos.proximo(), n);
		}
		if ((a.getDato()>n)&&(a.getDato()%2!=0))
			L.agregarFinal(a.getDato());
		while (!hijos.fin())
			numerosImparesMayoresQueInOrden(L, hijos.proximo(),n);
	}
	public ListaGenerica< Integer > numerosImparesMayoresQueInOrden (ArbolGeneral<Integer> a, Integer n){
		/**Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
			pasados como parámetros, recorrido en inorden.**/
		ListaGenerica<Integer> L = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQueInOrden(L, a, n);
		return L;
	}
	private void numerosImparesMayoresQuePostOrden (ListaGenerica<Integer> L, ArbolGeneral<Integer> a, Integer n) {
		ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
		hijos.comenzar();
		if (!hijos.esVacia()) {
			while(!hijos.fin())
				numerosImparesMayoresQuePostOrden(L, hijos.proximo(), n);
		}
		if ((a.getDato()>n)&&(a.getDato()%2!=0)) {
			L.agregarFinal(a.getDato());
		}
	}
	public ListaGenerica< Integer > numerosImparesMayoresQuePostOrden (ArbolGeneral<Integer> a, Integer n){
			/**Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
			pasados como parámetros recorrido en postorden**/
		ListaGenerica<Integer> L = new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQuePostOrden(L, a, n);
		return L;
	}
}
