package tp03.ejercicio1;
import tp02.ejercicio3.ColaGenerica;
public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho;

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		int cantHojas=0;
		if (this.esHoja()) {
			return 1;
		}else {
			if(this.tieneHijoDerecho()) cantHojas+= this.getHijoDerecho().contarHojas();
			if (this.tieneHijoIzquierdo()) cantHojas+= this.getHijoIzquierdo().contarHojas();
		} return (cantHojas);
	}
	

    public ArbolBinario<T> espejo() {
    	ArbolBinario<T> esp = new ArbolBinario<T>(this.getDato());
    	if (this.esVacio()) return null;
    	if (!this.esHoja()) {
    		if (this.tieneHijoDerecho()) {
    			esp.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
				}
    		if (this.tieneHijoIzquierdo()) {
    			esp.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
    		}}
    	return esp;
   
    	
	}

    public ColaGenerica<ArbolBinario<T>> recorridoPorNiveles(){
    	ArbolBinario<T> arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		ColaGenerica<ArbolBinario<T>> cola2 = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola2.encolar(this);
		cola.encolar(null);
		cola2.encolar(null);
		while (!cola.esVacia()) {
			arbol = cola.desencolar();
			if (arbol!=null) {
				//System.out.println(arbol.getDato());
				if (arbol.tieneHijoIzquierdo()) {
					cola.encolar(arbol.getHijoIzquierdo());
					cola2.encolar(arbol.getHijoIzquierdo());}
				if (arbol.tieneHijoDerecho()) {
					cola.encolar(arbol.getHijoDerecho());
					cola2.encolar(arbol.getHijoDerecho());}
				}
			else if (!cola.esVacia()) {
					cola.encolar(null);
					cola2.encolar(null);}
			}
		return cola2;
    }
    
    public int altura() {
    	if (this.esHoja())return 0;
    	int ri=0;
    	int rd=0;
    	if (this.tieneHijoIzquierdo()) {
    		ri=1+this.getHijoIzquierdo().altura();
    		}
    	if (this.tieneHijoDerecho()) {
    		rd=1+this.getHijoDerecho().altura();
    	}return Math.max(ri, rd);
    }
    
	public void entreNiveles(int n, int m){
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola=this.recorridoPorNiveles();
		int i=0;
		while (i<n) {
			while (cola.tope()!=null)
				cola.desencolar();
			i++;
		}
		while (i<=m) 
			if (cola.tope()!=  null) {
				System.out.print(cola.desencolar()+" - ");
			}else {
				cola.desencolar();
				i++;
				System.out.println();
			}
	}


	public void imprimir() {
		if (!(this.esVacio())) {
			System.out.print(this.toString());
			if (this.tieneHijoDerecho()) this.getHijoDerecho().imprimir();
			if (this.tieneHijoIzquierdo()) this.getHijoIzquierdo().imprimir();
		}
	}

}
