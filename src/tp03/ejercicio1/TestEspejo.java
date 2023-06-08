package tp03.ejercicio1;
public class TestEspejo {

	public static void main(String[] args) {
		ArbolBinario<Integer> a1= new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> a2= new ArbolBinario<Integer>(2);
		a1.agregarHijoIzquierdo(a2);
		ArbolBinario<Integer> a3= new ArbolBinario<Integer>(3);
		a1.agregarHijoDerecho(a3);
		ArbolBinario<Integer> a4= new ArbolBinario<Integer>(4);
		a2.agregarHijoIzquierdo(a4);
		ArbolBinario<Integer> a5= new ArbolBinario<Integer>(5);
		a2.agregarHijoDerecho(a5);
		ArbolBinario<Integer> a6= new ArbolBinario<Integer>(6);
		a3.agregarHijoIzquierdo(a6);
		/** a1.imprimir();
		System.out.println();
		a1.espejo().imprimir();
		System.out.println();
		System.out.print(a1.contarHojas()); **/
		a1.entreNiveles(0,2);

	}

}
